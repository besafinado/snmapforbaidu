package cn.softnado.Gwt.Map.Baidu.Client.Dom.Service;

import com.google.gwt.core.client.JavaScriptObject;

public class TransitPolicy extends JavaScriptObject {
	protected TransitPolicy() {

	}

	public static native TransitPolicy BMAP_TRANSIT_POLICY_LEAST_TIME()
	/*-{
		return new Object($wnd.BMAP_TRANSIT_POLICY_LEAST_TIME ? $wnd.BMAP_TRANSIT_POLICY_LEAST_TIME : 0);
	}-*/;

	public static native TransitPolicy BMAP_TRANSIT_POLICY_LEAST_TRANSFER()
	/*-{
		return new Object($wnd.BMAP_TRANSIT_POLICY_LEAST_TRANSFER ? $wnd.BMAP_TRANSIT_POLICY_LEAST_TRANSFER : 2);
	}-*/;

	public static native TransitPolicy BMAP_TRANSIT_POLICY_LEAST_WALKING()
	/*-{
		return new Object($wnd.BMAP_TRANSIT_POLICY_LEAST_WALKING ? $wnd.BMAP_TRANSIT_POLICY_LEAST_WALKING : 3);
	}-*/;

	public static native TransitPolicy BMAP_TRANSIT_POLICY_AVOID_SUBWAYS()
	/*-{
		return new Object($wnd.BMAP_TRANSIT_POLICY_AVOID_SUBWAYS ? $wnd.BMAP_TRANSIT_POLICY_AVOID_SUBWAYS : 4);
	}-*/;
}
