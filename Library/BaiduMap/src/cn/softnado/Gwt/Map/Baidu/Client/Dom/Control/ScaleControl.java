package cn.softnado.Gwt.Map.Baidu.Client.Dom.Control;

/**
 * 姝ょ被琛ㄧず姣斾緥灏烘帶浠躲€? * 
 * @author softnado
 * 
 */
public class ScaleControl extends Control {
	protected ScaleControl() {

	}

	/**
	 * 鍒涘缓涓€涓瘮渚嬪昂鎺т欢銆?	 * 
	 * @param opts
	 *            鍙€夊弬鏁?	 * @return
	 */
	public static native ScaleControl CreateInstance(ScaleControlOptions opts)
	/*-{
		return new $wnd.ScaleControl(opts);
	}-*/;

	/**
	 * 鍒涘缓涓€涓瘮渚嬪昂鎺т欢銆?	 * 
	 * @return
	 */
	public static native ScaleControl CreateInstance()
	/*-{
		return new $wnd.ScaleControl();
	}-*/;

	/**
	 * 杩斿洖姣斾緥灏哄崟浣嶅埗銆?	 * 
	 * @return
	 */
	public final native LengthUnit getUnit()
	/*-{
		return this.getUnit();
	}-*/;

	/**
	 * 璁剧疆姣斾緥灏哄崟浣嶅埗銆?	 * 
	 * @param unitValue
	 */
	public final native void setUnit(LengthUnit unitValue)
	/*-{
		this.setUnit(unitValue);
	}-*/;

}
