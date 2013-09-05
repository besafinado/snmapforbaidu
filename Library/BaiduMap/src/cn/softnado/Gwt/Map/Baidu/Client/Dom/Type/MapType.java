package cn.softnado.Gwt.Map.Baidu.Client.Dom.Type;

import cn.softnado.Gwt.Map.Baidu.Client.Dom.Array;
import cn.softnado.Gwt.Map.Baidu.Client.Dom.Layer.TileLayer;

import com.google.gwt.core.client.JavaScriptObject;

public class MapType extends JavaScriptObject {
	protected MapType() {

	}

	public static native MapType BMAP_NORMAL_MAP()
	/*-{
		return new Object($wnd.BMAP_NORMAL_MAP ? $wnd.BMAP_NORMAL_MAP : null);
	}-*/;

	public static native MapType BMAP_PERSPECTIVE_MAP()
	/*-{
		return new Object($wnd.BMAP_PERSPECTIVE_MAP ? $wnd.BMAP_PERSPECTIVE_MAP : null);
	}-*/;

	public static native MapType BMAP_SATELLITE_MAP()
	/*-{
		return new Object($wnd.BMAP_SATELLITE_MAP ? $wnd.BMAP_SATELLITE_MAP : null);
	}-*/;

	public static native MapType BMAP_HYBRID_MAP()
	/*-{
		return new Object($wnd.BMAP_HYBRID_MAP ? $wnd.BMAP_HYBRID_MAP : null);
	}-*/;

	public static native MapType CreateInstance(String name, TileLayer layer,
			MapTypeOptions opts)
	/*-{
		return new $wnd.BMap.MapType(name, layer, opts)
	}-*/;

	public static native MapType CreateInstance(String name,
			Array<TileLayer> layers, MapTypeOptions opts)
	/*-{
		return new $wnd.BMap.MapType(name, layers, opts)
	}-*/;

	public static native MapType CreateInstance(String name, TileLayer layer)
	/*-{
		return new $wnd.BMap.MapType(name, layer)
	}-*/;

	public static native MapType CreateInstance(String name,
			Array<TileLayer> layers)
	/*-{
		return new $wnd.BMap.MapType(name, layers)
	}-*/;

	public final native String getName()
	/*-{
		return this.getName();
	}-*/;

	public final native TileLayer getTileLayer()
	/*-{
		return this.getTileLayer();
	}-*/;

	public final native double getMinZoom()
	/*-{
		return this.getMinZoom();
	}-*/;

	public final native double getMaxZoom()
	/*-{
		return this.getMaxZoom();
	}-*/;

	public final native Projection getProjection()
	/*-{
		return this.getProjection();
	}-*/;

	public final native String getTextColor()
	/*-{
		return this.getTextColor();
	}-*/;

	public final native String getTips()
	/*-{
		return this.getTips();
	}-*/;

}
