package cn.softnado.Gwt.Map.Baidu.Client.Dom.Service;

import cn.softnado.Gwt.Map.Baidu.Client.Dom.Array;
import cn.softnado.Gwt.Map.Baidu.Client.Dom.Base.Point;
import cn.softnado.Gwt.Map.Baidu.Client.Dom.Overlay.Polyline;

import com.google.gwt.core.client.JavaScriptObject;

public class BusLine extends JavaScriptObject {
	protected BusLine() {

	}

	public final native String getName()
	/*-{
		return this.name;
	}-*/;

	public final native String getStartTime()
	/*-{
		return this.startTime;
	}-*/;

	public final native String getEndTime()
	/*-{
		return this.endTime;
	}-*/;

	public final native String getCompany()
	/*-{
		return this.company;
	}-*/;

	public final native int getNumBusStations()
	/*-{
		return this.getNumBusStations();
	}-*/;

	public final native BusStation getBusStation(int i)
	/*-{
		return this.getBusStation(i);
	}-*/;

	public final native Array<Point> getPath()
	/*-{
		return this.getPath();
	}-*/;

	public final native Polyline getPolyline()
	/*-{
		return this.getPolyline();
	}-*/;

}
