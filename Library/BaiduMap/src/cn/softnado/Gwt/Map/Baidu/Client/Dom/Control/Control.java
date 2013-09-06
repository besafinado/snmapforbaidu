package cn.softnado.Gwt.Map.Baidu.Client.Dom.Control;

import com.google.gwt.dom.client.Element;

import cn.softnado.Gwt.Map.Baidu.Client.Dom.HasHandlersJsObject;
import cn.softnado.Gwt.Map.Baidu.Client.Dom.Base.Size;
import cn.softnado.Gwt.Map.Baidu.Client.Dom.Core.Map;

/**
 * 此类是所有控件的基类，您可以通过此类来实现自定义控件。所有控件均包含Control类的属性、方法和事件。通过Map.addControl()
 * 方法可将控件添加到地图上。
 * 
 * defaultAnchor enum ControlAnchor 控件默认的停靠位置。自定义控件时需要提供此属性，作为控件的默认停靠位置。
 * defaultOffset Size 控件默认的位置偏移值。自定义控件时需要提供此属性，作为控件的默认偏移位置。
 * 
 * @author softnado
 * 
 */
public abstract class Control extends HasHandlersJsObject {
	protected Control() {

	}

	/**
	 * 抽象方法。调用Map.addControl()方法添加控件时将调用此方法，从而实现该控件的初始化。自定义控件时需要实现此方法，
	 * 并将元素的DOM元素在该方法中返回。DOM元素需要添加到地图的容器中，使用map.getContainer()方法可获得地图容器元素。
	 * 
	 * @param map
	 *            地图元素
	 * @return HTMLElement
	 */
	public final native Element Initialize(Map map)
	/*-{
		return this.initialize(map);
	}-*/;

	/**
	 * 设置控件停靠的位置。
	 * 
	 * @param anchor
	 */
	public final native void setAnchor(ControlAnchor anchor)
	/*-{
		this.setAnchor(anchor);
	}-*/;

	/**
	 * 返回控件停靠的位置。
	 * 
	 * @return
	 */
	public final native ControlAnchor getAnchor()
	/*-{
		return this.getAnchor();
	}-*/;

	/**
	 * 返回控件停靠的偏移量。
	 * 
	 * @return
	 */
	public final native Size getOffset()
	/*-{
		return this.getOffset();
	}-*/;

	/**
	 * 设置控件停靠的偏移量。
	 * 
	 * @param offset
	 *            偏移量值
	 */
	public final native void setOffset(Size offset)
	/*-{
		return this.setOffset(offset);
	}-*/;

	/**
	 * 显示控件。
	 */
	public final native void Show()
	/*-{
		this.show();
	}-*/;

	/**
	 * 隐藏控件。
	 */
	public final native void Hide()
	/*-{
		this.hide();
	}-*/;

	/**
	 * 判断控件的可见性。
	 * 
	 * @return
	 */
	public final native boolean IsVisible()
	/*-{
		return this.isVisible();
	}-*/;

	/**
	 * 返回描述类型字符串。如果需要，自定义控件需要自行实现此方法以获得描述自身类型的字符串。
	 * 
	 * @return
	 */
	public final native String ToString()
	/*-{
		return this.toString();
	}-*/;
}
