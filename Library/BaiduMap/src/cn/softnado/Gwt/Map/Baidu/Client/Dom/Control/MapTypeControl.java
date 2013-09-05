package cn.softnado.Gwt.Map.Baidu.Client.Dom.Control;

/**
 * 此类是负责切换地图类型的控件，此类继承Control所有功能。
 * 
 * @author softnado
 * 
 */
public class MapTypeControl extends Control {
	protected MapTypeControl() {

	}

	/**
	 * 构建切换地图类型的控件
	 * 
	 * @param opts
	 *            可选参数
	 * @return
	 */
	public static native MapTypeControl CreateInstance(
			MapTypeControlOptions opts)
	/*-{
		return new $wnd.BMap.MapTypeControl(opts);
	}-*/;

	/**
	 * 构建切换地图类型的控件
	 * 
	 * @return
	 */
	public static native MapTypeControl CreateInstance()
	/*-{
		return new $wnd.BMap.MapTypeControl();
	}-*/;
}
