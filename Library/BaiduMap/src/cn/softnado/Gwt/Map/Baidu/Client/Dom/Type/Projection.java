package cn.softnado.Gwt.Map.Baidu.Client.Dom.Type;

import cn.softnado.Gwt.Map.Baidu.Client.Dom.Base.Pixel;
import cn.softnado.Gwt.Map.Baidu.Client.Dom.Base.Point;

import com.google.gwt.core.client.JavaScriptObject;

public abstract class Projection extends JavaScriptObject {
	protected Projection() {

	}

	public final native Pixel LngLatToPoint(Point lngLat)
	/*-{
		return this.lngLatToPoint(lngLat);
	}-*/;

	public final native Point PointToLngLat(Pixel point)
	/*-{
		return this.pointToLngLat(point);
	}-*/;
}
