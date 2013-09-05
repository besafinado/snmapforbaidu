package cn.softnado.Gwt.Map.Baidu.Client.Dom.Control;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * 此常量表示平移缩放控件的类型
 * 
 * @author softnado
 * 
 */
public class NavigationControlType extends JavaScriptObject {
	protected NavigationControlType() {

	}

	/**
	 * 标准的平移缩放控件（包括平移、缩放按钮和滑块）。
	 * 
	 * @return
	 */
	public static native NavigationControlType BMAP_NAVIGATION_CONTROL_LARGE()
	/*-{
		return new Object($wnd.BMAP_NAVIGATION_CONTROL_LARGE ? $wnd.BMAP_NAVIGATION_CONTROL_LARGE : 0);
	}-*/;

	/**
	 * 仅包含平移和缩放按钮。
	 * 
	 * @return
	 */
	public static native NavigationControlType BMAP_NAVIGATION_CONTROL_SMALL()
	/*-{
		return new Object($wnd.BMAP_NAVIGATION_CONTROL_SMALL ? $wnd.BMAP_NAVIGATION_CONTROL_SMALL : 1);
	}-*/;

	/**
	 * 仅包含平移按钮。
	 * 
	 * @return
	 */
	public static native NavigationControlType BMAP_NAVIGATION_CONTROL_PAN()
	/*-{
		return new Object($wnd.BMAP_NAVIGATION_CONTROL_PAN ? $wnd.BMAP_NAVIGATION_CONTROL_PAN : 2);
	}-*/;

	/**
	 * 仅包含缩放按钮。
	 * 
	 * @return
	 */
	public static native NavigationControlType BMAP_NAVIGATION_CONTROL_ZOOM()
	/*-{
		return new Object($wnd.BMAP_NAVIGATION_CONTROL_ZOOM ? $wnd.BMAP_NAVIGATION_CONTROL_ZOOM : 3);
	}-*/;
}
