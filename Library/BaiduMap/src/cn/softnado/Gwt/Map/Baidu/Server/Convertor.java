package cn.softnado.Gwt.Map.Baidu.Server;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.commons.io.IOUtils;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.HttpStatus;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.impl.client.DefaultHttpClient;

import com.google.gson.Gson;

import cn.softnado.Gwt.Map.Baidu.Shared.Dom.Base.IPoint;

public class Convertor {
	public final static Pattern REGEXP_TRANSLATE_SINGNLE_RESPONSE = Pattern
			.compile("^BMapConvertorCallback&&BMapConvertorCallback\\((\\{.+\\})\\)$");
	public final static Pattern REGEXP_TRANSLATE_MULTIPLE_RESPONSE = Pattern
			.compile("^BMapConvertorCallback&&BMapConvertorCallback\\((\\[.+\\])\\)$");
	public final static int MAX_MULTIPLE_CONVERT_COUNT = 20;

	public static IPoint Translate(IPoint point, TranslateType type) {
		if (point == null) {
			return null;
		}
		try {
			HttpClient httpClient = new DefaultHttpClient();
			URIBuilder uriBuilder = new URIBuilder();
			uriBuilder.setScheme("http").setHost("api.map.baidu.com")
					.setPath("/ag/coord/convert")
					.setParameter("from", Integer.toString(type.getValue()))
					.setParameter("to", "4")
					.setParameter("x", Double.toString(point.getLng()))
					.setParameter("y", Double.toString(point.getLat()))
					.setParameter("callback", "BMapConvertorCallback");
			HttpGet get = new HttpGet(uriBuilder.build());
			HttpResponse response = httpClient.execute(get);
			HttpEntity entity = null;
			if (response.getStatusLine() != null
					&& response.getStatusLine().getStatusCode() == HttpStatus.SC_OK
					&& (entity = response.getEntity()) != null) {
				String resContent = IOUtils.toString(entity.getContent());
				System.out.println(resContent);
				Matcher matcher = null;
				if ((matcher = REGEXP_TRANSLATE_SINGNLE_RESPONSE
						.matcher(resContent)) != null && matcher.matches()) {
					String jsonResult = matcher.group(1);
					System.out.println(jsonResult);
					Gson gson = new Gson();
					TranslateResult result = gson.fromJson(jsonResult,
							TranslateResult.class);
					System.out.println(result.getLng() + "," + result.getLat());
					return result;
				}
			}
		} catch (Exception ex) {
		}
		return null;
	}

	public static IPoint[] Translate(TranslateType type, IPoint... points) {
		if (points.length == 0) {
			return null;
		}
		StringBuilder xBuilder = new StringBuilder();
		StringBuilder yBuilder = new StringBuilder();
		ArrayList<IPoint> results = new ArrayList<IPoint>();

		for (int index = 0; index < points.length; index++) {
			xBuilder.append(Double.toString(points[index].getLng()));
			yBuilder.append(Double.toString(points[index].getLat()));

			if ((index > 0 && index % MAX_MULTIPLE_CONVERT_COUNT == 0)
					|| index == points.length - 1) {
				try {
					HttpClient httpClient = new DefaultHttpClient();
					URIBuilder uriBuilder = new URIBuilder();

					uriBuilder
							.setScheme("http")
							.setHost("api.map.baidu.com")
							.setPath("/ag/coord/convert")
							.setParameter("from",
									Integer.toString(type.getValue()))
							.setParameter("mode", "1").setParameter("to", "4")
							.setParameter("x", xBuilder.toString())
							.setParameter("y", yBuilder.toString())
							.setParameter("callback", "BMapConvertorCallback");
					HttpGet get = new HttpGet(uriBuilder.build());
					HttpResponse response = httpClient.execute(get);
					HttpEntity entity = null;
					if (response.getStatusLine() != null
							&& response.getStatusLine().getStatusCode() == HttpStatus.SC_OK
							&& (entity = response.getEntity()) != null) {
						String resContent = IOUtils.toString(entity
								.getContent());
						System.out.println(resContent);
						Matcher matcher = null;
						if ((matcher = REGEXP_TRANSLATE_MULTIPLE_RESPONSE
								.matcher(resContent)) != null
								&& matcher.matches()) {
							String jsonResult = matcher.group(1);
							System.out.println(jsonResult);
							Gson gson = new Gson();
							TranslateResult[] partResults = gson
									.fromJson(jsonResult,
											TranslateResult[].class);
							for (int index0 = 0; index0 < partResults.length; index0++) {
								results.add(partResults[index0]);
							}
						}
					}
				} catch (Exception ex) {
					System.err.println(ex.getStackTrace());
				}
				xBuilder = new StringBuilder();
				yBuilder = new StringBuilder();

			} else {
				xBuilder.append(',');
				yBuilder.append(',');
			}
		}
		IPoint[] resultArray = new IPoint[results.size()];
		return results.toArray(resultArray);
	}
}
