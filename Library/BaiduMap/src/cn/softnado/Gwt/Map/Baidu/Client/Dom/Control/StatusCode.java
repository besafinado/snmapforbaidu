package cn.softnado.Gwt.Map.Baidu.Client.Dom.Control;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * 姝ゅ父閲忕敤浜庢弿杩板璞″綋鍓嶇姸鎬併€? * 
 * @author softnado
 * 
 */
public class StatusCode extends JavaScriptObject {
	protected StatusCode() {

	}

	/**
	 * 娌℃湁鏉冮檺銆傚搴旀暟鍊尖€?鈥濄€?鑷?1.1 鏂板)
	 * 
	 * @return
	 */
	public static native StatusCode BMAP_STATUS_PERMISSION_DENIED()
	/*-{
		return new Object($wnd.BMAP_STATUS_PERMISSION_DENIED ? $wnd.BMAP_STATUS_PERMISSION_DENIED : 6);
	}-*/;

	/**
	 * 鏈嶅姟涓嶅彲鐢ㄣ€傚搴旀暟鍊尖€?鈥濄€?鑷?1.1 鏂板)
	 * 
	 * @return
	 */
	public static native StatusCode BMAP_STATUS_SERVICE_UNAVAILABLE()
	/*-{
		return new Object($wnd.BMAP_STATUS_SERVICE_UNAVAILABLE ? $wnd.BMAP_STATUS_SERVICE_UNAVAILABLE : 7);
	}-*/;

	/**
	 * 瓒呮椂銆傚搴旀暟鍊尖€?鈥濄€?鑷?1.1 鏂板)
	 * 
	 * @return
	 */
	public static native StatusCode BMAP_STATUS_TIMEOUT()
	/*-{
		return new Object($wnd.BMAP_STATUS_TIMEOUT ? $wnd.BMAP_STATUS_TIMEOUT : 8);
	}-*/;
}
