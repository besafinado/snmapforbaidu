package cn.softnado.Gwt.Map.Baidu.Client.Dom;

import java.util.ArrayList;

import cn.softnado.Gwt.Map.Baidu.Client.Dom.Overlay.Hotspot;

public class HotspotsEventArgs extends TypeTargetEventArgs {
	protected HotspotsEventArgs(){
		
	}

	public final native ArrayList<Hotspot> getHotspots()
	/*-{
		return this.spots;
	}-*/;
}
