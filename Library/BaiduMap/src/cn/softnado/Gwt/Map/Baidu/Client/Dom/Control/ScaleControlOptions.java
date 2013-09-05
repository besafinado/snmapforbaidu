package cn.softnado.Gwt.Map.Baidu.Client.Dom.Control;

import cn.softnado.Gwt.Map.Baidu.Client.Dom.Base.Size;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * 此类表示ScaleControl构造函数的可选参数。它没有构造函数，但可通过对象字面量形式表示。
 * 
 * @author softnado
 * 
 */
public class ScaleControlOptions extends JavaScriptObject {
	protected ScaleControlOptions() {

	}

	/**
	 * ScaleControl构造函数的可选参数
	 * 
	 * @param anchorValue
	 *            控件的停靠位置。
	 * @param offsetValue
	 *            控件的偏移值。
	 * @return
	 */
	public static native ScaleControlOptions CreateInstance(
			ControlAnchor anchorValue, Size offsetValue)
	/*-{
		return {
			anchor:anchorValue,
			offset:offsetValue
		};
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
