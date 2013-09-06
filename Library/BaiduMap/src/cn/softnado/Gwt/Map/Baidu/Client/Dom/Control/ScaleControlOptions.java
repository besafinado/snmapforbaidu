package cn.softnado.Gwt.Map.Baidu.Client.Dom.Control;

import cn.softnado.Gwt.Map.Baidu.Client.Dom.Base.Size;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * 姝ょ被琛ㄧずScaleControl鏋勯€犲嚱鏁扮殑鍙€夊弬鏁般€傚畠娌℃湁鏋勯€犲嚱鏁帮紝浣嗗彲閫氳繃瀵硅薄瀛楅潰閲忓舰寮忚〃绀恒€? * 
 * @author softnado
 * 
 */
public class ScaleControlOptions extends JavaScriptObject {
	protected ScaleControlOptions() {

	}

	/**
	 * ScaleControl鏋勯€犲嚱鏁扮殑鍙€夊弬鏁?	 * 
	 * @param anchorValue
	 *            鎺т欢鐨勫仠闈犱綅缃€?	 * @param offsetValue
	 *            鎺т欢鐨勫亸绉诲€笺€?	 * @return
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
	 * 鎺т欢鐨勫亸绉诲€笺€?	 * 
	 * @return
	 */
	public final native Size getOffset()
	/*-{
		return this.offset;
	}-*/;

	/**
	 * 鎺т欢鐨勫亸绉诲€笺€?	 * 
	 * @param offsetValue
	 */
	public final native void setOffset(Size offsetValue)
	/*-{
		this.offset = offsetValue;
	}-*/;

	/**
	 * 鎺т欢鐨勫仠闈犱綅缃€?	 * 
	 * @return
	 */
	public final native ControlAnchor getAnchor()
	/*-{
		return this.anchor;
	}-*/;

	/**
	 * 鎺т欢鐨勫仠闈犱綅缃€?	 * 
	 * @param anchorValue
	 */
	public final native void setAnchor(ControlAnchor anchorValue)
	/*-{
		this.anchor = anchorValue;
	}-*/;

}
