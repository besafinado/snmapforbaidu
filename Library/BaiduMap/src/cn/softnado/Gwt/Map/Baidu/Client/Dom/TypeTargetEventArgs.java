package cn.softnado.Gwt.Map.Baidu.Client.Dom;

import com.google.gwt.core.client.JavaScriptObject;

public class TypeTargetEventArgs extends CoreEventArgs {
	protected TypeTargetEventArgs() {

	}

	public final native String getType()
	/*-{
		return this.type;
	}-*/;

	public final native JavaScriptObject getTarget()
	/*-{
		return this.target;
	}-*/;
}
