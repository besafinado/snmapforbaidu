package cn.softnado.Gwt.Map.Baidu.Client.Dom.Service;

import cn.softnado.Gwt.Map.Baidu.Client.Dom.Array;
import cn.softnado.Gwt.Map.Baidu.Client.Dom.OneParamCallback;
import cn.softnado.Gwt.Map.Baidu.Client.Dom.Base.Point;
import cn.softnado.Gwt.Map.Baidu.Client.Dom.Core.Map;
import cn.softnado.Gwt.Map.Baidu.Client.Dom.Overlay.Marker;
import cn.softnado.Gwt.Map.Baidu.Client.Dom.Overlay.Polyline;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.dom.client.Element;

public class BusLineSearch extends JavaScriptObject {
	protected BusLineSearch() {

	}

	public static native BusLineSearch CreateInstance(Map location,
			BusLineSearchOptions opts)
	/*-{
		return new $wnd.BMap.BusLineSearch(location,opts);
	}-*/;

	public static native BusLineSearch CreateInstance(Map location)
	/*-{
		return new $wnd.BMap.BusLineSearch(location);
	}-*/;

	public static native BusLineSearch CreateInstance(String location,
			BusLineSearchOptions opts)
	/*-{
		return new $wnd.BMap.BusLineSearch(location,opts);
	}-*/;

	public static native BusLineSearch CreateInstance(String location)
	/*-{
		return new $wnd.BMap.BusLineSearch(location);
	}-*/;

	public static native BusLineSearch CreateInstance(Point location,
			BusLineSearchOptions opts)
	/*-{
		return new $wnd.BMap.BusLineSearch(location,opts);
	}-*/;

	public static native BusLineSearch CreateInstance(Point location)
	/*-{
		return new $wnd.BMap.BusLineSearch(location);
	}-*/;

	public final native DrivingRouteResult getResults()
	/*-{
		return this.getResults();
	}-*/;

	public final native void ClearResults()
	/*-{
		this.clearResults();
	}-*/;

	public final native void EnableAutoViewport()
	/*-{
		this.enableAutoViewport();
	}-*/;

	public final native void DisableAutoViewport()
	/*-{
		this.disableAutoViewport();
	}-*/;

	public final native void setLocation(Map location)
	/*-{
		this.setLocation(location);
	}-*/;

	public final native void setLocation(Point location)
	/*-{
		this.setLocation(location);
	}-*/;

	public final native void setLocation(String location)
	/*-{
		this.setLocation(location);
	}-*/;

	public final native void setGetBusListCompleteCallback(
			OneParamCallback<BusListResult> callback)
	/*-{
		this.setSearchCompleteCallback(function(rs){
				callback && $entry(callback.@cn.softnado.Gwt.Map.Baidu.Client.Dom.OneParamCallback::onCallback(Ljava/lang/Object;)(rs));
			});
	}-*/;

	public final native void setGetBusLineCompleteCallback(
			OneParamCallback<BusLine> callback)
	/*-{
		this.setSearchCompleteCallback(function(rs){
				callback && $entry(callback.@cn.softnado.Gwt.Map.Baidu.Client.Dom.OneParamCallback::onCallback(Ljava/lang/Object;)(rs));
			});
	}-*/;

	public final native void setBusListHtmlSetCallback(
			OneParamCallback<Element> callback)
	/*-{
		this.setSearchCompleteCallback(function(container){
				callback && $entry(callback.@cn.softnado.Gwt.Map.Baidu.Client.Dom.OneParamCallback::onCallback(Ljava/lang/Object;)(container));
			});
	}-*/;

	public final native void setBusLineHtmlSetCallback(
			OneParamCallback<Element> callback)
	/*-{
		this.setSearchCompleteCallback(function(container){
				callback && $entry(callback.@cn.softnado.Gwt.Map.Baidu.Client.Dom.OneParamCallback::onCallback(Ljava/lang/Object;)(container));
			});
	}-*/;

	public final native void setPolylinesSetCallback(
			OneParamCallback<Polyline> callback)
	/*-{
		this.setSearchCompleteCallback(function(ply){
				callback && $entry(callback.@cn.softnado.Gwt.Map.Baidu.Client.Dom.OneParamCallback::onCallback(Ljava/lang/Object;)(ply));
			});
	}-*/;

	public final native void setMarkersSetCallback(
			OneParamCallback<Array<Marker>> callback)
	/*-{
		this.setSearchCompleteCallback(function(sts){
				callback && $entry(callback.@cn.softnado.Gwt.Map.Baidu.Client.Dom.OneParamCallback::onCallback(Ljava/lang/Object;)(sts));
			});
	}-*/;

	public final native StatusCode getStatus()
	/*-{
		return this.getStatus();
	}-*/;

}
