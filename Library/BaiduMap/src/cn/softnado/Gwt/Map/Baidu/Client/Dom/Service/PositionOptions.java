package cn.softnado.Gwt.Map.Baidu.Client.Dom.Service;

import com.google.gwt.core.client.JavaScriptObject;

public class PositionOptions extends JavaScriptObject {
	protected PositionOptions() {

	}

	public static native PositionOptions CreateInstance(
			boolean enableHighAccuracyValue, double timeoutValue,
			double maximumAgeValue)
	/*-{
		return {
			enableHighAccuracy:enableHighAccuracyValue
			,timeout:timeoutValue
			,maximumAge:maximumAgeValue
		};
	}-*/;

	public final native boolean getEnableHighAccuracy()
	/*-{
		return this.enableHighAccuracy;
	}-*/;

	public final native void setEnableHighAccuracy(
			boolean enableHighAccuracyValue)
	/*-{
		this.enableHighAccuracy = enableHighAccuracyValue;
	}-*/;

	public final native double getTimeout()
	/*-{
		return this.timeout;
	}-*/;

	public final native void setTimeout(double timeoutValue)
	/*-{
		this.timeout = timeoutValue;
	}-*/;

	public final native double getMaximumAge()
	/*-{
		return this.maximumAge;
	}-*/;

	public final native void setMaximumAge(double maximumAgeValue)
	/*-{
		this.maximumAge = maximumAgeValue;
	}-*/;

}
