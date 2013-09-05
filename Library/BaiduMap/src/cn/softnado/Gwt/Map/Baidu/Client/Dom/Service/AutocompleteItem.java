package cn.softnado.Gwt.Map.Baidu.Client.Dom.Service;

import com.google.gwt.core.client.JavaScriptObject;

public class AutocompleteItem extends JavaScriptObject {
	protected AutocompleteItem() {

	}

	public final native int getIndex()
	/*-{
		return this.index;
	}-*/;

	public final native AutocompleteResultPoi getValue()
	/*-{
		return this.value;
	}-*/;

}
