package cn.softnado.Gwt.Map.Baidu.Client.Dom.Overlay;

import cn.softnado.Gwt.Map.Baidu.Client.Dom.HasHandlersJsObject;
import cn.softnado.Gwt.Map.Baidu.Client.Dom.Core.Map;

import com.google.gwt.dom.client.Element;

/**
 * 覆盖物的抽象基类，所有覆盖物均继承基类的方法。此类不可实例化。
 * 
 * @author softnado
 * 
 */
public abstract class Overlay extends HasHandlersJsObject {
	protected Overlay() {

	}

	public final native Element Initialize(Map map)
	/*-{
		return this.initialize(map);
	}-*/;

	public final native boolean IsVisible()
	/*-{
		return this.isVisible();
	}-*/;

	public final native void Draw()
	/*-{
		this.draw();
	}-*/;

	public final native void Show()
	/*-{
		this.show();
	}-*/;

	public final native void Hide()
	/*-{
		this.hide();
	}-*/;
}
