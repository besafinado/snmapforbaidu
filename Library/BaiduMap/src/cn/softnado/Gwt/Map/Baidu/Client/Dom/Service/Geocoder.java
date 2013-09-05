package cn.softnado.Gwt.Map.Baidu.Client.Dom.Service;

import cn.softnado.Gwt.Map.Baidu.Client.Dom.OneParamCallback;
import cn.softnado.Gwt.Map.Baidu.Client.Dom.Base.Point;

import com.google.gwt.core.client.JavaScriptObject;

public class Geocoder extends JavaScriptObject {
	protected Geocoder() {

	}

	public static native Geocoder CreateInstance()
	/*-{
		return new $wnd.BMap.Geocoder();
	}-*/;

	public final native void getPoint(String address,
			OneParamCallback<Point> callback, String city)
	/*-{
		this.getPoint(address,function(point){
			callback && $entry(callback.@cn.softnado.Gwt.Map.Baidu.Client.Dom.OneParamCallback::onCallback(Ljava/lang/Object;)(point));
		},city);
	}-*/;

	public final native void getLocation(Point point,
			OneParamCallback<GeocoderResult> callback, LocationOptions opts)
	/*-{
		this.getLocation(point,function(geoRes){
			callback && $entry(callback.@cn.softnado.Gwt.Map.Baidu.Client.Dom.OneParamCallback::onCallback(Ljava/lang/Object;)(geoRes));
		},opts);
	}-*/;

	public final native void getLocation(Point point,
			OneParamCallback<GeocoderResult> callback)
	/*-{
		this.getLocation(point,function(geoRes){
			callback && $entry(callback.@cn.softnado.Gwt.Map.Baidu.Client.Dom.OneParamCallback::onCallback(Ljava/lang/Object;)(geoRes));
		});
	}-*/;
}
