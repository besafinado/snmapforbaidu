package cn.softnado.Gwt.Map.Baidu.Demos.Route.shared;

import java.io.Serializable;

import com.google.gwt.user.client.rpc.IsSerializable;

public class RoutePoint implements Serializable, IsSerializable {
	/**
	 * 搴忓垪鍖栧鐞咺D
	 */
	private static final long serialVersionUID = -181591273341927850L;
	private double _lat;
	private double _lng;

	public RoutePoint() {
		_lat = -1;
		_lng = -1;
	}

	public RoutePoint(double lat, double lng) {
		_lat = lat;
		_lng = lng;
	}

	public double getLat() {
		return _lat;
	}

	public double getLng() {
		return _lng;
	}

	public void setLat(double lat) {
		_lat = lat;
	}

	public void setLng(double lng) {
		_lng = lng;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj != null && obj instanceof RoutePoint) {
			RoutePoint targetPoint = (RoutePoint) obj;
			return targetPoint._lat == this._lat
					&& targetPoint._lng == this._lng;
		} else {
			return false;
		}
	}

	@Override
	public String toString() {
		return "{ lat:" + _lat + ", lng:" + _lng + " }";
	}
}
