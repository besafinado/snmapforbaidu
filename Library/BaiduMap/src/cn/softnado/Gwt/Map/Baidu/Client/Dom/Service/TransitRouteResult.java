package cn.softnado.Gwt.Map.Baidu.Client.Dom.Service;

import com.google.gwt.core.client.JavaScriptObject;

public class TransitRouteResult extends JavaScriptObject {
	protected TransitRouteResult() {

	}

	public final native TransitPolicy getPolicy()
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

	public final native TransitRoutePlan getPlan(int i)
	/*-{
		return this.getPlan(i);
	}-*/;

}
