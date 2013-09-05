package cn.softnado.Gwt.Map.Baidu.Client.Dom;

public class TypeTargetPointPixelZoomEventArgs extends TypeTargetPointPixelEventArgs {
	protected TypeTargetPointPixelZoomEventArgs(){
		
	}
	
	public final native double getZoom()
	/*-{
		return this.zoom;
	}-*/;
}
