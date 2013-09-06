package cn.softnado.Gwt.Map.Baidu.Client.Dom.Overlay;

import cn.softnado.Gwt.Map.Baidu.Client.Dom.Base.Point;
import cn.softnado.Gwt.Map.Baidu.Client.Dom.Base.Size;

import com.google.gwt.core.client.JavaScriptObject;

public class LabelOptions extends JavaScriptObject {
	protected LabelOptions() {

	}

	public static native LabelOptions CreateInstance(Size offsetValue,
			Point positionValue, boolean enableMassClearValue)
	/*-{
		return {
			offset:offsetValue,
			position:positionValue,
			enableMassClear:enableMassClearValue
		};
	}-*/;

	public final native Size getOffset()
	/*-{
		return this.offset;
	}-*/;

	public final native void setOffset(Size offsetValue)
	/*-{
		this.offset = offsetValue;
	}-*/;

	public final native Point getPosition()
	/*-{
		return this.position;
	}-*/;

	public final native void setPosition(Point positionValue)
	/*-{
		this.position = positionValue;
	}-*/;
	
	public final native boolean getEnableMassClear()
	/*-{
		return this.enableMassClear;
	}-*/;
	
	public final native void setEnableMassClear(boolean enableMassClearValue)
	/*-{
		this.enableMassClear = enableMassClearValue;
	}-*/;
}
