package cn.softnado.Gwt.Map.Baidu.Client.Dom;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;

public class Array<T extends JavaScriptObject> extends JsArray<T> {
	protected Array() {

	}

	public static native <T extends JavaScriptObject> Array<T> CreateInstance()
	/*-{
		return new $wnd.Array();
	}-*/;

	public static native <T extends JavaScriptObject> Array<T> FixArrayIssue(
			Array<T> array)
	/*-{
		array.constructor = $wnd.Array;
		return array;
	}-*/;
}
