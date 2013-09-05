package cn.softnado.Gwt.Map.Baidu.Client.Dom.Overlay;

import com.google.gwt.core.client.JavaScriptObject;

public class PolylineOptions extends JavaScriptObject {
	protected PolylineOptions() {

	}

	public static native PolylineOptions CreateInstance(
			String strokeColorValue, double strokeWeightValue,
			double strokeOpacityValue, String strokeStyleValue,
			boolean enableMassClearValue, boolean enableEditingValue,
			boolean enableClickingValue)
	/*-{
		return {
			strokeColor:strokeColorValue
			,strokeWeight:strokeWeightValue
			,strokeOpacity:strokeOpacityValue
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
