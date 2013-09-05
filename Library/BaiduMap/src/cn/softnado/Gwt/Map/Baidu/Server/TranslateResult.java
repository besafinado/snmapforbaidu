package cn.softnado.Gwt.Map.Baidu.Server;

import org.apache.commons.codec.binary.Base64;

import cn.softnado.Gwt.Map.Baidu.Shared.Dom.Base.IPoint;

public class TranslateResult implements IPoint {
	private TranslateResult() {

	}

	private int error;
	private String x;
	private String y;

	public boolean IsError() {
		return this.error != 0;
	}

	@Override
	public double getLng() {
		return Double.parseDouble(new String(Base64.decodeBase64(this.x
				.getBytes())));
	}

	@Override
	public void setLng(double value) {
		this.x = new String(Base64.encodeBase64(Double.toString(value)
				.getBytes()));
	}

	@Override
	public double getLat() {
		return Double.parseDouble(new String(Base64.decodeBase64(this.y
				.getBytes())));
	}

	@Override
	public void setLat(double value) {
		this.y = new String(Base64.encodeBase64(Double.toString(value)
				.getBytes()));
	}

}
