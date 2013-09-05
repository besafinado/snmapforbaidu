package cn.softnado.Gwt.Map.Baidu.Client.Dom.Control;

/**
 * 此类表示比例尺控件。
 * 
 * @author softnado
 * 
 */
public class ScaleControl extends Control {
	protected ScaleControl() {

	}

	/**
	 * 创建一个比例尺控件。
	 * 
	 * @param opts
	 *            可选参数
	 * @return
	 */
	public static native ScaleControl CreateInstance(ScaleControlOptions opts)
	/*-{
		return new $wnd.ScaleControl(opts);
	}-*/;

	/**
	 * 创建一个比例尺控件。
	 * 
	 * @return
	 */
	public static native ScaleControl CreateInstance()
	/*-{
		return new $wnd.ScaleControl();
	}-*/;

	/**
	 * 返回比例尺单位制。
	 * 
	 * @return
	 */
	public final native LengthUnit getUnit()
	/*-{
		return this.getUnit();
	}-*/;

	/**
	 * 设置比例尺单位制。
	 * 
	 * @param unitValue
	 */
	public final native void setUnit(LengthUnit unitValue)
	/*-{
		this.setUnit(unitValue);
	}-*/;

}
