package cn.softnado.Gwt.Map.Baidu.Client.Dom.Service;

import cn.softnado.Gwt.Map.Baidu.Client.Dom.Array;
import cn.softnado.Gwt.Map.Baidu.Client.Dom.OneParamCallback;
import cn.softnado.Gwt.Map.Baidu.Client.Dom.Overlay.Marker;
import cn.softnado.Gwt.Map.Baidu.Client.Dom.Overlay.Polyline;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.dom.client.Element;

public class BusLineSearchOptions extends JavaScriptObject {
	protected BusLineSearchOptions() {

	}

	public static native DrivingRouteOptions CreateInstance(
			RenderOptions renderOptionsValue,
			OneParamCallback<BusListResult> onGetBusListCompleteCallback,
			OneParamCallback<BusLine> onGetBusLineCompleteCallback,
			OneParamCallback<Element> onBusListHtmlSetCallback,
			OneParamCallback<Element> onBusLineHtmlSetCallback,
			OneParamCallback<Polyline> onPolylinesSetCallback,
			OneParamCallback<Array<Marker>> onMarkersSetCallback)
	/*-{
		return {
			renderOptions:renderOptionsValue
			,onGetBusListComplete:function(rs){
				onGetBusListCompleteCallback && $entry(onGetBusListCompleteCallback.@cn.softnado.Gwt.Map.Baidu.Client.Dom.OneParamCallback::onCallback(Ljava/lang/Object;)(rs));
			}
			,onGetBusLineComplete:function(rs){
				onGetBusLineCompleteCallback && $entry(onGetBusLineCompleteCallback.@cn.softnado.Gwt.Map.Baidu.Client.Dom.OneParamCallback::onCallback(Ljava/lang/Object;)(rs));
			}
			,onBusListHtmlSet:function(container){
				onBusListHtmlSetCallback && $entry(onBusListHtmlSetCallback.@cn.softnado.Gwt.Map.Baidu.Client.Dom.OneParamCallback::onCallback(Ljava/lang/Object;)(container));
			}
			,onBusLineHtmlSet:function(container){
				onBusLineHtmlSetCallback && $entry(onBusLineHtmlSetCallback.@cn.softnado.Gwt.Map.Baidu.Client.Dom.OneParamCallback::onCallback(Ljava/lang/Object;)(container));
			}
			,onPolylinesSet:function(ply){
				onPolylinesSetCallback && $entry(onPolylinesSetCallback.@cn.softnado.Gwt.Map.Baidu.Client.Dom.OneParamCallback::onCallback(Ljava/lang/Object;)(ply));
			}
			,onMarkersSet:function(sts){
				onMarkersSetCallback && $entry(onMarkersSetCallback.@cn.softnado.Gwt.Map.Baidu.Client.Dom.OneParamCallback::onCallback(Ljava/lang/Object;)(sts));
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

}
