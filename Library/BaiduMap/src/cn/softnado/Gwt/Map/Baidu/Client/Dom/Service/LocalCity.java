package cn.softnado.Gwt.Map.Baidu.Client.Dom.Service;

import cn.softnado.Gwt.Map.Baidu.Client.Dom.OneParamCallback;

import com.google.gwt.core.client.JavaScriptObject;

public class LocalCity extends JavaScriptObject {
	protected LocalCity() {

	}

	public static native LocalCity CreateInstance(LocalCityOptions opts)
	/*-{
		return new $wnd.BMap.LocalCity(opts);
	}-*/;

	public static native LocalCity CreateInstance()
	/*-{
		return new $wnd.BMap.LocalCity();
	}-*/;

	public final native void get(OneParamCallback<LocalCityResult> callback)
	/*-{
		this.get(function(res){
				callback && $entry(callback.@cn.softnado.Gwt.Map.Baidu.Client.Dom.OneParamCallback::onCallback(Ljava/lang/Object;)(res));
			});
	}-*/;
}
