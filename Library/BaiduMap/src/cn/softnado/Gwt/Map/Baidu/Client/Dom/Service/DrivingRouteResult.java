package cn.softnado.Gwt.Map.Baidu.Client.Dom.Service;

import com.google.gwt.core.client.JavaScriptObject;

public class DrivingRouteResult extends JavaScriptObject {
	protected DrivingRouteResult() {

	}

	public final native DrivingPolicy getPolicy()
	/*-{
		return this.policy;
	}-*/;

	public final native String getCity()
	/*-{
		return this.city;
	}-*/;

	public final native String getMoreResultsUrl()
	/*-{
		return this.moreResultsUrl;
	}-*/;

	public final native TaxiFare getTaxiFare()
	/*-{
		return this.taxiFare;
	}-*/;

	public final native LocalResultPoi getStart()
	/*-{
		return this.getStart();
	}-*/;

	public final native LocalResultPoi getEnd()
	/*-{
		return this.getEnd();
	}-*/;

	public final native int getNumPlans()
	/*-{
		return this.getNumPlans();
	}-*/;

	public final native RoutePlan getPlan(int i)
	/*-{
		return this.getPlan(i);
	}-*/;

}
