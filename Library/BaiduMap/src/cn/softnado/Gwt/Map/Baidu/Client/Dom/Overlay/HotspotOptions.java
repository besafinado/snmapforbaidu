package cn.softnado.Gwt.Map.Baidu.Client.Dom.Overlay;

import cn.softnado.Gwt.Map.Baidu.Client.Dom.Base.Offset;

import com.google.gwt.core.client.JavaScriptObject;

public class HotspotOptions extends JavaScriptObject {
	protected HotspotOptions() {

	}

	public static native HotspotOptions CreateInstance(String titleValue,
			Offset offsetValue, JavaScriptObject userDataValue,
			double minZoomValue, double maxZoomValue)
	/*-{
		return {
			title:titleValue
			,offsets:offsetValue
			,userData:userDataValue
			,minZoom:minZoomValue
			,maxZoom:maxZoomValue
		};
	}-*/;

	public static native HotspotOptions CreateInstance(String titleValue,
			Offset offsetValue, double minZoomValue, double maxZoomValue)
	/*-{
		return {
			title:titleValue
			,offsets:offsetValue
			,minZoom:minZoomValue
			,maxZoom:maxZoomValue
		};
	}-*/;

	public static native HotspotOptions CreateInstance(String titleValue,
			Offset offsetValue)
	/*-{
		return {
			title:titleValue
			,offsets:offsetValue
		};
	}-*/;

	public static native HotspotOptions CreateInstance(String titleValue,
			double minZoomValue, double maxZoomValue)
	/*-{
		return {
			title:titleValue
			,minZoom:minZoomValue
			,maxZoom:maxZoomValue
		};
	}-*/;

	public static native HotspotOptions CreateInstance(String titleValue)
	/*-{
		return {
			title:titleValue
		};
	}-*/;

	public static native HotspotOptions CreateInstance(String titleValue,
			JavaScriptObject userData)
	/*-{
		return {
			title:titleValue
			,userData:userDataValue
		};
	}-*/;

	public final native String getTitle()
	/*-{
		return this.title;
	}-*/;

	public final native void setTitle(String titleValue)
	/*-{
		this.title = titleValue;
	}-*/;

	public final native JavaScriptObject getUserData()
	/*-{
		return this.userData;
	}-*/;

	public final native void setUserData(JavaScriptObject userDataValue)
	/*-{
		this.userData = userDataValue;
	}-*/;

	public final native double getMinZoom()
	/*-{
		return this.minZoom;
	}-*/;

	public final native void setMinZoom(double minZoomValue)
	/*-{
		this.minZoom = minZoomValue;
	}-*/;

	public final native double getMaxZoom()
	/*-{
		return this.maxZoom;
	}-*/;

	public final native void setMaxZoom(double maxZoomValue)
	/*-{
		this.maxZoom = maxZoomValue;
	}-*/;

	public final native Offset getOffsets()
	/*-{
		return this.offsets;
	}-*/;

	public final native void setOffsets(Offset offsetValue)
	/*-{
		this.offsets = offsetsValue;
	}-*/;
}
