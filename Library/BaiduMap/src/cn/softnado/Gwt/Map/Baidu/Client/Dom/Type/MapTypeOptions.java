package cn.softnado.Gwt.Map.Baidu.Client.Dom.Type;

import com.google.gwt.core.client.JavaScriptObject;

public class MapTypeOptions extends JavaScriptObject {
	protected MapTypeOptions() {

	}

	public static native MapTypeOptions CreateInstance(double minZoomValue,
			double maxZoomValue, String errorImageUrlValue,
			String textColorValue, String tipsValue)
	/*-{
		return {
			minZoom:minZoomValue,
			maxZoom:maxZoomValue,
			errorImageUrl:errorImageUrlValue,
			textColor:textColorValue,
			tips:tipsValue
		};
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

	public final native String getErrorImageUrl()
	/*-{
		return this.errorImageUrl;
	}-*/;

	public final native void setErrorImageUrl(String errorImageUrlValue)
	/*-{
		this.errorImageUrl = errorImageUrlValue;
	}-*/;

	public final native String getTextColor()
	/*-{
		return this.textColor;
	}-*/;

	public final native void setTextColor(String textColorValue)
	/*-{
		this.textColor = textColorValue;
	}-*/;

	public final native String getTips()
	/*-{
		return this.tips;
	}-*/;

	public final native void setTips(String tipsValue)
	/*-{
		this.tips = tipsValue;
	}-*/;

}
