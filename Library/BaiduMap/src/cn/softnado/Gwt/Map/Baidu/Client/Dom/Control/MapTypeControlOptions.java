package cn.softnado.Gwt.Map.Baidu.Client.Dom.Control;

import cn.softnado.Gwt.Map.Baidu.Client.Dom.Array;
import cn.softnado.Gwt.Map.Baidu.Client.Dom.Type.MapType;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * 此类表示MapTypeControl构造函数的可选参数。它没有构造函数，但可通过对象字面量形式表示（自 1.2 新增）。
 * 
 * @author softnado
 * 
 */
public class MapTypeControlOptions extends JavaScriptObject {
	protected MapTypeControlOptions() {

	}

	/**
	 * MapTypeControl构造函数的可选参数
	 * 
	 * @param typeValue
	 *            控件样式。
	 * @param mapTypesValue
	 *            控件展示的地图类型，默认为普通图、卫星图、卫星加路网混合图和三维图。通过此属性可配置控件展示的地图类型。
	 * @return
	 */
	public static native MapTypeControlOptions CreateInstance(
			MapTypeControlType typeValue, Array<MapType> mapTypesValue)
	/*-{
		return {
			type:typeValue,
			mapTypes:mapTypesValue
		};
	}-*/;

	/**
	 * 控件样式。
	 * 
	 * @return
	 */
	public final native MapTypeControlType getType()
	/*-{
		return this.type;
	}-*/;

	/**
	 * 控件样式。
	 * 
	 * @param typeValue
	 */
	public final native void setType(MapTypeControlType typeValue)
	/*-{
		this.type = typeValue;
	}-*/;

	/**
	 * 控件展示的地图类型，默认为普通图、卫星图、卫星加路网混合图和三维图。通过此属性可配置控件展示的地图类型。
	 * 
	 * @return
	 */
	public final native Array<MapType> getMapTypes()
	/*-{
		return this.mapTypes;
	}-*/;

	/**
	 * 控件展示的地图类型，默认为普通图、卫星图、卫星加路网混合图和三维图。通过此属性可配置控件展示的地图类型。
	 * 
	 * @param mapTypesValue
	 */
	public final native void setMapTypes(Array<MapType> mapTypesValue)
	/*-{
		this.mapTypes = mapTypesValue;
	}-*/;

}
