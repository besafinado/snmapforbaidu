package cn.softnado.Gwt.Map.Baidu.Client.Dom.Base;

import com.google.gwt.core.client.JavaScriptObject;

import cn.softnado.Gwt.Map.Baidu.Shared.Dom.Base.IPoint;

;

/**
 * 此类表示一个地理坐标点。
 * 
 * @author softnado
 * 
 */
public class Point extends JavaScriptObject implements IPoint {
	protected Point() {
	}

	/**
	 * 以指定的经度和纬度创建一个地理点坐标。
	 * 
	 * @param lngValue
	 * @param latValue
	 * @return
	 */
	public static native Point CreateInstance(double lngValue, double latValue)
	/*-{
		return new $wnd.BMap.Point(lngValue,latValue);
	}-*/;

	/**
	 * 地理经度。
	 * 
	 * @return
	 */
	public final native double getLng()
	/*-{
		return this.lng;
	}-*/;

	/**
	 * 地理经度。
	 * 
	 * @param value
	 */
	public final native void setLng(double value)
	/*-{
		this.lng=value;
	}-*/;

	/**
	 * 地理纬度。
	 * 
	 * @return
	 */
	public final native double getLat()
	/*-{
		return this.lat;
	}-*/;

	/**
	 * 地理纬度。
	 * 
	 * @param value
	 */
	public final native void setLat(double value)
	/*-{
		this.lat = value;
	}-*/;

	/**
	 * 判断坐标点是否相等，当且仅当两点的经度和纬度均相等时返回true。
	 * 
	 * @param point
	 * @return
	 */
	public final native boolean equals(Point point)
	/*-{
		return this.equals(point);
	}-*/;
}
