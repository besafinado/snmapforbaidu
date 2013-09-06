package cn.softnado.Gwt.Map.Baidu.Client.Dom.Control;

import cn.softnado.Gwt.Map.Baidu.Client.Dom.Base.Size;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * 姝ょ被琛ㄧずOverviewMapControl鏋勯€犲嚱鏁扮殑鍙€夊弬鏁般€傚畠娌℃湁鏋勯€犲嚱鏁帮紝浣嗗彲閫氳繃瀵硅薄瀛楅潰閲忓舰寮忚〃绀恒€? * 
 * @author softnado
 * 
 */
public class OverviewMapControlOptions extends JavaScriptObject {
	protected OverviewMapControlOptions() {

	}

	/**
	 * OverviewMapControl鏋勯€犲嚱鏁扮殑鍙€夊弬鏁?	 * 
	 * @param anchorValue
	 *            鎺т欢鐨勫仠闈犱綅缃€?	 * @param offsetValue
	 *            鎺т欢鐨勫亸绉诲€笺€?	 * @param sizeValue
	 *            缂╃暐鍦板浘鎺т欢鐨勫ぇ灏忋€?	 * @param isOpenValue
	 *            缂╃暐鍦板浘娣诲姞鍒板湴鍥惧悗鐨勫紑鍚堢姸鎬侊紝榛樿涓哄叧闂€?	 * @return
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
	 * 缂╃暐鍦板浘娣诲姞鍒板湴鍥惧悗鐨勫紑鍚堢姸鎬侊紝榛樿涓哄叧闂€?	 * 
	 * @return
	 */
	public final native boolean getIsOpen()
	/*-{
		return this.isOpen;
	}-*/;

	/**
	 * 缂╃暐鍦板浘娣诲姞鍒板湴鍥惧悗鐨勫紑鍚堢姸鎬侊紝榛樿涓哄叧闂€?	 * 
	 * @param isOpenValue
	 */
	public final native void setIsOpen(boolean isOpenValue)
	/*-{
		this.isOpen = isOpenValue;
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
	 * 缂╃暐鍦板浘鎺т欢鐨勫ぇ灏忋€?	 * 
	 * @return
	 */
	public final native Size getSize()
	/*-{
		return this.size;
	}-*/;

	/**
	 * 缂╃暐鍦板浘鎺т欢鐨勫ぇ灏忋€?	 * 
	 * @param sizeValue
	 */
	public final native void setSize(Size sizeValue)
	/*-{
		this.size = sizeValue;
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
