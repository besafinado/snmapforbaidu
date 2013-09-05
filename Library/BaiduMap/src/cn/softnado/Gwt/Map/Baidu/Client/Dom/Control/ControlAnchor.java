package cn.softnado.Gwt.Map.Baidu.Client.Dom.Control;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * 此常量表示控件的定位。
 * 
 * @author softnado
 * 
 */
public class ControlAnchor extends JavaScriptObject {
	protected ControlAnchor() {

	}

	/**
	 * 控件将定位到地图的左上角。
	 * 
	 * @return
	 */
	public static native ControlAnchor BMAP_ANCHOR_TOP_LEFT()
	/*-{
		return new Object($wnd.BMAP_ANCHOR_TOP_LEFT ? $wnd.BMAP_ANCHOR_TOP_LEFT : 0);
	}-*/;

	/**
	 * 控件将定位到地图的右上角。
	 * 
	 * @return
	 */
	public static native ControlAnchor BMAP_ANCHOR_TOP_RIGHT()
	/*-{
		return new Object($wnd.BMAP_ANCHOR_TOP_RIGHT ? $wnd.BMAP_ANCHOR_TOP_RIGHT : 1);
	}-*/;

	/**
	 * 控件将定位到地图的左下角。
	 * 
	 * @return
	 */
	public static native ControlAnchor BMAP_ANCHOR_BOTTOM_LEFT()
	/*-{
		return new Object($wnd.BMAP_ANCHOR_BOTTOM_LEFT ? $wnd.BMAP_ANCHOR_BOTTOM_LEFT : 2);
	}-*/;

	/**
	 * 控件将定位到地图的右下角。
	 * 
	 * @return
	 */
	public static native ControlAnchor BMAP_ANCHOR_BOTTOM_RIGHT()
	/*-{
		return new Object($wnd.BMAP_ANCHOR_BOTTOM_RIGHT ? $wnd.BMAP_ANCHOR_BOTTOM_RIGHT : 3);
	}-*/;
}
