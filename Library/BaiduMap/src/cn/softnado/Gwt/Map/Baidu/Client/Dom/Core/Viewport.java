package cn.softnado.Gwt.Map.Baidu.Client.Dom.Core;

import cn.softnado.Gwt.Map.Baidu.Client.Dom.Base.Point;

import com.google.gwt.core.client.JavaScriptObject;

public class Viewport extends JavaScriptObject {
	protected Viewport() {
	}

	public final native Point getCenter()
	/*-{
		return this.center;
	}-*/;

	public final native void setCenter(Point centerValue)
	/*-{
		this.center = centerValue;
	}-*/;

	public final native double getZoom()
	/*-{
		return this.zoom;
	}-*/;

	public final native void setZoom(double zoomValue)
	/*-{
		this.zoom = zoomValue;
	}-*/;

}
