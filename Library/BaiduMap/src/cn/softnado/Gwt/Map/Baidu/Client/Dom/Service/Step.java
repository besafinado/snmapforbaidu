package cn.softnado.Gwt.Map.Baidu.Client.Dom.Service;

import cn.softnado.Gwt.Map.Baidu.Client.Dom.Base.Point;

import com.google.gwt.core.client.JavaScriptObject;

public class Step extends JavaScriptObject {
	protected Step() {

	}

	public final native Point getPosition()
	/*-{
		return this.getPosition();
	}-*/;

	public final native int getIndex()
	/*-{
		return this.getIndex();
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

}
