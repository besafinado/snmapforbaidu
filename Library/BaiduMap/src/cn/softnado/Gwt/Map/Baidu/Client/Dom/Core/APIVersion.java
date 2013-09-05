package cn.softnado.Gwt.Map.Baidu.Client.Dom.Core;

import com.google.gwt.core.client.JavaScriptObject;

public class APIVersion extends JavaScriptObject {
	protected APIVersion() {
	}

	public static native APIVersion BMAP_API_VERSION()
	/*-{
		return new Object($wnd.BMAP_API_VERSION ? $wnd.BMAP_API_VERSION : "Unknown");
	}-*/;
}
