package cn.softnado.Gwt.Map.Baidu.Client.Dom.Service;

import cn.softnado.Gwt.Map.Baidu.Client.Dom.Array;

import com.google.gwt.core.client.JavaScriptObject;

public class RoutePlan extends JavaScriptObject {
	protected RoutePlan() {

	}

	public final native int getNumRoutes()
	/*-{
		return this.getNumRoutes();
	}-*/;

	public final native Route getRoute(int i)
	/*-{
		return this.getRoute(i);
	}-*/;

	public final native String getDistanceAsString()
	/*-{
		return this.getDistance(true);
	}-*/;

	public final native double getDistanceAsDouble()
	/*-{
		return this.getDistance(false);
	}-*/;

	public final native String getDurationAsDateString()
	/*-{
		return this.getDuration(true);
	}-*/;

	public final native double getDurationAsSeconds()
	/*-{
		return this.getDuration(false);
	}-*/;

	public final native Array<LocalResultPoi> getDragPois()
	/*-{
		return this.getDragPois();
	}-*/;
}
