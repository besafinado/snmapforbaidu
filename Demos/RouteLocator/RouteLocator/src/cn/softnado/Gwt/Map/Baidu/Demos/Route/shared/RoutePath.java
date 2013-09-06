package cn.softnado.Gwt.Map.Baidu.Demos.Route.shared;

import java.io.Serializable;
import java.util.ArrayList;

import com.google.gwt.user.client.rpc.IsSerializable;

public class RoutePath implements Serializable, IsSerializable {

	/**
	 * 搴忓垪鍖朓D
	 */
	private static final long serialVersionUID = 7511491025270761396L;

	private RoutePoint _start;
	private RoutePoint _end;
	private double _distance;
	private ArrayList<RoutePoint> _path;

	public RoutePath() {
		_path = new ArrayList<RoutePoint>();
	}

	public RoutePoint getStart() {
		return _start;
	}

	public void setStart(RoutePoint _start) {
		this._start = _start;
	}

	public RoutePoint getEnd() {
		return _end;
	}

	public void setEnd(RoutePoint _end) {
		this._end = _end;
	}

	public double getDistance() {
		return _distance;
	}

	public void setDistance(double _distance) {
		this._distance = _distance;
	}

	public ArrayList<RoutePoint> getPath() {
		return _path;
	}

	public void setPath(ArrayList<RoutePoint> _path) {
		this._path = _path;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("{ start:" + _start.toString() + ", end:"
				+ _end.toString() + ", distance:" + _distance + ", path:[");
		for (int index = 0; index < _path.size(); index++) {
			builder.append(_path.get(index).toString());
			if (index < _path.size() - 1) {
				builder.append(", ");
			}
		}
		builder.append("] }");
		return builder.toString();
	}
}
