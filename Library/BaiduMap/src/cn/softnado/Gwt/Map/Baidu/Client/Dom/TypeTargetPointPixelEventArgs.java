package cn.softnado.Gwt.Map.Baidu.Client.Dom;

import cn.softnado.Gwt.Map.Baidu.Client.Dom.Base.Pixel;

public class TypeTargetPointPixelEventArgs extends TypeTargetPointEventArgs {
	protected TypeTargetPointPixelEventArgs() {

	}

	public final native Pixel getPixel()
	/*-{
		return this.pixel;
	}-*/;

}
