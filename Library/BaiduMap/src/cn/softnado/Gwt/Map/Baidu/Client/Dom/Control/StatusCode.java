package cn.softnado.Gwt.Map.Baidu.Client.Dom.Control;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * 此常量用于描述对象当前状态。
 * 
 * @author softnado
 * 
 */
public class StatusCode extends JavaScriptObject {
	protected StatusCode() {

	}

	/**
	 * 没有权限。对应数值“6”。(自 1.1 新增)
	 * 
	 * @return
	 */
	public static native StatusCode BMAP_STATUS_PERMISSION_DENIED()
	/*-{
		return new Object($wnd.BMAP_STATUS_PERMISSION_DENIED ? $wnd.BMAP_STATUS_PERMISSION_DENIED : 6);
	}-*/;

	/**
	 * 服务不可用。对应数值“7”。(自 1.1 新增)
	 * 
	 * @return
	 */
	public static native StatusCode BMAP_STATUS_SERVICE_UNAVAILABLE()
	/*-{
		return new Object($wnd.BMAP_STATUS_SERVICE_UNAVAILABLE ? $wnd.BMAP_STATUS_SERVICE_UNAVAILABLE : 7);
	}-*/;

	/**
	 * 超时。对应数值“8”。(自 1.1 新增)
	 * 
	 * @return
	 */
	public static native StatusCode BMAP_STATUS_TIMEOUT()
	/*-{
		return new Object($wnd.BMAP_STATUS_TIMEOUT ? $wnd.BMAP_STATUS_TIMEOUT : 8);
	}-*/;
}
