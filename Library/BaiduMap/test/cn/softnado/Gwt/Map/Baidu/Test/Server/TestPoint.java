package cn.softnado.Gwt.Map.Baidu.Test.Server;

import cn.softnado.Gwt.Map.Baidu.Shared.Dom.Base.IPoint;

public class TestPoint implements IPoint {

	public TestPoint(double lng, double lat) {
		this.lngStub = lng;
		this.latStub = lat;
	}

	public TestPoint() {
		this(0, 0);
	}

	private double lngStub;
	private double latStub;

	@Override
	public double getLng() {
		return lngStub;
	}

	@Override
	public void setLng(double value) {
		this.lngStub = value;
	}

	@Override
	public double getLat() {
		return this.latStub;
	}

	@Override
	public void setLat(double value) {
		this.latStub = value;
	}
}
