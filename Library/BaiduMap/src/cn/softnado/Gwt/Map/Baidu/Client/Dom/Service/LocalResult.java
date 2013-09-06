package cn.softnado.Gwt.Map.Baidu.Client.Dom.Service;

import cn.softnado.Gwt.Map.Baidu.Client.Dom.Array;
import cn.softnado.Gwt.Map.Baidu.Client.Dom.Base.Bounds;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArrayString;

public class LocalResult extends JavaScriptObject {
	protected LocalResult() {

	}

	public static class CityNode extends JavaScriptObject {
		protected CityNode() {

		}

		public final native String getCity()
		/*-{
			return this.city;
		}-*/;

		public final native int getNumResults()
		/*-{
			return this.numResults;
		}-*/;

	}

	public final native JsArrayString getSuggestions()
	/*-{
		return this.suggestions;
	}-*/;

	public final native String getProvince()
	/*-{
		return this.province;
	}-*/;

	public final native String getMoreResultsUrl()
	/*-{
		return this.moreResultsUrl;
	}-*/;

	public final native String getCity()
	/*-{
		return this.city;
	}-*/;

	public final native Bounds getBounds()
	/*-{
		return this.bounds;
	}-*/;

	public final native double getRadius()
	/*-{
		return this.radius;
	}-*/;

	public final native LocalResultPoi getCenter()
	/*-{
		return this.center;
	}-*/;

	public final native String getKeyword()
	/*-{
		return this.keyword;
	}-*/;

	public final native LocalResultPoi getPoi(int i)
	/*-{
		return this.getPoi(i);
	}-*/;

	public final native int getCurrentNumPois()
	/*-{
		return this.getCurrentNumPois();
	}-*/;

	public final native int getNumPois()
	/*-{
		return this.getNumPois();
	}-*/;

	public final native int getNumPages()
	/*-{
		return this.getNumPages();
	}-*/;

	public final native double getPageIndex()
	/*-{
		return this.getPageIndex();
	}-*/;

	public final native Array<CityNode> getCityList()
	/*-{
		return this.getCityList();
	}-*/;

}
