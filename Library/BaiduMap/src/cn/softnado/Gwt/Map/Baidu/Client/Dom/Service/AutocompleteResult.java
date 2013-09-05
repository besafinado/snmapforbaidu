package cn.softnado.Gwt.Map.Baidu.Client.Dom.Service;

import com.google.gwt.core.client.JavaScriptObject;

public class AutocompleteResult extends JavaScriptObject {
	protected AutocompleteResult() {

	}

	public final native String getKeyword()
	/*-{
		return this.keyword;
	}-*/;

	public final native int getNumPois()
	/*-{
		return this.getNumPois();
	}-*/;

	public final native AutocompleteResultPoi getPoi(int i)
	/*-{
		return this.getPoi(i);
	}-*/;

}
