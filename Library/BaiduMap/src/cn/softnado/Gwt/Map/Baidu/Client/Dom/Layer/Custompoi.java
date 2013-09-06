package cn.softnado.Gwt.Map.Baidu.Client.Dom.Layer;

import cn.softnado.Gwt.Map.Baidu.Client.Dom.Base.Point;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArrayString;

public class Custompoi extends JavaScriptObject {
	protected Custompoi() {

	}

	public final native JavaScriptObject getExtendedData()
	/*-{
		return this.extendedData;
	}-*/;

	public final native double getTypeId()
	/*-{
		return this.typeId;
	}-*/;

	public final native JsArrayString getTags()
	/*-{
		return this.tags;
	}-*/;

	public final native Point getPoint()
	/*-{
		return this.point;
	}-*/;

	public final native String getDistrict()
	/*-{
		return this.district;
	}-*/;

	public final native double getDistrictCode()
	/*-{
		return this.districtCode;
	}-*/;

	public final native String getCity()
	/*-{
		return this.city;
	}-*/;

	public final native double getCityCode()
	/*-{
		return this.cityCode;
	}-*/;

	public final native String getProvince()
	/*-{
		return this.province;
	}-*/;

	public final native double getProvinceCode()
	/*-{
		return this.provinceCode;
	}-*/;

	public final native String getPostcode()
	/*-{
		return this.postcode;
	}-*/;

	public final native String getPhoneNumber()
	/*-{
		return this.phoneNumber;
	}-*/;

	public final native String getAddress()
	/*-{
		return this.address;
	}-*/;

	public final native String getTitle()
	/*-{
		return this.title;
	}-*/;

	public final native String getDataboxId()
	/*-{
		return this.databoxId;
	}-*/;

	public final native String getPoiId()
	/*-{
		return this.poiId;
	}-*/;

}
