package cn.softnado.Gwt.Map.Baidu.Client.Dom.Core;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArrayNumber;

public class ViewportOptions extends JavaScriptObject {
	protected ViewportOptions() {
	}

	public static native ViewportOptions CreateInstance(
			boolean enableAnimationValue, JsArrayNumber marginsValue,
			double zoomFactorValue, double delayValue)
	/*-{
		return {
			enableAnimation:enableAnimationValue,
			margins:marginsValue,
			zoomFactor:zoomFactorValue,
			delay:delayValue
		};
	}-*/;

	public final native double getDelay()
	/*-{
		return this.delay;
	}-*/;

	public final native void setDelay(double delayValue)
	/*-{
		this.delay = delayValue;
	}-*/;

	public final native double getZoomFactor()
	/*-{
		return this.zoomFactor;
	}-*/;

	public final native void setZoomFactor(double zoomFactorValue)
	/*-{
		this.zoomFactor = zoomFactorValue;
	}-*/;

	public final native JsArrayNumber getMargins()
	/*-{
		return this.margins;
	}-*/;

	public final native void setMargins(JsArrayNumber marginsValue)
	/*-{
		this.margins = marginsValue;
	}-*/;

	public final native boolean getEnableAnimation()
	/*-{
		return this.enableAnimation;
	}-*/;

	public final native void setEnableAnimation(boolean enableAnimationValue)
	/*-{
		this.enableAnimation = enableAnimationValue;
	}-*/;

}
