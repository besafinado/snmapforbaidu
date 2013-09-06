package cn.softnado.Gwt.Map.Baidu.Client.Dom.Service;

import cn.softnado.Gwt.Map.Baidu.Client.Dom.Array;
import cn.softnado.Gwt.Map.Baidu.Client.Dom.OneParamCallback;
import cn.softnado.Gwt.Map.Baidu.Client.Dom.TwoParamsCallback;
import cn.softnado.Gwt.Map.Baidu.Client.Dom.Base.Point;
import cn.softnado.Gwt.Map.Baidu.Client.Dom.Core.Map;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.dom.client.Element;

public class TransitRoute extends JavaScriptObject {
	protected TransitRoute() {

	}

	public static native TransitRoute CreateInstance(Map location,
			TransitRouteOptions opts)
	/*-{
		return new $wnd.BMap.TransitRoute(location,opts);
	}-*/;

	public static native TransitRoute CreateInstance(Map location)
	/*-{
		return new $wnd.BMap.TransitRoute(location);
	}-*/;

	public static native TransitRoute CreateInstance(String location,
			TransitRouteOptions opts)
	/*-{
		return new $wnd.BMap.TransitRoute(location,opts);
	}-*/;

	public static native TransitRoute CreateInstance(String location)
	/*-{
		return new $wnd.BMap.TransitRoute(location);
	}-*/;

	public static native TransitRoute CreateInstance(Point location,
			TransitRouteOptions opts)
	/*-{
		return new $wnd.BMap.TransitRoute(location,opts);
	}-*/;

	public static native TransitRoute CreateInstance(Point location)
	/*-{
		return new $wnd.BMap.TransitRoute(location);
	}-*/;

	public final native void Search(String start, String end)
	/*-{
		this.search(start,end);
	}-*/;

	public final native void Search(String start, Point end)
	/*-{
		this.search(start,end);
	}-*/;

	public final native void Search(String start, LocalResultPoi end)
	/*-{
		this.search(start,end);
	}-*/;

	public final native void Search(Point start, Point end)
	/*-{
		this.search(start,end);
	}-*/;

	public final native void Search(Point start, String end)
	/*-{
		this.search(start,end);
	}-*/;

	public final native void Search(Point start, LocalResultPoi end)
	/*-{
		this.search(start,end);
	}-*/;

	public final native void Search(LocalResultPoi start, LocalResultPoi end)
	/*-{
		this.search(start,end);
	}-*/;

	public final native void Search(LocalResultPoi start, String end)
	/*-{
		this.search(start,end);
	}-*/;

	public final native void Search(LocalResultPoi start, Point end)
	/*-{
		this.search(start,end);
	}-*/;

	public final native TransitRouteResult getResults()
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

	public final native void setPageCapacity(int pageCapacityValue)
	/*-{
		this.setPageCapacity(pageCapacityValue);
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

	public final native void setPolicy(TransitPolicy policy)
	/*-{
		this.setPolicy(policy);
	}-*/;

	public final native void setSearchCompleteCallback(
			OneParamCallback<TransitRouteResult> callback)
	/*-{
		this.setSearchCompleteCallback(function(results){
				callback && $entry(callback.@cn.softnado.Gwt.Map.Baidu.Client.Dom.OneParamCallback::onCallback(Ljava/lang/Object;)(results));
			});
	}-*/;

	public final native void setMarkersSetCallback(
			TwoParamsCallback<Array<LocalResultPoi>, Array<LocalResultPoi>> callback)
	/*-{
		this.setSearchCompleteCallback(function(pois,transfers){
				callback && $entry(callback.@cn.softnado.Gwt.Map.Baidu.Client.Dom.TwoParamsCallback::onCallback(Ljava/lang/Object;Ljava/lang/Object;)(pois,transfers));
			});
	}-*/;

	public final native void setInfoHtmlSetCallback(
			TwoParamsCallback<LocalResultPoi, Element> callback)
	/*-{
		this.setSearchCompleteCallback(function(poi,html){
				callback && $entry(callback.@cn.softnado.Gwt.Map.Baidu.Client.Dom.TwoParamsCallback::onCallback(Ljava/lang/Object;Ljava/lang/Object;)(poi,html));
			});
	}-*/;

	public final native void setPolylinesSetCallback(
			TwoParamsCallback<Array<Line>, Array<Route>> callback)
	/*-{
		this.setSearchCompleteCallback(function(lines,routes){
				callback && $entry(callback.@cn.softnado.Gwt.Map.Baidu.Client.Dom.TwoParamsCallback::onCallback(Ljava/lang/Object;Ljava/lang/Object;)(lines,routes));
			});
	}-*/;

	public final native void setResultsHtmlSetCallback(
			OneParamCallback<Element> callback)
	/*-{
		this.setSearchCompleteCallback(function(container){
				callback && $entry(callback.@cn.softnado.Gwt.Map.Baidu.Client.Dom.OneParamCallback::onCallback(Ljava/lang/Object;)(container));
			});
	}-*/;

	public final native StatusCode getStatus()
	/*-{
		return this.getStatus();
	}-*/;

}
