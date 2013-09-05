package cn.softnado.Gwt.Map.Baidu.Client.Dom.Overlay;

import com.google.gwt.core.client.JavaScriptObject;

import cn.softnado.Gwt.Map.Baidu.Client.Dom.Base.Point;

/**
 * 此类表示地图上的一个热区。(自 1.2 新增)
 * 
 * @author softnado
 * 
 */
public class Hotspot extends Overlay {
	protected Hotspot() {

	}

	public static native Hotspot CreateInstance(Point position,
			HotspotOptions opts)
	/*-{
		return new $wnd.BMap.Hotspot(position,opts);
	}-*/;

	public static native Hotspot CreateInstance(Point position)
	/*-{
		return new $wnd.BMap.Hotspot(position);
	}-*/;

	public final native Point getPosition()
	/*-{
		return this.getPosition();
	}-*/;

	public final native void setPosition(Point positionValue)
	/*-{
		this.setPosition(positionValue);
	}-*/;

	public final native String getText()
	/*-{
		return this.getText();
	}-*/;

	public final native void setText(String textValue)
	/*-{
		this.setText(textValue);
	}-*/;

	public final native JavaScriptObject getUserData()
	/*-{
		return this.getUserData();
	}-*/;

	public final native void setUserData(JavaScriptObject userDataValue)
	/*-{
		this.setUserData(userDataValue);
	}-*/;
}
