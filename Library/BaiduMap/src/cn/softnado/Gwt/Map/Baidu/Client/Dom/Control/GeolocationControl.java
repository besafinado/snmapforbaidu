package cn.softnado.Gwt.Map.Baidu.Client.Dom.Control;

import com.google.gwt.event.shared.HandlerRegistration;

import cn.softnado.Gwt.Map.Baidu.Client.Dom.CoreEvent;
import cn.softnado.Gwt.Map.Baidu.Client.Dom.CoreEventHandler;
import cn.softnado.Gwt.Map.Baidu.Client.Dom.PointAddressComponentEventArgs;
import cn.softnado.Gwt.Map.Baidu.Client.Dom.StatusCodeEventArgs;
import cn.softnado.Gwt.Map.Baidu.Client.Dom.Service.AddressComponent;

/**
 * 此类是负责进行地图定位的控件，使用html5浏览器定位功能，此类继承Control所有功能。(自 1.4 新增)
 * 
 * @author softnado
 * 
 */
public class GeolocationControl extends Control {
	protected GeolocationControl() {

	}

	/**
	 * 创建一个特定样式的地图定位控件。
	 * @param opts 可选参数
	 * @return
	 */
	public static native GeolocationControl CreateInstance(
			GeolocationControlOptions opts)
	/*-{
		return new $wnd.GeolocationControl(opts);
	}-*/;

	/**
	 * 创建一个特定样式的地图定位控件。
	 * @return
	 */
	public static native GeolocationControl CreateInstance()
	/*-{
		return new $wnd.GeolocationControl();
	}-*/;

	/**
	 * 开始进行定位。
	 */
	public final native void Location()
	/*-{
		this.location();
	}-*/;

	/**
	 * 返回当前的定位信息。若当前还未定位，则返回null。
	 * @return
	 */
	public final native AddressComponent getAddressComponent()
	/*-{
		return this.getAddressComponent();
	}-*/;

	public final native void RegistOriginEvents()
	/*-{
		var owner = this;
		if(owner.OriginEventsRegisted){
			return;
		}else{
			owner.OriginEventsRegisted = true;
		}
		owner.addEventListener("locationSuccess",function(e){
			@cn.softnado.Gwt.Map.Baidu.Client.Dom.Control.GeolocationControl::FireLocationSuccess(Lcn/softnado/Gwt/Map/Baidu/Client/Dom/Control/GeolocationControl;Lcn/softnado/Gwt/Map/Baidu/Client/Dom/PointAddressComponentEventArgs;)(owner,e);
		});
		owner.addEventListener("locationError",function(e){
			@cn.softnado.Gwt.Map.Baidu.Client.Dom.Control.GeolocationControl::FireLocationError(Lcn/softnado/Gwt/Map/Baidu/Client/Dom/Control/GeolocationControl;Lcn/softnado/Gwt/Map/Baidu/Client/Dom/StatusCodeEventArgs;)(owner,e);
		});
	}-*/;

	/**
	 * 触发定位成功事件
	 * 
	 * @param owner
	 * @param args
	 */
	public static final void FireLocationSuccess(GeolocationControl owner,
			PointAddressComponentEventArgs args) {
		CoreEvent.<PointAddressComponentEventArgs, GeolocationControl> Fire(
				owner, "locationSuccess", args);
	}

	/**
	 * 添加定位成功事件处理
	 * 
	 * @param handler
	 * @return
	 */
	public final HandlerRegistration addLocationSuccessHandler(
			CoreEventHandler<PointAddressComponentEventArgs> handler) {
		return this.addHandler(CoreEvent
				.<PointAddressComponentEventArgs, GeolocationControl> GetType(
						this, "locationSuccess"), handler);
	}

	/**
	 * 触发定位失败事件
	 * 
	 * @param owner
	 * @param args
	 */
	public static final void FireLocationError(GeolocationControl owner,
			StatusCodeEventArgs args) {
		CoreEvent.<StatusCodeEventArgs, GeolocationControl> Fire(owner,
				"locationError", args);
	}

	/**
	 * 添加定位失败事件处理
	 * 
	 * @param handler
	 * @return
	 */
	public final HandlerRegistration addLocationErrorHandler(
			CoreEventHandler<StatusCodeEventArgs> handler) {
		return this.addHandler(CoreEvent
				.<StatusCodeEventArgs, GeolocationControl> GetType(this,
						"locationError"), handler);
	}

}
