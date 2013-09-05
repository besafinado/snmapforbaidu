package cn.softnado.Gwt.Map.Baidu.Client.Dom.Control;

import cn.softnado.Gwt.Map.Baidu.Client.Dom.Base.Size;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * 此类表示OverviewMapControl构造函数的可选参数。它没有构造函数，但可通过对象字面量形式表示。
 * 
 * @author softnado
 * 
 */
public class OverviewMapControlOptions extends JavaScriptObject {
	protected OverviewMapControlOptions() {

	}

	/**
	 * OverviewMapControl构造函数的可选参数
	 * 
	 * @param anchorValue
	 *            控件的停靠位置。
	 * @param offsetValue
	 *            控件的偏移值。
	 * @param sizeValue
	 *            缩略地图控件的大小。
	 * @param isOpenValue
	 *            缩略地图添加到地图后的开合状态，默认为关闭。
	 * @return
	 */
	public static native OverviewMapControlOptions CreateInstance(
			ControlAnchor anchorValue, Size offsetValue, Size sizeValue,
			boolean isOpenValue)
	/*-{
		return {
			anchor:anchorValue,
			offset:offsetValue,
			size:sizeValue,
			isOpen:isOpenValue
		};
	}-*/;

	/**
	 * 缩略地图添加到地图后的开合状态，默认为关闭。
	 * 
	 * @return
	 */
	public final native boolean getIsOpen()
	/*-{
		return this.isOpen;
	}-*/;

	/**
	 * 缩略地图添加到地图后的开合状态，默认为关闭。
	 * 
	 * @param isOpenValue
	 */
	public final native void setIsOpen(boolean isOpenValue)
	/*-{
		this.isOpen = isOpenValue;
	}-*/;

	/**
	 * 控件的偏移值。
	 * 
	 * @return
	 */
	public final native Size getOffset()
	/*-{
		return this.offset;
	}-*/;

	/**
	 * 控件的偏移值。
	 * 
	 * @param offsetValue
	 */
	public final native void setOffset(Size offsetValue)
	/*-{
		this.offset = offsetValue;
	}-*/;

	/**
	 * 缩略地图控件的大小。
	 * 
	 * @return
	 */
	public final native Size getSize()
	/*-{
		return this.size;
	}-*/;

	/**
	 * 缩略地图控件的大小。
	 * 
	 * @param sizeValue
	 */
	public final native void setSize(Size sizeValue)
	/*-{
		this.size = sizeValue;
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
