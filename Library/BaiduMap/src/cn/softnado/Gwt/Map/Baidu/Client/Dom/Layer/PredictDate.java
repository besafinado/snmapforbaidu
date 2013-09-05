package cn.softnado.Gwt.Map.Baidu.Client.Dom.Layer;

import com.google.gwt.core.client.JavaScriptObject;

public class PredictDate extends JavaScriptObject {
	protected PredictDate() {

	}

	public static native PredictDate CreateInstance(double weekdayValue,
			double hourValue)
	/*-{
		return {
			weekday:weekdayValue,
			hour:hourValue
		};
	}-*/;

	public final native int getHour()
	/*-{
		return this.hour;
	}-*/;

	public final native void setHour(int hourValue)
	/*-{
		this.hour = hourValue;
	}-*/;

	public final native int getWeekDay()
	/*-{
		return this.weekday;
	}-*/;

	public final native void setWeekDay(int weekdayValue)
	/*-{
		this.weekday = weekdayValue;
	}-*/;

}
