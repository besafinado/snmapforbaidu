package cn.softnado.Gwt.Map.Baidu.Client.Dom.Service;

import com.google.gwt.core.client.JavaScriptObject;

public class LocalCityOptions extends JavaScriptObject {
	protected LocalCityOptions() {

	}

	public static native LocalCityOptions CreateInstance(
			RenderOptions renderOptionsValue)
	/*-{
		return {
			renderOptions:renderOptionsValue
		};
	}-*/;

	public final native RenderOptions getRenderOptions()
	/*-{
		return this.renderOptions;
	}-*/;

	public final native void setRenderOptions(RenderOptions renderOptionsValue)
	/*-{
		this.renderOptions = renderOptionsValue;
	}-*/;

}
