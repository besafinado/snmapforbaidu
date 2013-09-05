package cn.softnado.Gwt.Map.Baidu.Client.Dom.Layer;

import cn.softnado.Gwt.Map.Baidu.Client.Dom.Control.Copyright;

import com.google.gwt.core.client.JavaScriptObject;

public class TileLayerOptions extends JavaScriptObject {
	protected TileLayerOptions() {

	}

	public static native TileLayerOptions CreateInstance(
			boolean transparentPngValue, String tileUrlTemplateValue,
			Copyright copyrightValue, int zIndexValue)
	/*-{
		return {
			transparentPng:transparentPngValue,
			tileUrlTemplate:tileUrlTemplateValue,
			copyright:copyrightValue,
			zIndex:zIndexValue
		};
	}-*/;

	public final native boolean getTransparentPng()
	/*-{
		return this.transparentPng;
	}-*/;

	public final native void setTransparentPng(boolean transparentPngValue)
	/*-{
		this.transparentPng = transparentPngValue;
	}-*/;

	public final native String getTileUrlTemplate()
	/*-{
		return this.tileUrlTemplate;
	}-*/;

	public final native void setTileUrlTemplate(String tileUrlTemplateValue)
	/*-{
		this.tileUrlTemplate = tileUrlTemplateValue;
	}-*/;

	public final native Copyright getCopyright()
	/*-{
		return this.copyright;
	}-*/;

	public final native void setCopyright(Copyright copyrightValue)
	/*-{
		this.copyright = copyrightValue;
	}-*/;

	public final native int getZIndex()
	/*-{
		return this.zIndex;
	}-*/;

	public final native void setZIndex(int zIndexValue)
	/*-{
		this.zIndex = zIndexValue;
	}-*/;

}
