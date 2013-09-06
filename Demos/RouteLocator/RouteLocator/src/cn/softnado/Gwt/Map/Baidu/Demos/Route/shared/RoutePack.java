package cn.softnado.Gwt.Map.Baidu.Demos.Route.shared;

import java.io.Serializable;
import java.util.ArrayList;

import com.google.gwt.user.client.rpc.IsSerializable;

public class RoutePack implements Serializable, IsSerializable {

	/**
	 * 搴忓垪鍖朓D
	 */
	private static final long serialVersionUID = 6913827862259325814L;
	private ArrayList<RoutePoint> _markers;
	private ArrayList<RoutePath> _routes;

	public RoutePack() {
		_markers = new ArrayList<RoutePoint>();
		_routes = new ArrayList<RoutePath>();
	}

	public ArrayList<RoutePoint> getMarkers() {
		return _markers;
	}

	public void setMarkers(ArrayList<RoutePoint> _markers) {
		this._markers = _markers;
	}

	public ArrayList<RoutePath> getRoutes() {
		return _routes;
	}

	public void setRoutes(ArrayList<RoutePath> _routes) {
		this._routes = _routes;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("{ markers:[");
		for (int index = 0; index < _markers.size(); index++) {
			builder.append(_markers.get(index).toString());
			if (index < _markers.size() - 1) {
				builder.append(", ");
			}
		}

		builder.append("], routes:[");

		for (int index = 0; index < _routes.size(); index++) {
			builder.append(_routes.get(index).toString());
			if (index < _routes.size() - 1) {
				builder.append(", ");
			}
		}

		builder.append("] }");

		return builder.toString();
	}
}
