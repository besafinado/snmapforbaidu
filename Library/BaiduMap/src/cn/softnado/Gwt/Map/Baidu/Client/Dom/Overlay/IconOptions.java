package cn.softnado.Gwt.Map.Baidu.Client.Dom.Overlay;

import cn.softnado.Gwt.Map.Baidu.Client.Dom.Base.Size;

import com.google.gwt.core.client.JavaScriptObject;

public class IconOptions extends JavaScriptObject {
	protected IconOptions() {

	}

	public static native IconOptions CreateInstance(Size anchorValue,
			Size imageOffsetValue, Size infoWindowAnchorValue,
			String printImageUrlValue)
	/*-{
		return {
			offset:offsetValue
			,anchor:anchorValue
			,imageOffset:imageOffsetValue
			,infoWindowOffset:infoWindowOffsetValue
			,infoWindowAnchor:infoWindowAnchorValue
			,printImageUrl:printImageUrlValue
		};
	}-*/;

	public final native Size getAnchor()
	/*-{
		return this.anchor;
	}-*/;

	public final native void setAnchor(Size anchorValue)
	/*-{
		this.anchor = anchorValue;
	}-*/;

	public final native Size getImageOffset()
	/*-{
		return this.imageOffset;
	}-*/;

	public final native void setImageOffset(Size imageOffsetValue)
	/*-{
		this.imageOffset = imageOffsetValue;
	}-*/;

	public final native Size getInfoWindowAnchor()
	/*-{
		return this.infoWindowAnchor;
	}-*/;

	public final native void setInfoWindowAnchor(Size infoWindowAnchorValue)
	/*-{
		this.infoWindowAnchor = infoWindowAnchorValue;
	}-*/;

	public final native String getPrintImageUrl()
	/*-{
		return this.printImageUrl;
	}-*/;

	public final native void setPrintImageUrl(String printImageUrlValue)
	/*-{
		this.printImageUrl = printImageUrlValue;
	}-*/;
}
