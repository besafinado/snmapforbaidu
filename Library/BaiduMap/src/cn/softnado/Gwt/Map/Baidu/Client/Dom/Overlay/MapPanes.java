package cn.softnado.Gwt.Map.Baidu.Client.Dom.Overlay;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.dom.client.Element;

/**
 * 此类表示地图上所有覆盖物的容器集合，没有构造函数，通过对象字面量形式表示。通过Map的getPanes方法可获得该对象实例。
 * 
 * @author softnado
 * 
 */
public class MapPanes extends JavaScriptObject {
	protected MapPanes() {

	}

	public final native Element getMapPane()
	/*-{
		return this.mapPane;
	}-*/;

	public final native Element getMarkerShadow()
	/*-{
		return this.markerShadow;
	}-*/;

	public final native Element getMarkerPane()
	/*-{
		return this.markerPane;
	}-*/;

	public final native Element getLabelPane()
	/*-{
		return this.labelPane;
	}-*/;

	public final native Element getFloatShadow()
	/*-{
		return this.floatShadow;
	}-*/;

	public final native Element getMarkerMouseTarget()
	/*-{
		return this.markerMouseTarget;
	}-*/;

	public final native Element getFloatPane()
	/*-{
		return this.floatPane;
	}-*/;

}
