package cn.softnado.Gwt.Map.Baidu.Client.Dom.Service;

import com.google.gwt.core.client.JavaScriptObject;

public class BusListResult extends JavaScriptObject {
	protected BusListResult() {

	}

	public final native String getKeyword()
	/*-{
		return this.keyword;
	}-*/;

	public final native String getCity()
	/*-{
		return this.city;
	}-*/;

	public final native String getMoreResultsUrl()
	/*-{
		return this.moreResultsUrl;
	}-*/;

	public final native int getNumBusList()
	/*-{
		return this.getNumBusList();
	}-*/;

	public final native BusListItem getBusListItem(int i)
	/*-{
		return this.getBusListItem(i);
	}-*/;

}
