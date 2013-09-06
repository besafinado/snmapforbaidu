package cn.softnado.Gwt.Map.Baidu.Client.Dom.Overlay;

import cn.softnado.Gwt.Map.Baidu.Client.Dom.Base.Size;

public class Icon extends Overlay {
	protected Icon() {

	}

	public static native Icon CreateInstance(String url, Size size)
	/*-{
		return new $wnd.BMap.Icon(url,size);
	}-*/;

	public static native Icon CreateInstance(String url, Size size,
			IconOptions opts)
	/*-{
		return new $wnd.BMap.Icon(url,size,opts);
	}-*/;

	public final native Size getAnchor()
	/*-{
		return this.anchor;
	}-*/;

	public final native void setAnchor(Size anchorValue)
	/*-{
		this.setAnchor(anchorValue);
	}-*/;

	public final native Size getSize()
	/*-{
		return this.size;
	}-*/;

	public final native void setSize(Size sizeValue)
	/*-{
		this.setSize(sizeValue);
	}-*/;

	public final native Size getImageOffset()
	/*-{
		return this.imageOffset;
	}-*/;

	public final native void setImageOffset(Size imageOffsetValue)
	/*-{
		this.setImageOffset(imageOffsetValue);
	}-*/;

	public final native Size getImageSize()
	/*-{
		return this.imageSize;
	}-*/;

	public final native void setImageSize(Size imageSizeValue)
	/*-{
		this.setImageSize(imageSizeValue);
	}-*/;

	public final native String getImageUrl()
	/*-{
		return this.imageUrl;
	}-*/;

	public final native void setImageUrl(String imageUrlValue)
	/*-{
		this.setImageUrl(imageUrlValue);
	}-*/;

	public final native Size getInfoWindowAnchor()
	/*-{
		return this.infoWindowAnchor;
	}-*/;

	public final native void setInfoWindowAnchor(Size infoWindowAnchorValue)
	/*-{
		this.setInfoWindowAnchor(infoWindowAnchorValue);
	}-*/;

	public final native String getPrintImageUrl()
	/*-{
		return this.printImageUrl;
	}-*/;

	public final native void setPrintImageUrl(String printImageUrlValue)
	/*-{
		this.setPrintImageUrl(printImageUrlValue);
	}-*/;
}
