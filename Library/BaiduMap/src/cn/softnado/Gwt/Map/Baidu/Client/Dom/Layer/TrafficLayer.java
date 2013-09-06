package cn.softnado.Gwt.Map.Baidu.Client.Dom.Layer;

public class TrafficLayer extends TileLayer {
	protected TrafficLayer() {

	}

	public static native TrafficLayer CreateInstance(TrafficLayerOptions opts)
	/*-{
		return new $wnd.BMap.TrafficLayer(opts);
	}-*/;

	public static native TrafficLayer CreateInstance()
	/*-{
		return new $wnd.BMap.TrafficLayer();
	}-*/;
}
