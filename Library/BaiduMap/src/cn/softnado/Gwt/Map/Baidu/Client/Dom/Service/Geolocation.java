package cn.softnado.Gwt.Map.Baidu.Client.Dom.Service;

import cn.softnado.Gwt.Map.Baidu.Client.Dom.OneParamCallback;

import com.google.gwt.core.client.JavaScriptObject;

public class Geolocation extends JavaScriptObject {
	protected Geolocation() {

	}

	public static native Geolocation CreateInstance()
	/*-{
		return new $wnd.BMap.Geolocation();
	}-*/;

	public final native void getCurrentPosition(
			OneParamCallback<GeolocationResult> callback, PositionOptions opts)
	/*-{
		this.getCurrentPosition(function(res){
				callback && $entry(callback.@cn.softnado.Gwt.Map.Baidu.Client.Dom.OneParamCallback::onCallback(Ljava/lang/Object;)(res));
			},opts);
	}-*/;

	public final native void getCurrentPosition(
			OneParamCallback<GeolocationResult> callback)
	/*-{
		this.getCurrentPosition(function(res){
				callback && $entry(callback.@cn.softnado.Gwt.Map.Baidu.Client.Dom.OneParamCallback::onCallback(Ljava/lang/Object;)(res));
			});
	}-*/;

	public final native StatusCode getStatus()
	/*-{
		return this.getStatus();
	}-*/;

}
