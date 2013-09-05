package cn.softnado.Gwt.Map.Baidu.Client.Dom.Service;

import com.google.gwt.core.client.JavaScriptObject;

public class HighlightModes extends JavaScriptObject {
	protected HighlightModes() {

	}

	public static native HighlightModes BMAP_HIGHLIGHT_STEP()
	/*-{
		return new Object($wnd.BMAP_HIGHLIGHT_STEP ? $wnd.BMAP_HIGHLIGHT_STEP : 1);
	}-*/;

	public static native HighlightModes BMAP_HIGHLIGHT_ROUTE()
	/*-{
		return new Object($wnd.BMAP_HIGHLIGHT_ROUTE ? $wnd.BMAP_HIGHLIGHT_ROUTE : 2);
	}-*/;
}
