package cn.softnado.Gwt.Map.Baidu.Client.Dom.Base;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * 特殊偏移量。
 * @author softnado
 *
 */
public class Offset extends JavaScriptObject {
	protected Offset() {

	}

	/**
	 * 创建位置偏移量对象
	 * @param top 上偏移量
	 * @param right 右偏移量
	 * @param bottom 下偏移量
	 * @param left 左偏移量
	 * @return
	 */
	public static native Offset CreateInstance(double top, double right,
			double bottom, double left)
	/*-{
	 	return new Array(top,right,bottom,left);
	}-*/;

	/**
	 * 获取上偏移量
	 * @return
	 */
	public final native double getTop()
	/*-{
		return this[0];
	}-*/;

	/**
	 * 设置上偏移量
	 * @param topValue 上偏移量值
	 */
	public final native void setTop(double topValue)
	/*-{
		this[0] = topValue;
	}-*/;

	/**
	 * 获取右偏移量
	 * @return
	 */
	public final native double getRight()
	/*-{
		return this[1];
	}-*/;

	/**
	 * 设置右偏移量
	 * @param rightValue 右偏移量值
	 */
	public final native void setRight(double rightValue)
	/*-{
		this[1] = rightValue;
	}-*/;

	/**
	 * 获取下偏移量
	 * @return
	 */
	public final native double getBottom()
	/*-{
		return this[2];
	}-*/;

	/**
	 * 设置下偏移量
	 * @param bottomValue 下偏移量值
	 */
	public final native void setBottom(double bottomValue)
	/*-{
		this[2] = bottomValue;
	}-*/;
	
	/**
	 * 获取左偏移量
	 * @return
	 */
	public final native double getLeft()
	/*-{
		return this[3];
	}-*/;

	/**
	 * 设置左偏移量
	 * @param leftValue 左偏移量值
	 */
	public final native void setLeft(double leftValue)
	/*-{
		this[3] = leftValue;
	}-*/;
}
