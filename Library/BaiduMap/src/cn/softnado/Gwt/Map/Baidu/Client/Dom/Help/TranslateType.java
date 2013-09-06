package cn.softnado.Gwt.Map.Baidu.Client.Dom.Help;

import com.google.gwt.core.client.JavaScriptObject;

public class TranslateType extends JavaScriptObject {
	protected TranslateType() {

	}

	public static native TranslateType GOOGLE_TO_BAIDU()
	/*-{
		return new Object(2);
	}-*/;

	public static native TranslateType GPS_TO_BAIDU()
	/*-{
		return new Object(0);
	}-*/;
}
