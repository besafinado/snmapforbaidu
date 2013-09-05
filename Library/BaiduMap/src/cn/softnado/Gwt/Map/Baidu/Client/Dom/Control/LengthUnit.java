package cn.softnado.Gwt.Map.Baidu.Client.Dom.Control;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * 常量表示长度单位制。
 * 
 * @author softnado
 * 
 */
public class LengthUnit extends JavaScriptObject {
	protected LengthUnit() {

	}

	/**
	 * 公制单位。
	 * 
	 * @return
	 */
	public static native LengthUnit BMAP_UNIT_METRIC()
	/*-{
		return new Object($wnd.BMAP_UNIT_METRIC ? $wnd.BMAP_UNIT_METRIC : "metric");
	}-*/;

	/**
	 * 英制单位。
	 * 
	 * @return
	 */
	public static native LengthUnit BMAP_UNIT_IMPERIAL()
	/*-{
		return new Object($wnd.BMAP_UNIT_IMPERIAL ? $wnd.BMAP_UNIT_IMPERIAL : "us");
	}-*/;
}
