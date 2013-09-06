package cn.softnado.Gwt.Map.Baidu.Client.Dom.Service;

import com.google.gwt.core.client.JavaScriptObject;

public class AddressComponent extends JavaScriptObject {
	protected AddressComponent() {

	}

	public final native String getStreetNumber()
	/*-{
		return this.streetNumber;
	}-*/;

	public final native String getStreet()
	/*-{
		return this.street;
	}-*/;

	public final native String getDistrict()
	/*-{
		return this.district;
	}-*/;

	public final native String getCity()
	/*-{
		return this.city;
	}-*/;

	public final native String getProvince()
	/*-{
		return this.province;
	}-*/;
}
