package cn.softnado.Gwt.Map.Baidu.Demos.Route.client;

import cn.softnado.Gwt.Map.Baidu.Client.Dom.Base.Point;

public class RouteSearchNode {
	public Point Start;
	public Point End;

	public RouteSearchNode(Point start, Point end) {
		this.Start = start;
		this.End = end;
	}
}