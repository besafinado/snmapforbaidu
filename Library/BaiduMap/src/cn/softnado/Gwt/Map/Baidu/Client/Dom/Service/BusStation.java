package cn.softnado.Gwt.Map.Baidu.Client.Dom.Service;

import cn.softnado.Gwt.Map.Baidu.Client.Dom.Base.Point;

import com.google.gwt.core.client.JavaScriptObject;

public class BusStation extends JavaScriptObject {
	protected BusStation() {

	}

	public final native String getName()
	/*-{
		return this.name;
	}-*/;

	public final native Point getPosition()
	/*-{
		return this.position;
	}-*/;
}
