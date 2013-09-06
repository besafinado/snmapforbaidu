package cn.softnado.Gwt.Map.Baidu.Client.Dom.Service;

import com.google.gwt.core.client.JavaScriptObject;

public class AutocompleteResultPoi extends JavaScriptObject {
	protected AutocompleteResultPoi() {

	}

	public final native String getProvince()
	/*-{
		return this.province;
	}-*/;

	public final native String getCity()
	/*-{
		return this.city;
	}-*/;

	public final native String getDistrict()
	/*-{
		return this.district;
	}-*/;

	public final native String getStreet()
	/*-{
		return this.street;
	}-*/;

	public final native String getStreetNumber()
	/*-{
		return this.streetNumber;
	}-*/;

	public final native String getBusiness()
	/*-{
		return this.business;
	}-*/;

}
