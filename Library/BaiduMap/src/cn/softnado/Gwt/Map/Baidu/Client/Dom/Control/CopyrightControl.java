package cn.softnado.Gwt.Map.Baidu.Client.Dom.Control;

import cn.softnado.Gwt.Map.Baidu.Client.Dom.Array;

/**
 * 此类表示版权控件，您可以在地图上添加自己的版权信息。每一个版权信息需要包含如下内容：版权的唯一标识、版权内容和其适用的区域范围。
 * 
 * @author softnado
 * 
 */
public class CopyrightControl extends Control {
	protected CopyrightControl() {

	}

	/**
	 * 创建一个版权控件实例。
	 * 
	 * @param opts
	 * @return
	 */
	public static native CopyrightControl CreateInstance(
			CopyrightControlOptions opts)
	/*-{
		return new $wnd.BMap.CopyrightControl(opts);
	}-*/;

	/**
	 * 创建一个版权控件实例。
	 * 
	 * @return
	 */
	public static native CopyrightControl CreateInstance()
	/*-{
		return new $wnd.BMap.CopyrightControl();
	}-*/;

	/**
	 * 添加版权信息。
	 * 
	 * @param copyright
	 */
	public final native void AddCopyright(Copyright copyright)
	/*-{
		this.addCopyright(copyright);
	}-*/;

	/**
	 * 移除版权信息。
	 * 
	 * @param id
	 */
	public final native void RemoveCopyright(double id)
	/*-{
		this.removeCopyright(id);
	}-*/;

	/**
	 * 返回单个版权信息。
	 * 
	 * @param id
	 * @return
	 */
	public final native Copyright getCopyright(double id)
	/*-{
		return this.getCopyright(id);
	}-*/;

	/**
	 * 返回版权信息列表。
	 * 
	 * @return
	 */
	public final native Array<Copyright> getCopyrightCollection()
	/*-{
		return this.getCopyrightCollection();
	}-*/;
}
