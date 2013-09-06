package cn.softnado.Gwt.Map.Baidu.Client.Dom.Service;

import com.google.gwt.core.client.JavaScriptObject;

public class BusListItem extends JavaScriptObject {
	protected BusListItem() {

	}

	public final native String getName()
	/*-{
		return this.name;
	}-*/;

}
