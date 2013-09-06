package cn.softnado.Gwt.Map.Baidu.Client.Dom.Service;

import cn.softnado.Gwt.Map.Baidu.Client.Dom.Base.Point;

import com.google.gwt.core.client.JavaScriptObject;

public class GeolocationResult extends JavaScriptObject {
	protected GeolocationResult() {

	}

	public final native Point getPoint()
	/*-{
		return this.point;
	}-*/;

	public final native double getAccuracy()
	/*-{
		return this.accuracy;
	}-*/;

}
