package cn.softnado.Gwt.Map.Baidu.Client.Dom.Service;

import cn.softnado.Gwt.Map.Baidu.Client.Dom.Array;
import cn.softnado.Gwt.Map.Baidu.Client.Dom.Base.Point;

import com.google.gwt.core.client.JavaScriptObject;

public class GeocoderResult extends JavaScriptObject {
	protected GeocoderResult() {

	}

	public final native Point getPoint()
	/*-{
		return this.point;
	}-*/;

	public final native String getAdderss()
	/*-{
		return this.address;
	}-*/;

	public final native AddressComponent getAddressComponents()
	/*-{
		return this.addressComponents;
	}-*/;

	public final native Array<LocalResultPoi> getSurroundingPois()
	/*-{
		return this.surroundingPois;
	}-*/;

	public final native String getBusiness()
	/*-{
		return this.business;
	}-*/;
}
