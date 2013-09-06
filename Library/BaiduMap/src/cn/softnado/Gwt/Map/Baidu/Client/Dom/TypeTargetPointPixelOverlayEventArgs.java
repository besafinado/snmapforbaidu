package cn.softnado.Gwt.Map.Baidu.Client.Dom;

import cn.softnado.Gwt.Map.Baidu.Client.Dom.Overlay.Overlay;

public class TypeTargetPointPixelOverlayEventArgs extends TypeTargetPointPixelEventArgs {
	protected TypeTargetPointPixelOverlayEventArgs() {

	}

	public final native Overlay getOverlay()
	/*-{
		return this.overlay;
	}-*/;
}
