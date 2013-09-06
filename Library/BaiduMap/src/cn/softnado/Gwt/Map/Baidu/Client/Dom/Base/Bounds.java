package cn.softnado.Gwt.Map.Baidu.Client.Dom.Base;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * 此类表示地理坐标的矩形区域。
 * 
 * @author softnado
 * 
 */
public class Bounds extends JavaScriptObject {
	protected Bounds() {
	}

	/**
	 * 创建一个包含所有给定点坐标的矩形区域。其中sw表示矩形区域的西南角，参数ne表示矩形区域的东北角。(自 1.2 新增)
	 * 
	 * @param sw
	 *            矩形区域的西南角
	 * @param ne
	 *            矩形区域的东北角
	 * @return
	 */
	public static native Bounds CreateInstance(Point sw, Point ne)
	/*-{
		return new $wnd.BMap.Bounds(sw,ne);
	}-*/;

	/**
	 * 当且仅当此矩形中的两点参数都等于其他矩形的两点参数时，返回true。
	 * 
	 * @param bounds
	 * @return
	 */
	public final native boolean Equals(Bounds bounds)
	/*-{
		return this.equals(bounds);
	}-*/;

	/**
	 * 如果点的地理坐标位于此矩形内，则返回true。
	 * 
	 * @param point
	 * @return
	 */
	public final native boolean ContainsPoint(Point point)
	/*-{
		return this.containsPoint(point);
	}-*/;

	/**
	 * 传入的矩形区域完全包含于此矩形区域中，则返回true。
	 * 
	 * @param bounds
	 * @return
	 */
	public final native boolean ContainsBounds(Bounds bounds)
	/*-{
		return this.containsBounds(bounds);
	}-*/;

	/**
	 * 计算与另一矩形的交集区域。
	 * 
	 * @param bounds
	 * @return
	 */
	public final native Bounds Intersects(Bounds bounds)
	/*-{
		return this.intersects(bounds);
	}-*/;

	/**
	 * 放大此矩形，使其包含给定的点。
	 * 
	 * @param point
	 */
	public final native void Extend(Point point)
	/*-{
		return this.extend(point);
	}-*/;

	/**
	 * 返回矩形的中心点。
	 * 
	 * @return
	 */
	public final native Point getCenter()
	/*-{
		return this.getCenter();
	}-*/;

	/**
	 * 如果矩形为空，则返回true。
	 * 
	 * @return
	 */
	public final native boolean IsEmpty()
	/*-{
		return this.isEmpty();
	}-*/;

	/**
	 * 返回矩形区域的西南角。(自 1.2 新增)
	 * 
	 * @return
	 */
	public final native Point getSouthWest()
	/*-{
		return this.getSouthWest();
	}-*/;

	/**
	 * 返回矩形区域的东北角。(自 1.2 新增)
	 * 
	 * @return
	 */
	public final native Point getNorthEast()
	/*-{
		return this.getNorthEast();
	}-*/;

	/**
	 * 返回矩形区域的跨度。(自 1.2 新增)
	 * 
	 * @return
	 */
	public final native Point ToSpan()
	/*-{
		return this.toSpan();
	}-*/;
}
