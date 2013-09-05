package cn.softnado.Gwt.Map.Baidu.Client.Dom.Service;

import com.google.gwt.core.client.JavaScriptObject;

public class DrivingPolicy extends JavaScriptObject {
	protected DrivingPolicy() {

	}

	public static native DrivingPolicy BMAP_DRIVING_POLICY_LEAST_TIME()
	/*-{
		return new Object($wnd.BMAP_DRIVING_POLICY_LEAST_TIME ? $wnd.BMAP_DRIVING_POLICY_LEAST_TIME : 0);
	}-*/;

	public static native DrivingPolicy BMAP_DRIVING_POLICY_LEAST_DISTANCE()
	/*-{
		return new Object($wnd.BMAP_DRIVING_POLICY_LEAST_DISTANCE ? $wnd.BMAP_DRIVING_POLICY_LEAST_DISTANCE : 1);
	}-*/;

	public static native DrivingPolicy BMAP_DRIVING_POLICY_AVOID_HIGHWAYS()
	/*-{
		return new Object($wnd.BMAP_DRIVING_POLICY_AVOID_HIGHWAYS ? $wnd.BMAP_DRIVING_POLICY_AVOID_HIGHWAYS : 2);
	}-*/;
}
