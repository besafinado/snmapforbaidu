package cn.softnado.Gwt.Map.Baidu.Client.Dom.Service;

import cn.softnado.Gwt.Map.Baidu.Client.Dom.Array;
import cn.softnado.Gwt.Map.Baidu.Client.Dom.Base.Point;
import cn.softnado.Gwt.Map.Baidu.Client.Dom.Overlay.Polyline;

import com.google.gwt.core.client.JavaScriptObject;

public class Route extends JavaScriptObject {
	protected Route() {

	}

	public final native int getNumSteps()
	/*-{
		return this.getNumSteps();
	}-*/;

	public final native Step getStep(int i)
	/*-{
		return this.getStep(i);
	}-*/;

	public final native String getDistanceAsString()
	/*-{
		return this.getDistance(true);
	}-*/;

	public final native double getDistanceAsDouble()
	/*-{
		return this.getDistance(false);
	}-*/;

	public final native int getIndex()
	/*-{
		return this.getIndex();
	}-*/;

	public final native Polyline getPolyline()
	/*-{
		return this.getPolyline();
	}-*/;

	public final native Array<Point> getPath()
	/*-{
		return this.getPath();
	}-*/;

	public final native RouteType getRouteType()
	/*-{
		return this.getRouteType();
	}-*/;
}
