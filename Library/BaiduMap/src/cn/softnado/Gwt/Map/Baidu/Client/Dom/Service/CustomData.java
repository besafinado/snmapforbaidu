package cn.softnado.Gwt.Map.Baidu.Client.Dom.Service;

import com.google.gwt.core.client.JavaScriptObject;

public class CustomData extends JavaScriptObject {
	protected CustomData() {

	}

	public static native CustomData CreateInstance(double databoxIdValue)
	/*-{
		return {
			databoxId:databoxIdValue
		};
	}-*/;

	public final native double getDataboxId()
	/*-{
		return this.databoxId;
	}-*/;

	public final native void setDataboxId(double databoxIdValue)
	/*-{
		this.databoxId = databoxIdValue;
	}-*/;

}
