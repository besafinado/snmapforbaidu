package cn.softnado.Gwt.Map.Baidu.Client.Dom.Control;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * 此常量表示MapTypeControl的外观样式（自 1.2 新增）。
 * 
 * @author softnado
 * 
 */
public class MapTypeControlType extends JavaScriptObject {

	protected MapTypeControlType() {

	}

	/**
	 * 按钮水平方式展示，默认采用此类型展示。
	 * 
	 * @return
	 */
	public static native MapTypeControlType BMAP_MAPTYPE_CONTROL_HORIZONTAL()
	/*-{
		return new Object($wnd.BMAP_MAPTYPE_CONTROL_HORIZONTAL ? $wnd.BMAP_MAPTYPE_CONTROL_HORIZONTAL : 0);
	}-*/;

	/**
	 * 按钮呈下拉列表方式展示。
	 * 
	 * @return
	 */
	public static native MapTypeControlType BMAP_MAPTYPE_CONTROL_DROPDOWN()
	/*-{
		return new Object($wnd.BMAP_MAPTYPE_CONTROL_DROPDOWN ? $wnd.BMAP_MAPTYPE_CONTROL_DROPDOWN : 1);
	}-*/;
}
