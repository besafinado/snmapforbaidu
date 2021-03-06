package cn.softnado.Gwt.Map.Baidu.Client.Dom.Service;

import cn.softnado.Gwt.Map.Baidu.Client.Dom.Array;
import cn.softnado.Gwt.Map.Baidu.Client.Dom.OneParamCallback;
import cn.softnado.Gwt.Map.Baidu.Client.Dom.TwoParamsCallback;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.dom.client.Element;

public class DrivingRouteOptions extends JavaScriptObject {
	protected DrivingRouteOptions() {

	}

	public static native DrivingRouteOptions CreateInstance(
			RenderOptions renderOptionsValue, DrivingPolicy policyValue,
			OneParamCallback<DrivingRouteResult> onSearchCompleteCallback,
			OneParamCallback<Array<LocalResultPoi>> onMarkersSetCallback,
			TwoParamsCallback<LocalResultPoi, Element> onInfoHtmlSetCallback,
			OneParamCallback<Array<Route>> onPolylinesSetCallback,
			OneParamCallback<Element> onResultsHtmlSetCallback)
	/*-{
		return {
			renderOptions:renderOptionsValue
			,policy:policyValue
			,onSearchComplete:function(results){
				onSearchCompleteCallback && $entry(onSearchCompleteCallback.@cn.softnado.Gwt.Map.Baidu.Client.Dom.OneParamCallback::onCallback(Ljava/lang/Object;)(results));
			}
			,onMarkersSet:function(pois){
				onMarkersSetCallback && $entry(onMarkersSetCallback.@cn.softnado.Gwt.Map.Baidu.Client.Dom.OneParamCallback::onCallback(Ljava/lang/Object;)(pois));
			}
			,onInfoHtmlSet:function(poi,html){
				onInfoHtmlSetCallback && $entry(onInfoHtmlSetCallback.@cn.softnado.Gwt.Map.Baidu.Client.Dom.TwoParamsCallback::onCallback(Ljava/lang/Object;Ljava/lang/Object;)(poi,html));
			}
			,onPolylinesSet:function(routes){
				onPolylinesSetCallback && $entry(onPolylinesSetCallback.@cn.softnado.Gwt.Map.Baidu.Client.Dom.OneParamCallback::onCallback(Ljava/lang/Object;)(routes));
			}
			,onResultsHtmlSet:function(container){
				onResultsHtmlSetCallback && $entry(onResultsHtmlSetCallback.@cn.softnado.Gwt.Map.Baidu.Client.Dom.OneParamCallback::onCallback(Ljava/lang/Object;)(container));
			}
		};
	}-*/;

	public final native RenderOptions getRenderOptions()
	/*-{
		return this.renderOptions;
	}-*/;

	public final native void setRenderOptions(RenderOptions renderOptionsValue)
	/*-{
		this.renderOptions = renderOptionsValue;
	}-*/;

	public final native DrivingPolicy getPolicy()
	/*-{
		return this.policy;
	}-*/;

	public final native void setPolicy(DrivingPolicy policyValue)
	/*-{
		this.policy = policyValue;
	}-*/;

}
