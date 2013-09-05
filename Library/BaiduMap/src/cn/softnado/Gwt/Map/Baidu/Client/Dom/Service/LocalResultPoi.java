package cn.softnado.Gwt.Map.Baidu.Client.Dom.Service;

import cn.softnado.Gwt.Map.Baidu.Client.Dom.Base.Point;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArrayString;

public class LocalResultPoi extends JavaScriptObject {
	protected LocalResultPoi() {

	}

	public final native String getTitle()
	/*-{
		return this.title;
	}-*/;

	public final native Point getPoint()
	/*-{
		return this.point;
	}-*/;

	public final native String getUrl()
	/*-{
		return this.url;
	}-*/;

	public final native String getAddress()
	/*-{
		return this.address;
	}-*/;

	public final native String getCity()
	/*-{
		return this.city;
	}-*/;

	public final native String getPhoneNumber()
	/*-{
		return this.phoneNumber;
	}-*/;

	public final native String getPostcode()
	/*-{
		return this.postcode;
	}-*/;

	public final native PoiType getType()
	/*-{
		return this.type;
	}-*/;

	public final native boolean getIsAccurate()
	/*-{
		return this.isAccurate;
	}-*/;

	public final native String getProvince()
	/*-{
		return this.province;
	}-*/;

	public final native JsArrayString getTags()
	/*-{
		return this.tags;
	}-*/;

}
