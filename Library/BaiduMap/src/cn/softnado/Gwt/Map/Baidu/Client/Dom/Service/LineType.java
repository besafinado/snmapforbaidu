package cn.softnado.Gwt.Map.Baidu.Client.Dom.Service;

import com.google.gwt.core.client.JavaScriptObject;

public class LineType extends JavaScriptObject {
	protected LineType() {

	}

	public static native LineType BMAP_LINE_TYPE_BUS()
	/*-{
		return new Object($wnd.BMAP_LINE_TYPE_BUS ? $wnd.BMAP_LINE_TYPE_BUS : 0);
	}-*/;

	public static native LineType BMAP_LINE_TYPE_SUBWAY()
	/*-{
		return new Object($wnd.BMAP_LINE_TYPE_SUBWAY ? $wnd.BMAP_LINE_TYPE_SUBWAY : 1);
	}-*/;

	public static native LineType BMAP_LINE_TYPE_FERRY()
	/*-{
		return new Object($wnd.BMAP_LINE_TYPE_FERRY ? $wnd.BMAP_LINE_TYPE_FERRY : 2);
	}-*/;
}
