package cn.softnado.Gwt.Map.Baidu.Client.Dom.Menu;

import cn.softnado.Gwt.Map.Baidu.Client.Dom.OneParamCallback;
import cn.softnado.Gwt.Map.Baidu.Client.Dom.Base.Point;

import com.google.gwt.core.client.JavaScriptObject;

public class MenuItem extends JavaScriptObject {
	protected MenuItem() {

	}

	public static native MenuItem CreateInstance(String text,
			OneParamCallback<Point> callback, MenuItemOptions opts)
	/*-{
		return new $wnd.BMap.MenuItem(text,function(pointRes){
			callback && $entry(callback.@cn.softnado.Gwt.Map.Baidu.Client.Dom.OneParamCallback::onCallback(Ljava/lang/Object;)(pointRes));
		},opts);
	}-*/;

	public static native MenuItem CreateInstance(String text,
			OneParamCallback<Point> callback)
	/*-{
		return new $wnd.BMap.MenuItem(text,function(pointRes){
			callback && $entry(callback.@cn.softnado.Gwt.Map.Baidu.Client.Dom.OneParamCallback::onCallback(Ljava/lang/Object;)(pointRes));
		});
	}-*/;

	public final native void setText(String textValue)
	/*-{
		this.setText(textValue);
	}-*/;

	public final native void Enable()
	/*-{
		this.enable();
	}-*/;

	public final native void Disable()
	/*-{
		this.disable();
	}-*/;

}
