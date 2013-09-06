package cn.softnado.Gwt.Map.Baidu.Client.Dom.Service;

import com.google.gwt.core.client.JavaScriptObject;

public class LocationOptions extends JavaScriptObject {
	protected LocationOptions() {

	}

	public static native LocationOptions CreateInstance(double poiRadiusValue,
			int numPoisValue)
	/*-{
		return {
			poiRadius:poiRadiusValue
			,numPois:numPoisValue
		};
	}-*/;

	public final native double getPoiRadius()
	/*-{
		return this.poiRadius;
	}-*/;

	public final native void setPoiRadius(double poiRadiusValue)
	/*-{
		this.poiRadius = poiRadiusValue;
	}-*/;

	public final native int getNumPois()
	/*-{
		return this.numPois;
	}-*/;

	public final native void setNumPois(int numPoisValue)
	/*-{
		this.numPois = numPoisValue;
	}-*/;

}
