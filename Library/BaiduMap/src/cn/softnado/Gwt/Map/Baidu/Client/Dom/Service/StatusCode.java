package cn.softnado.Gwt.Map.Baidu.Client.Dom.Service;

import com.google.gwt.core.client.JavaScriptObject;

public class StatusCode extends JavaScriptObject {
	protected StatusCode() {

	}

	public static native StatusCode BMAP_STATUS_SUCCESS()
	/*-{
		return new Object($wnd.BMAP_STATUS_SUCCESS ? $wnd.BMAP_STATUS_SUCCESS : 0);
	}-*/;

	public static native StatusCode BMAP_STATUS_CITY_LIST()
	/*-{
		return new Object($wnd.BMAP_STATUS_CITY_LIST ? $wnd.BMAP_STATUS_CITY_LIST : 1);
	}-*/;

	public static native StatusCode BMAP_STATUS_UNKNOWN_LOCATION()
	/*-{
		return new Object($wnd.BMAP_STATUS_UNKNOWN_LOCATION ? $wnd.BMAP_STATUS_UNKNOWN_LOCATION : 2);
	}-*/;

	public static native StatusCode BMAP_STATUS_UNKNOWN_ROUTE()
	/*-{
		return new Object($wnd.BMAP_STATUS_UNKNOWN_ROUTE ? $wnd.BMAP_STATUS_UNKNOWN_ROUTE : 3);
	}-*/;

	public static native StatusCode BMAP_STATUS_INVALID_KEY()
	/*-{
		return new Object($wnd.BMAP_STATUS_INVALID_KEY ? $wnd.BMAP_STATUS_INVALID_KEY : 4);
	}-*/;

	public static native StatusCode BMAP_STATUS_INVALID_REQUEST()
	/*-{
		return new Object($wnd.BMAP_STATUS_INVALID_REQUEST ? $wnd.BMAP_STATUS_INVALID_REQUEST : 5);
	}-*/;

	public static native StatusCode BMAP_STATUS_PERMISSION_DENIED()
	/*-{
		return new Object($wnd.BMAP_STATUS_PERMISSION_DENIED ? $wnd.BMAP_STATUS_PERMISSION_DENIED : 6);
	}-*/;

	public static native StatusCode BMAP_STATUS_SERVICE_UNAVAILABLE()
	/*-{
		return new Object($wnd.BMAP_STATUS_SERVICE_UNAVAILABLE ? $wnd.BMAP_STATUS_SERVICE_UNAVAILABLE : 7);
	}-*/;

	public static native StatusCode BMAP_STATUS_TIMEOUT()
	/*-{
		return new Object($wnd.BMAP_STATUS_TIMEOUT ? $wnd.BMAP_STATUS_TIMEOUT : 8);
	}-*/;
}
