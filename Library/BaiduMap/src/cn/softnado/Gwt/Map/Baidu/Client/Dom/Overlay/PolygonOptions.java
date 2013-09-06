package cn.softnado.Gwt.Map.Baidu.Client.Dom.Overlay;

import com.google.gwt.core.client.JavaScriptObject;

public class PolygonOptions extends JavaScriptObject {
	protected PolygonOptions() {

	}

	public static native PolygonOptions CreateInstance(String strokeColorValue,
			String fillColorValue, double strokeWeightValue,
			double strokeOpacityValue, double fillOpacityValue,
			String strokeStyleValue, boolean enableMassClearValue,
			boolean enableEditingValue, boolean enableClickingValue)
	/*-{
		return {
			strokeColor:strokeColorValue
			,fillColor:fillColorValue
			,strokeWeight:strokeWeightValue
			,strokeOpacity:strokeOpacityValue
			,fillOpacity:fillOpacityValue
			,strokeStyle:strokeStyleValue
			,enableMassClear:enableMassClearValue
			,enableEditing:enableEditingValue
			,enableClicking:enableClickingValue
		};
	}-*/;

	public final native String getStrokeColor()
	/*-{
		return this.strokeColor;
	}-*/;

	public final native void setStrokeColor(String strokeColorValue)
	/*-{
		this.strokeColor = strokeColorValue;
	}-*/;

	public final native String getFillColor()
	/*-{
		return this.fillColor;
	}-*/;

	public final native void setFillColor(String fillColorValue)
	/*-{
		this.fillColor = fillColorValue;
	}-*/;

	public final native double getStrokeWeight()
	/*-{
		return this.strokeWeight;
	}-*/;

	public final native void setStrokeWeight(double strokeWeightValue)
	/*-{
		this.strokeWeight = strokeWeightValue;
	}-*/;

	public final native double getStrokeOpacity()
	/*-{
		return this.strokeOpacity;
	}-*/;

	public final native void setStrokeOpacity(double strokeOpacityValue)
	/*-{
		this.strokeOpacity = strokeOpacityValue;
	}-*/;

	public final native double getFillOpacity()
	/*-{
		return this.fillOpacity;
	}-*/;

	public final native void setFillOpacity(double fillOpacityValue)
	/*-{
		this.fillOpacity = fillOpacityValue;
	}-*/;

	public final native String getStrokeStyle()
	/*-{
		return this.strokeStyle;
	}-*/;

	public final native void setStrokeStyle(String strokeStyleValue)
	/*-{
		this.strokeStyle = strokeStyleValue;
	}-*/;

	public final native boolean getEnableMassClear()
	/*-{
		return this.enableMassClear;
	}-*/;

	public final native void setEnableMassClear(boolean enableMassClearValue)
	/*-{
		this.enableMassClear = enableMassClearValue;
	}-*/;

	public final native boolean getEnableEditing()
	/*-{
		return this.enableEditing;
	}-*/;

	public final native void setEnableEditing(boolean enableEditingValue)
	/*-{
		this.enableEditing = enableEditingValue;
	}-*/;

	public final native boolean getEnableClicking()
	/*-{
		return this.enableClicking;
	}-*/;

	public final native void setEnableClicking(boolean enableClickingValue)
	/*-{
		this.enableClicking = enableClickingValue;
	}-*/;
}
