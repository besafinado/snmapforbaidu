package cn.softnado.Gwt.Map.Baidu.Client.Dom.Service;

import com.google.gwt.core.client.JavaScriptObject;

public class RouteType extends JavaScriptObject {
	protected RouteType() {

	}

	public static native RouteType BMAP_ROUTE_TYPE_DRIVING()
	/*-{
		return new Object($wnd.BMAP_ROUTE_TYPE_DRIVING ? $wnd.BMAP_ROUTE_TYPE_DRIVING : 3);
	}-*/;

	public static native RouteType BMAP_ROUTE_TYPE_WALKING()
	/*-{
		return new Object($wnd.BMAP_ROUTE_TYPE_WALKING ? $wnd.BMAP_ROUTE_TYPE_WALKING : 2);
	}-*/;
}
