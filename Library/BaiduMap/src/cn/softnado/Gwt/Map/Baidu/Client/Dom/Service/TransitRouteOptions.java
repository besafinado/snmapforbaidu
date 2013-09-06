package cn.softnado.Gwt.Map.Baidu.Client.Dom.Service;

import cn.softnado.Gwt.Map.Baidu.Client.Dom.Array;
import cn.softnado.Gwt.Map.Baidu.Client.Dom.OneParamCallback;
import cn.softnado.Gwt.Map.Baidu.Client.Dom.TwoParamsCallback;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.dom.client.Element;

public class TransitRouteOptions extends JavaScriptObject {
	protected TransitRouteOptions() {

	}

	public static native TransitRouteOptions CreateInstance(
			RenderOptions renderOptionsValue,
			TransitPolicy policyValue,
			int pageCapacityValue,
			OneParamCallback<TransitRouteResult> onSearchCompleteCallback,
			TwoParamsCallback<Array<LocalResultPoi>, Array<LocalResultPoi>> onMarkersSetCallback,
			TwoParamsCallback<LocalResultPoi, Element> onInfoHtmlSetCallback,
			TwoParamsCallback<Array<Line>, Array<Route>> onPolylinesSetCallback,
			OneParamCallback<Element> onResultsHtmlSetCallback)
	/*-{
		return {
			renderOptions:renderOptionsValue
			,policy:policyValue
			,pageCapacity:pageCapacityValue
			,onSearchComplete:function(results){
				onSearchCompleteCallback && $entry(onSearchCompleteCallback.@cn.softnado.Gwt.Map.Baidu.Client.Dom.OneParamCallback::onCallback(Ljava/lang/Object;)(results));
			}
			,onMarkersSet:function(pois,transfers){
				onMarkersSetCallback && $entry(onMarkersSetCallback.@cn.softnado.Gwt.Map.Baidu.Client.Dom.TwoParamsCallback::onCallback(Ljava/lang/Object;Ljava/lang/Object;)(pois,transfers));
			}
			,onInfoHtmlSet:function(poi,html){
				onInfoHtmlSetCallback && $entry(onInfoHtmlSetCallback.@cn.softnado.Gwt.Map.Baidu.Client.Dom.TwoParamsCallback::onCallback(Ljava/lang/Object;Ljava/lang/Object;)(poi,html));
			}
			,onPolylinesSet:function(lines,routes){
				onPolylinesSetCallback && $entry(onPolylinesSetCallback.@cn.softnado.Gwt.Map.Baidu.Client.Dom.TwoParamsCallback::onCallback(Ljava/lang/Object;Ljava/lang/Object;)(lines,routes));
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

	public final native TransitPolicy getPolicy()
	/*-{
		return this.policy;
	}-*/;

	public final native void setPolicy(TransitPolicy policyValue)
	/*-{
		this.policy = policyValue;
	}-*/;

	public final native int getPageCapacity()
	/*-{
		return this.pageCapacity;
	}-*/;

	public final native void setPageCapacity(int pageCapacityValue)
	/*-{
		this.pageCapacity = pageCapacityValue;
	}-*/;

}
