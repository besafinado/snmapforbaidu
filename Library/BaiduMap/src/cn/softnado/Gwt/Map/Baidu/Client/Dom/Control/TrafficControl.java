package cn.softnado.Gwt.Map.Baidu.Client.Dom.Control;

import cn.softnado.Gwt.Map.Baidu.Client.Dom.Base.Size;

/**
 * 姝ょ被琛ㄧず浜ら€氭祦閲忔帶浠讹紝瀹冪户鎵緾ontrol绫伙紝鍖呭惈璇ョ被鐨勬墍鏈夋柟娉?璇ユ帶浠剁殑鍋滈潬浣嶇疆甯搁噺浠呮敮鎸丅MAP_CONTROL_ANCHOR_TOP_RIGHT锛? * 浣嗗彲淇敼鍏跺亸绉讳綅缃紙鑷?1.2 搴熷純锛夈€? * 
 * @author softnado
 * 
 */
public class TrafficControl extends Control {
	protected TrafficControl() {

	}

	/**
	 * 鍒涘缓涓€涓氦閫氭祦閲忕殑鎺т欢瀹炰緥锛岃瀹炰緥缁ф壙鑷狢ontrol锛屾敮鎸佹绫荤殑鎵€鏈夋柟娉曘€?	 * 
	 * @return
	 */
	public static native TrafficControl CreateInstance()
	/*-{
		return new $wnd.BMap.TrafficControl();
	}-*/;

	/**
	 * 璁剧疆璺喌闈㈡澘鐨勬按骞冲拰绔栫洿鍋忕Щ浣嶇疆銆傞潰鏉夸笌鎸夐挳鍋滈潬浣嶇疆涓€鑷达紝濮嬬粓浣嶄簬鍦板浘鍖哄煙鐨勫彸涓婅銆?	 * 
	 * @param offsetValue
	 */
	public final native void setPanelOffset(Size offsetValue)
	/*-{
		this.setPanelOffset(offsetValue);
	}-*/;

}
