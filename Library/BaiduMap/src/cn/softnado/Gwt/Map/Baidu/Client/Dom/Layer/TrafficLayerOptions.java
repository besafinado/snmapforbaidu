package cn.softnado.Gwt.Map.Baidu.Client.Dom.Layer;

import com.google.gwt.core.client.JavaScriptObject;

public class TrafficLayerOptions extends JavaScriptObject {
	protected TrafficLayerOptions() {

	}

	public static native TrafficLayerOptions CreateInstance(
			PredictDate predictDateValue)
	/*-{
		return {
			predictDate:predictDateValue
		};
	}-*/;

	public final native PredictDate getPredictDate()
	/*-{
		return this.predictDate;
	}-*/;

	public final native void setPredictDate(PredictDate predictDateValue)
	/*-{
		this.predictDate = predictDateValue;
	}-*/;

}
