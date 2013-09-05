package cn.softnado.Gwt.Map.Baidu.Client.Dom.Control;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * 此类表示地图的平移缩放控件，可以对地图进行上下左右四个方向的平移和缩放操作。
 * 
 * @author softnado
 * 
 */
public class NavigationControl extends JavaScriptObject {
	protected NavigationControl() {

	}

	/**
	 * 创建一个特定样式的地图平移缩放控件。
	 * 
	 * @param opts
	 * @return
	 */
	public static native NavigationControl CreateInstance(
			NavigationControlOptions opts)
	/*-{
		return new $wnd.BMap.NavigationControl(opts);
	}-*/;

	/**
	 * 创建一个特定样式的地图平移缩放控件。
	 * 
	 * @return
	 */
	public static native NavigationControl CreateInstance()
	/*-{
		return new $wnd.BMap.NavigationControl();
	}-*/;

	/**
	 * 返回平移缩放控件的类型。
	 * 
	 * @return
	 */
	public final native NavigationControlType getType()
	/*-{
		return this.getType();
	}-*/;

	/**
	 * 返回平移缩放控件的类型。
	 * 
	 * @param typeValue
	 */
	public final native void setType(NavigationControlType typeValue)
	/*-{
		this.setType(typeValue);
	}-*/;

}
