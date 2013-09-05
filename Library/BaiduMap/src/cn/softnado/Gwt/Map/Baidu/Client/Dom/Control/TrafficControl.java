package cn.softnado.Gwt.Map.Baidu.Client.Dom.Control;

import cn.softnado.Gwt.Map.Baidu.Client.Dom.Base.Size;

/**
 * 此类表示交通流量控件，它继承Control类，包含该类的所有方法 该控件的停靠位置常量仅支持BMAP_CONTROL_ANCHOR_TOP_RIGHT，
 * 但可修改其偏移位置（自 1.2 废弃）。
 * 
 * @author softnado
 * 
 */
public class TrafficControl extends Control {
	protected TrafficControl() {

	}

	/**
	 * 创建一个交通流量的控件实例，该实例继承自Control，支持此类的所有方法。
	 * 
	 * @return
	 */
	public static native TrafficControl CreateInstance()
	/*-{
		return new $wnd.BMap.TrafficControl();
	}-*/;

	/**
	 * 设置路况面板的水平和竖直偏移位置。面板与按钮停靠位置一致，始终位于地图区域的右上角。
	 * 
	 * @param offsetValue
	 */
	public final native void setPanelOffset(Size offsetValue)
	/*-{
		this.setPanelOffset(offsetValue);
	}-*/;

}
