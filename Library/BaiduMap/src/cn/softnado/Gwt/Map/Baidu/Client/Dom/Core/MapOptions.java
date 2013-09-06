package cn.softnado.Gwt.Map.Baidu.Client.Dom.Core;

import cn.softnado.Gwt.Map.Baidu.Client.Dom.Type.MapType;

import com.google.gwt.core.client.JavaScriptObject;

public class MapOptions extends JavaScriptObject {
	protected MapOptions() {
	}

	public static native MapOptions CreateInstance(double minZoomValue,
			double maxZoomValue, MapType mapTypeValue,
			boolean enableHighResolutionValue, boolean enableAutoResizeValue)
	/*-{
		return {
			minZoom:minZoomValue,
			maxZoom:maxZoomValue,
			mapType:mapTypeValue,
			enableHighResolution:enableHighResolutionValue,
			enableAutoResize:enableAutoResizeValue
		};
	}-*/;

	public final native boolean getEnableAutoResize()
	/*-{
		return this.enableAutoResize;
	}-*/;

	public final native void setEnableAutoResize(boolean enableAutoResizeValue)
	/*-{
		this.enableAutoResize = enableAutoResizeValue;
	}-*/;

	public final native boolean getEnableHighResolution()
	/*-{
		return this.enableHighResolution;
	}-*/;

	public final native void setEnableHighResolution(
			boolean enableHighResolutionValue)
	/*-{
		this.enableHighResolution = enableHighResolutionValue;
	}-*/;

	public final native MapType getMapType()
	/*-{
		return this.mapType;
	}-*/;

	public final native void setMapType(MapType mapTypeValue)
	/*-{
		this.mapType = mapTypeValue;
	}-*/;

	public final native double getMaxZoom()
	/*-{
		return this.maxZoom;
	}-*/;

	public final native void setMaxZoom(double maxZoomValue)
	/*-{
		this.maxZoom = maxZoomValue;
	}-*/;

	public final native double getMinZoom()
	/*-{
		return this.minZoom;
	}-*/;

	public final native void setMinZoom(double minZoomValue)
	/*-{
		this.minZoom = minZoomValue;
	}-*/;

}
