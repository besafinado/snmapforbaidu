package cn.softnado.Gwt.Map.Baidu.Client.Dom.Core;

import com.google.gwt.core.client.JavaScriptObject;

public class PanOptions extends JavaScriptObject {
	protected PanOptions() {
	}

	public static native PanOptions CreateInstance(boolean noAnimationValue)
	/*-{
		return { noAnimation:noAnimationValue };
	}-*/;

	public final native boolean getNoAnimation()
	/*-{
		return this.noAnimation;
	}-*/;

	public final native void setNoAnimation(boolean noAnimationValue)
	/*-{
		this.noAnimation = noAnimationValue;
	}-*/;

}
