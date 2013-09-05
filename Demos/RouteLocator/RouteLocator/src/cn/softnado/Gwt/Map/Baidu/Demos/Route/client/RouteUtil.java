package cn.softnado.Gwt.Map.Baidu.Demos.Route.client;

import cn.softnado.Gwt.Map.Baidu.Client.Dom.Base.Point;
import cn.softnado.Gwt.Map.Baidu.Demos.Route.shared.RoutePoint;

public class RouteUtil {
	public static RoutePoint PointToRoutePoint(Point point) {
		if (point != null) {
			return new RoutePoint(point.getLat(), point.getLng());
		}
		return null;
	}
}
