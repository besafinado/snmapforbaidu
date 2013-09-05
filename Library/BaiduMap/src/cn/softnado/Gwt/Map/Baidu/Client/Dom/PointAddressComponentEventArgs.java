package cn.softnado.Gwt.Map.Baidu.Client.Dom;

import cn.softnado.Gwt.Map.Baidu.Client.Dom.Base.Point;
import cn.softnado.Gwt.Map.Baidu.Client.Dom.Service.AddressComponent;

public class PointAddressComponentEventArgs extends CoreEventArgs {
	protected PointAddressComponentEventArgs() {

	}

	public final native Point getPoint()
	/*-{
		return this.point;
	}-*/;

	public final native AddressComponent getAddressComponent()
	/*-{
		return this.AddressComponent;
	}-*/;
}
