package cn.softnado.Gwt.Map.Baidu.Client.Dom.Layer;

import cn.softnado.Gwt.Map.Baidu.Client.Dom.HasHandlersJsObject;
import cn.softnado.Gwt.Map.Baidu.Client.Dom.Base.Pixel;

/**
 * 此类表示一个地图图层，您可以向地图中添加自定义图层。
 * 
 * @author softnado
 * 
 */
public class TileLayer extends HasHandlersJsObject {
	protected TileLayer() {

	}

	public static native TileLayer CreateInstance()
	/*-{
		return new $wnd.BMap.TileLayer();
	}-*/;

	public static native TileLayer CreateInstance(TileLayerOptions opts)
	/*-{
		return new $wnd.BMap.TileLayer(opts);
	}-*/;

	public final native String getTileUrl(Pixel tileCoord, double zoom)
	/*-{
		return this.getTileUrl(tileCoord,zoom);
	}-*/;

	public final native double getCopyRight()
	/*-{
		return this.getCopyright();
	}-*/;

	public final native boolean IsTransparentPng()
	/*-{
		return this.isTransparentPng();
	}-*/;
}
