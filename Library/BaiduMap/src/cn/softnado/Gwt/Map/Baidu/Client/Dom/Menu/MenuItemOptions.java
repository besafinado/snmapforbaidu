package cn.softnado.Gwt.Map.Baidu.Client.Dom.Menu;

import com.google.gwt.core.client.JavaScriptObject;

public class MenuItemOptions extends JavaScriptObject {
	protected MenuItemOptions() {

	}

	public static native MenuItemOptions CreateInstance(double widthValue)
	/*-{
		return {
			width:widthValue
		};
	}-*/;

	public final native double getWidth()
	/*-{
		return this.width;
	}-*/;

	public final native void setWidth(double widthValue)
	/*-{
		this.width = widthValue;
	}-*/;

}
