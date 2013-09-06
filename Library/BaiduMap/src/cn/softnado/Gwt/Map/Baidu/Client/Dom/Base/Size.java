package cn.softnado.Gwt.Map.Baidu.Client.Dom.Base;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * 此类以像素表示一个矩形区域的大小。
 * 
 * @author softnado
 * 
 */
public class Size extends JavaScriptObject {
	protected Size() {
	}

	/**
	 * 以指定的宽度和高度创建一个矩形区域大小对象。
	 * 
	 * @param width
	 * @param height
	 * @return
	 */
	public static native Size CreateInstance(double width, double height)
	/*-{
		return new $wnd.BMap.Size(width,height);
	}-*/;

	/**
	 * 水平方向数值。
	 * 
	 * @return
	 */
	public final native double getWidth()
	/*-{
		return this.width;
	}-*/;

	/**
	 * 水平方向数值。
	 * 
	 * @param widthValue
	 */
	public final native void setWidth(double widthValue)
	/*-{
		this.width=widthValue;
	}-*/;

	/**
	 * 竖直方向的数值。
	 * 
	 * @return
	 */
	public final native double getHeight()
	/*-{
		return this.height;
	}-*/;

	/**
	 * 竖直方向的数值。
	 * 
	 * @param heightValue
	 */
	public final native void setHeight(double heightValue)
	/*-{
		this.height=heightValue;
	}-*/;

	/**
	 * 当且仅当此矩形中的宽度和高度都等于其他矩形的宽度和高度时，返回true。
	 * 
	 * @param size
	 * @return
	 */
	public final native boolean equals(Size size)
	/*-{
		return this.equals(size);
	}-*/;
}
