package cn.softnado.Gwt.Map.Baidu.Client.Dom.Overlay;

import com.google.gwt.core.client.JavaScriptObject;

public class Animation extends JavaScriptObject {
	protected Animation() {

	}

	public static native Animation BMAP_ANIMATION_DROP()
	/*-{
		return new Object($wnd.BMAP_ANIMATION_DROP ? $wnd.BMAP_ANIMATION_DROP : 1);
	}-*/;

	public static native Animation BMAP_ANIMATION_BOUNCE()
	/*-{
		return new Object($wnd.BMAP_ANIMATION_BOUNCE ? $wnd.BMAP_ANIMATION_BOUNCE : 2);
	}-*/;
}
