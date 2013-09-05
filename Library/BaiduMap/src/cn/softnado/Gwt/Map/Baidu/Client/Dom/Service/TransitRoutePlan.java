package cn.softnado.Gwt.Map.Baidu.Client.Dom.Service;

import com.google.gwt.core.client.JavaScriptObject;

public class TransitRoutePlan extends JavaScriptObject {
	protected TransitRoutePlan() {

	}

	public final native int getNumLines()
	/*-{
		return this.getNumLines();
	}-*/;

	public final native Line getLine(int i)
	/*-{
		return this.getLine(i);
	}-*/;

	public final native int getNumRoutes()
	/*-{
		return this.getNumRoutes();
	}-*/;

	public final native Route getRoute(int i)
	/*-{
		return this.getRoute(i);
	}-*/;

	public final native String getDescriptionAsText()
	/*-{
		return this.getDescription(false);
	}-*/;

	public final native String getDescriptionAsHtml()
	/*-{
		return this.getDescription(true);
	}-*/;

	public final native String getDistanceAsString()
	/*-{
		return this.getDistance(true);
	}-*/;

	public final native double getDistanceAsDouble()
	/*-{
		return this.getDistance(false);
	}-*/;

	public final native String getDurationAsDateString()
	/*-{
		return this.getDuration(true);
	}-*/;

	public final native double getDurationAsSeconds()
	/*-{
		return this.getDuration(false);
	}-*/;
}
