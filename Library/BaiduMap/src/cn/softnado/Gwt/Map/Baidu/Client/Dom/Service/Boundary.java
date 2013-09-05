package cn.softnado.Gwt.Map.Baidu.Client.Dom.Service;

import cn.softnado.Gwt.Map.Baidu.Client.Dom.OneParamCallback;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArrayString;

public class Boundary extends JavaScriptObject {
	protected Boundary() {

	}

	public static native Boundary CreateInstance()
	/*-{
		return new $wnd.BMap.Boundary();
	}-*/;

	public final native void get(String name,
			OneParamCallback<JsArrayString> callback)
	/*-{
		this.get(name,function(res){
				callback && $entry(callback.@cn.softnado.Gwt.Map.Baidu.Client.Dom.OneParamCallback::onCallback(Ljava/lang/Object;)(res));
			});
	}-*/;
}
