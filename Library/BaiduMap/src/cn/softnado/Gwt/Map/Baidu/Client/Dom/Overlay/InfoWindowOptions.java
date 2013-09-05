package cn.softnado.Gwt.Map.Baidu.Client.Dom.Overlay;

import cn.softnado.Gwt.Map.Baidu.Client.Dom.Base.Size;

import com.google.gwt.core.client.JavaScriptObject;

public class InfoWindowOptions extends JavaScriptObject {
	protected InfoWindowOptions() {

	}

	public static native InfoWindowOptions CreateInstance(double widthValue,
			double heightValue, double maxWidthValue, Size offsetValue,
			String titleValue, boolean enableAutoPanValue,
			boolean enableCloseOnClickValue)
	/*-{
		return {
			width:widthValue
			,height:heightValue
			,maxWidth:maxWidthValue
			,offset:offsetValue
			,title:titleValue
			,enableAutoPan:enableAutoPanValue
			,enableCloseOnClick:enableCloseOnClickValue
		};
	}-*/;

	public final native double getWidth()
	/*-{
		return this.width;
	}-*/;

	public final native void setWidth(double widthValue)
	/*-{
		this.width = widthValue;
	}-*/;

	public final native double getHeight()
	/*-{
		return this.height;
	}-*/;

	public final native void setHeight(double heightValue)
	/*-{
		this.height = heightValue;
	}-*/;

	public final native double getMaxWidth()
	/*-{
		return this.maxWidth;
	}-*/;

	public final native void setMaxWidth(double maxWidthValue)
	/*-{
		this.maxWidth = maxWidthValue;
	}-*/;

	public final native Size getOffset()
	/*-{
		return this.offset;
	}-*/;

	public final native void setOffset(Size offsetValue)
	/*-{
		this.offset = offsetValue;
	}-*/;

	public final native String getTitle()
	/*-{
		return this.title;
	}-*/;

	public final native void setTitle(String titleValue)
	/*-{
		this.title = titleValue;
	}-*/;

	public final native boolean getEnableAutoPan()
	/*-{
		return this.enableAutoPan;
	}-*/;

	public final native void setEnableAutoPan(boolean enableAutoPanValue)
	/*-{
		this.enableAutoPan = enableAutoPanValue;
	}-*/;

	public final native boolean getEnableCloseOnClick()
	/*-{
		return this.enableCloseOnClick;
	}-*/;

	public final native void setEnableCloseOnClick(
			boolean enableCloseOnClickValue)
	/*-{
		this.enableCloseOnClick = enableCloseOnClickValue;
	}-*/;
}
