package cn.softnado.Gwt.Map.Baidu.Client.Dom.Service;

import com.google.gwt.core.client.JavaScriptObject;

public class PoiType extends JavaScriptObject {
	protected PoiType() {

	}

	public static native PoiType BMAP_POI_TYPE_NORMAL()
	/*-{
		return new Object($wnd.BMAP_POI_TYPE_NORMAL ? $wnd.BMAP_POI_TYPE_NORMAL : 0);
	}-*/;

	public static native PoiType BMAP_POI_TYPE_BUSSTOP()
	/*-{
		return new Object($wnd.BMAP_POI_TYPE_BUSSTOP ? $wnd.BMAP_POI_TYPE_BUSSTOP : 1);
	}-*/;

	public static native PoiType BMAP_POI_TYPE_BUSLINE()
	/*-{
		return new Object($wnd.BMAP_POI_TYPE_BUSLINE ? $wnd.BMAP_POI_TYPE_BUSLINE : 2);
	}-*/;

	public static native PoiType BMAP_POI_TYPE_SUBSTOP()
	/*-{
		return new Object($wnd.BMAP_POI_TYPE_SUBSTOP ? $wnd.BMAP_POI_TYPE_SUBSTOP : 3);
	}-*/;

	public static native PoiType BMAP_POI_TYPE_SUBLINE()
	/*-{
		return new Object($wnd.BMAP_POI_TYPE_SUBLINE ? $wnd.BMAP_POI_TYPE_SUBLINE : 4);
	}-*/;
}
