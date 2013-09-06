package cn.softnado.Gwt.Map.Baidu.Client.Dom.Control;

import cn.softnado.Gwt.Map.Baidu.Client.Dom.Base.Size;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * 此类表示NavigationControl构造函数的可选参数。它没有构造函数，但可通过对象字面量形式表示。
 * 
 * @author softnado
 * 
 */
public class NavigationControlOptions extends JavaScriptObject {
	protected NavigationControlOptions() {

	}

	/**
	 * NavigationControl构造函数的可选参数
	 * 
	 * @param anchorValue
	 *            控件的停靠位置。
	 * @param offsetValue
	 *            控件的水平偏移值。
	 * @param typeValue
	 *            平移缩放控件的类型。
	 * @param showZoomInfoValue
	 *            是否显示级别提示信息。(自 1.1 新增)
	 * @return
	 */
	public static native NavigationControlOptions CreateInstance(
			ControlAnchor anchorValue, Size offsetValue,
			NavigationControlType typeValue, boolean showZoomInfoValue)
	/*-{
		return {
			anchor:anchorValue,
			offset:offsetValue,
			type:typeValue,
			showZoomInfo:showZoomInfoValue
		};
	}-*/;

	/**
	 * 是否显示级别提示信息。(自 1.1 新增)
	 * 
	 * @return
	 */
	public final native boolean getShowZoomInfo()
	/*-{
		return this.showZoomInfo;
	}-*/;

	/**
	 * 是否显示级别提示信息。(自 1.1 新增)
	 * 
	 * @param showZoomInfoValue
	 */
	public final native void setShowZoomInfo(boolean showZoomInfoValue)
	/*-{
		this.showZoomInfo = showZoomInfoValue;
	}-*/;

	/**
	 * 平移缩放控件的类型。
	 * 
	 * @return
	 */
	public final native NavigationControlType getType()
	/*-{
		return this.type;
	}-*/;

	/**
	 * 平移缩放控件的类型。
	 * 
	 * @param typeValue
	 */
	public final native void setType(NavigationControlType typeValue)
	/*-{
		this.type = typeValue;
	}-*/;

	/**
	 * 控件的水平偏移值。
	 * 
	 * @return
	 */
	public final native Size getOffset()
	/*-{
		return this.offset;
	}-*/;

	/**
	 * 控件的水平偏移值。
	 * 
	 * @param offsetValue
	 */
	public final native void setOffset(Size offsetValue)
	/*-{
		this.offset = offsetValue;
	}-*/;

	/**
	 * 控件的停靠位置。
	 * 
	 * @return
	 */
	public final native ControlAnchor getAnchor()
	/*-{
		return this.anchor;
	}-*/;

	/**
	 * 控件的停靠位置。
	 * 
	 * @param anchorValue
	 */
	public final native void setAnchor(ControlAnchor anchorValue)
	/*-{
		this.anchor = anchorValue;
	}-*/;

}
