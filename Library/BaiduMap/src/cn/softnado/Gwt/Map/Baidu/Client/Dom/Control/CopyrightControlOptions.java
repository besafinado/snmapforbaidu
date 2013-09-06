package cn.softnado.Gwt.Map.Baidu.Client.Dom.Control;

import com.google.gwt.core.client.JavaScriptObject;
import cn.softnado.Gwt.Map.Baidu.Client.Dom.Base.Size;

/**
 * 此类表示CopyrightControl构造函数的可选参数。它没有构造函数，但可通过对象字面量形式表示。
 * 
 * @author softnado
 * 
 */
public class CopyrightControlOptions extends JavaScriptObject {
	protected CopyrightControlOptions() {

	}

	/**
	 * 构建CopyrightControl可选参数
	 * @param anchorValue 停靠位置
	 * @param offsetValue 偏移量
	 * @return
	 */
	public static native CopyrightControlOptions CreateInstance(
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
