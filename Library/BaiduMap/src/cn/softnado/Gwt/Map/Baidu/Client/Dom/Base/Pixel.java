package cn.softnado.Gwt.Map.Baidu.Client.Dom.Base;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * 此类表示地图上的一点，单位为像素。
 * @author softnado
 *
 */
public class Pixel extends JavaScriptObject {
	protected Pixel() {
	}

	/**
	 * 创建像素点对象实例。像素坐标的坐标原点为地图区域的左上角。
	 * @param x
	 * @param y
	 * @return
	 */
	public static native Pixel CreateInstance(double x, double y)
	/*-{
		return new $wnd.BMap.Pixel(x,y);
	}-*/;

	/**
	 * x坐标。
	 * @return
	 */
	public final native double getX()
	/*-{
		return this.x;
	}-*/;

	/**
	 * x坐标。
	 * @param xValue
	 */
	public final native void setX(double xValue)
	/*-{
		this.x = xValue;
	}-*/;

	/**
	 * y坐标。
	 * @return
	 */
	public final native double getY()
	/*-{
		return this.y;
	}-*/;

	/**
	 * y坐标。
	 * @param yValue
	 */
	public final native void setY(double yValue)
	/*-{
		this.y = yValue;
	}-*/;

	/**
	 * 判断坐标点是否相等，当且仅当两点的x坐标和y坐标均相等时返回true。
	 * @param pixel
	 * @return
	 */
	public final native boolean equals(Pixel pixel)
	/*-{
		return this.equals(pixel);
	}-*/;
}
