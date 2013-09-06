package cn.softnado.Gwt.Map.Baidu.Client.Dom.Service;

import cn.softnado.Gwt.Map.Baidu.Client.Dom.Array;
import cn.softnado.Gwt.Map.Baidu.Client.Dom.Base.Point;
import cn.softnado.Gwt.Map.Baidu.Client.Dom.Overlay.Polyline;

import com.google.gwt.core.client.JavaScriptObject;

public class Line extends JavaScriptObject {
	protected Line() {

	}

	public final native String getTitle()
	/*-{
		return this.title;
	}-*/;

	public final native LineType getType()
	/*-{
		return this.type;
	}-*/;

	public final native int getNumViaStops()
	/*-{
		return this.getNumViaStops();
	}-*/;

	public final native LocalResultPoi getGetOnStop()
	/*-{
		return this.getGetOnStop();
	}-*/;

	public final native LocalResultPoi getGetOffStop()
	/*-{
		return this.getGetOffStop();
	}-*/;

	public final native Array<Point> getPath()
	/*-{
		return this.getPath();
	}-*/;

	public final native Polyline getPolyline()
	/*-{
		return this.getPolyline();
	}-*/;

	public final native String getDistanceAsString()
	/*-{
		return this.getDistance(true);
	}-*/;

	public final native double getDistanceAsDouble()
	/*-{
		return this.getDistance(false);
	}-*/;
}
