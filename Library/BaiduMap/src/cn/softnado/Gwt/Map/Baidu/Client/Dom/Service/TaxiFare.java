package cn.softnado.Gwt.Map.Baidu.Client.Dom.Service;

import com.google.gwt.core.client.JavaScriptObject;

public class TaxiFare extends JavaScriptObject {
	protected TaxiFare() {

	}

	public final native TaxiFareDetail getDay()
	/*-{
		return this.day;
	}-*/;

	public final native TaxiFareDetail getNeight()
	/*-{
		return this.night;
	}-*/;

	public final native double getDistance()
	/*-{
		return this.distance;
	}-*/;

	public final native String getRemark()
	/*-{
		return this.remark;
	}-*/;

}
