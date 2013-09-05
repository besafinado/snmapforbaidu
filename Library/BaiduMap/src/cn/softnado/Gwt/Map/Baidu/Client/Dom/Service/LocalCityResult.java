package cn.softnado.Gwt.Map.Baidu.Client.Dom.Service;

import com.google.gwt.core.client.JavaScriptObject;

public class LocalCityResult extends JavaScriptObject {
	protected LocalCityResult() {

	}

	public final native LocalResultPoi getCenter()
	/*-{
		return this.center;
	}-*/;

	public final native double getLevel()
	/*-{
		return this.level;
	}-*/;

	public final native String getName()
	/*-{
		return this.name;
	}-*/;

}
