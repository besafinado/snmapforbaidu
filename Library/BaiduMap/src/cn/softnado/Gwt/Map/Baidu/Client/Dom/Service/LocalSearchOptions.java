package cn.softnado.Gwt.Map.Baidu.Client.Dom.Service;

import cn.softnado.Gwt.Map.Baidu.Client.Dom.Array;
import cn.softnado.Gwt.Map.Baidu.Client.Dom.OneParamCallback;
import cn.softnado.Gwt.Map.Baidu.Client.Dom.TwoParamsCallback;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.dom.client.Element;

public class LocalSearchOptions extends JavaScriptObject {
	protected LocalSearchOptions() {

	}

	public static native LocalSearchOptions CreateInstance(
			RenderOptions renderOptionsValue,
			OneParamCallback<Array<LocalResultPoi>> onMarkersSetCallback,
			TwoParamsCallback<LocalResultPoi, Element> onInfoHtmlSetCallback,
			OneParamCallback<Element> onResultsHtmlSetCallback,
			int pageCapacityValue,
			OneParamCallback<Array<LocalResult>> onSearchCompleteCallback)
	/*-{
		return {
			renderOptions:renderOptionsValue
			,onMarkersSet:function(pois){
				onMarkersSetCallback && $entry(onMarkersSetCallback.@cn.softnado.Gwt.Map.Baidu.Client.Dom.OneParamCallback::onCallback(Ljava/lang/Object;)(pois));
			}
			,onInfoHtmlSet:function(poi,html){
				onInfoHtmlSetCallback && $entry(onInfoHtmlSetCallback.@cn.softnado.Gwt.Map.Baidu.Client.Dom.TwoParamsCallback::onCallback(Ljava/lang/Object;Ljava/lang/Object;)(poi,html));				
			}
			,onResultsHtmlSet:function(container){
				onResultsHtmlSetCallback && $entry(onResultsHtmlSetCallback.@cn.softnado.Gwt.Map.Baidu.Client.Dom.OneParamCallback::onCallback(Ljava/lang/Object;)(container));				
			}
			,pageCapacity:pageCapacityValue
			,onSearchComplete:function(results){
				var resultsArray = null;
				if(Object.prototype.toString.apply(results) === '[object Array]'){
					resultsArray = results;
				}else{
					resultsArray = new Array();
					resultsArray.push(results);
				}
				onSearchCompleteCallback && $entry(onSearchCompleteCallback.@cn.softnado.Gwt.Map.Baidu.Client.Dom.OneParamCallback::onCallback(Ljava/lang/Object;)(resultsArray));
			}
		};
	}-*/;

	public final native int getPageCapacity()
	/*-{
		return this.pageCapacity;
	}-*/;

	public final native void setPageCapacity(int pageCapacityValue)
	/*-{
		this.pageCapacity = pageCapacityValue;
	}-*/;

	public final native RenderOptions getRenderOptions()
	/*-{
		return this.renderOptions;
	}-*/;

	public final native void setRenderOptions(RenderOptions renderOptionsValue)
	/*-{
		this.renderOptions = renderOptionsValue;
	}-*/;

}
