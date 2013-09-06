package cn.softnado.Gwt.Map.Baidu.Client.Dom.Control;

import cn.softnado.Gwt.Map.Baidu.Client.Dom.Base.Bounds;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * 此类表示一条版权信息。可作为CopyrightControl.addCopyright()方法的参数。它没有构造函数，但可通过对象字面量形式表示。
 * 
 * @author softnado
 * 
 */
public class Copyright extends JavaScriptObject {
	protected Copyright() {

	}

	/**
	 * 该版权信息所适用的地理区域。
	 * @param idValue 唯一标识符
	 * @param contentValue 版权内容，支持HTML
	 * @param boundsValue 版权适用范围
	 * @return
	 */
	public static native Copyright CreateInstance(double idValue,
			String contentValue, Bounds boundsValue)
	/*-{
		return {
			id:idValue,
			content:contentValue,
			bounds:boundsValue
		};
	}-*/;

	/**
	 * 该版权信息的唯一标识符。
	 * 
	 * @return
	 */
	public final native double getId()
	/*-{
		return this.id;
	}-*/;

	/**
	 * 该版权信息的唯一标识符。
	 * 
	 * @param idValue
	 */
	public final native void setId(double idValue)
	/*-{
		this.id = idValue;
	}-*/;

	/**
	 * 该版权的文本信息，用于显示在地图上，支持HTML内容。
	 * 
	 * @return
	 */
	public final native String getContent()
	/*-{
		return this.content;
	}-*/;

	/**
	 * 该版权的文本信息，用于显示在地图上，支持HTML内容。
	 * 
	 * @param contentValue
	 */
	public final native void setContent(String contentValue)
	/*-{
		this.content = contentValue;
	}-*/;

	/**
	 * 该版权信息所适用的地理区域。
	 * 
	 * @return
	 */
	public final native Bounds getBounds()
	/*-{
		return this.bounds;
	}-*/;

	/**
	 * 该版权信息所适用的地理区域。
	 * 
	 * @param boundsValue
	 */
	public final native void setBounds(Bounds boundsValue)
	/*-{
		this.bounds = boundsValue;
	}-*/;

}
