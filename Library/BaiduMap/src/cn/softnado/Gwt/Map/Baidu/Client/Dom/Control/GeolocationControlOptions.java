package cn.softnado.Gwt.Map.Baidu.Client.Dom.Control;

import cn.softnado.Gwt.Map.Baidu.Client.Dom.Base.Size;
import cn.softnado.Gwt.Map.Baidu.Client.Dom.Overlay.Icon;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * 此类表示GeolocationControl构造函数的可选参数。它没有构造函数，但可通过对象字面量形式表示。(自 1.4 新增)
 * 
 * @author softnado
 * 
 */
public class GeolocationControlOptions extends JavaScriptObject {
	protected GeolocationControlOptions() {

	}

	/**
	 * 创建GeolocationControl可选参数
	 * 
	 * @param anchorValue
	 *            控件的停靠位置，默认定位到地图的右下角。
	 * @param offsetValue
	 *            控件的水平偏移值。
	 * @param showAddressBarValue
	 *            是否显示定位信息面板。默认显示定位信息面板。
	 * @param enableAutoLocationValue
	 *            添加控件时是否进行定位。默认添加控件时不进行定位。
	 * @param locationIconValue
	 *            可自定义定位中心点的Icon样式。
	 * @return
	 */
	public static native GeolocationControlOptions CreateInstance(
			ControlAnchor anchorValue, Size offsetValue,
			boolean showAddressBarValue, boolean enableAutoLocationValue,
			Icon locationIconValue)
	/*-{
		return {
			anchor:anchorValue,
			offset:offsetValue,
			showAddressBar:showAddressBarValue,
			enableAutoLocation:enableAutoLocationValue,
			locationIcon:locationIconValue,
		};
	}-*/;

	/**
	 * 可自定义定位中心点的Icon样式。
	 * 
	 * @return
	 */
	public final native Icon getLocationIcon()
	/*-{
		return this.locationIcon;
	}-*/;

	/**
	 * 可自定义定位中心点的Icon样式。
	 * 
	 * @param locationIconValue
	 */
	public final native void setLocationIcon(Icon locationIconValue)
	/*-{
		this.locationIcon = locationIconValue;
	}-*/;

	/**
	 * 添加控件时是否进行定位。默认添加控件时不进行定位。
	 * 
	 * @return
	 */
	public final native boolean getEnableAutoLocation()
	/*-{
		return this.enableAutoLocation;
	}-*/;

	/**
	 * 添加控件时是否进行定位。默认添加控件时不进行定位。
	 * 
	 * @param enableAutoLocationValue
	 */
	public final native void setEnableAutoLocation(
			boolean enableAutoLocationValue)
	/*-{
		this.enableAutoLocation = enableAutoLocationValue;
	}-*/;

	/**
	 * 是否显示定位信息面板。默认显示定位信息面板。
	 * 
	 * @return
	 */
	public final native boolean getShowAddressBar()
	/*-{
		return this.showAddressBar;
	}-*/;

	/**
	 * 是否显示定位信息面板。默认显示定位信息面板。
	 * 
	 * @param showAddressBarValue
	 */
	public final native void setShowAddressBar(boolean showAddressBarValue)
	/*-{
		this.showAddressBar = showAddressBarValue;
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
	 * 控件的停靠位置，默认定位到地图的右下角。
	 * 
	 * @return
	 */
	public final native ControlAnchor getAnchor()
	/*-{
		return this.anchor;
	}-*/;

	/**
	 * 控件的停靠位置，默认定位到地图的右下角。
	 * 
	 * @param anchorValue
	 */
	public final native void setAnchor(ControlAnchor anchorValue)
	/*-{
		this.anchor = anchorValue;
	}-*/;
}
