package cn.softnado.Gwt.Map.Baidu.Client.Dom.Service;

import com.google.gwt.core.client.JavaScriptObject;

public class TaxiFareDetail extends JavaScriptObject {
	protected TaxiFareDetail() {

	}

	public final native double getInitialFare()
	/*-{
		return this.initialFare;
	}-*/;

	public final native double getUnitFare()
	/*-{
		return this.unitFare;
	}-*/;

	public final native double getTotalFare()
	/*-{
		return this.totalFare;
	}-*/;

}
