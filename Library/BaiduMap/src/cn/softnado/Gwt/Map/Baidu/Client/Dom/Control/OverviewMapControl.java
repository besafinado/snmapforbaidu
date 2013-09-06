package cn.softnado.Gwt.Map.Baidu.Client.Dom.Control;

import com.google.gwt.event.shared.HandlerRegistration;

import cn.softnado.Gwt.Map.Baidu.Client.Dom.CoreEvent;
import cn.softnado.Gwt.Map.Baidu.Client.Dom.CoreEventHandler;
import cn.softnado.Gwt.Map.Baidu.Client.Dom.TypeTargetEventArgs;
import cn.softnado.Gwt.Map.Baidu.Client.Dom.TypeTargetIsOpenEventArgs;
import cn.softnado.Gwt.Map.Baidu.Client.Dom.Base.Size;

/**
 * 此类表示缩略地图控件。
 * 
 * @author softnado
 * 
 */
public class OverviewMapControl extends Control {
	protected OverviewMapControl() {

	}

	/**
	 * 创建一个缩略地图控件实例。
	 * 
	 * @param opts
	 * @return
	 */
	public static native OverviewMapControl CreateInstance(
			OverviewMapControlOptions opts)
	/*-{
		return new $wnd.OverviewMapControl(opts);
	}-*/;

	/**
	 * 创建一个缩略地图控件实例。
	 * 
	 * @return
	 */
	public static native OverviewMapControl CreateInstance()
	/*-{
		return new $wnd.OverviewMapControl();
	}-*/;

	/**
	 * 切换缩略地图控件的开合状态。
	 */
	public final native void ChangeView()
	/*-{
		this.changeView();
	}-*/;

	/**
	 * 返回缩略地图的大小。
	 * 
	 * @return
	 */
	public final native Size getSize()
	/*-{
		return this.getSize();
	}-*/;

	/**
	 * 设置缩略地图的大小。
	 * 
	 * @param sizeValue
	 */
	public final native void setSize(Size sizeValue)
	/*-{
		this.setSize(sizeValue);
	}-*/;

	public final native void RegistOriginEvents()
	/*-{
		var owner = this;
		if(owner.OriginEventsRegisted){
			return;
		}else{
			owner.OriginEventsRegisted = true;
		}
		owner.addEventListener("viewchanged",function(e){
			@cn.softnado.Gwt.Map.Baidu.Client.Dom.Control.OverviewMapControl::FireViewChanged(Lcn/softnado/Gwt/Map/Baidu/Client/Dom/Control/OverviewMapControl;Lcn/softnado/Gwt/Map/Baidu/Client/Dom/TypeTargetIsOpenEventArgs;)(owner,e);
		});
		owner.addEventListener("viewchanging",function(e){
			@cn.softnado.Gwt.Map.Baidu.Client.Dom.Control.OverviewMapControl::FireViewChanging(Lcn/softnado/Gwt/Map/Baidu/Client/Dom/Control/OverviewMapControl;Lcn/softnado/Gwt/Map/Baidu/Client/Dom/TypeTargetEventArgs;)(owner,e);
		});
	}-*/;

	/**
	 * 触发开合状态变化事件
	 * 
	 * @param owner
	 * @param args
	 */
	public static final void FireViewChanged(OverviewMapControl owner,
			TypeTargetIsOpenEventArgs args) {
		CoreEvent.<TypeTargetIsOpenEventArgs, OverviewMapControl> Fire(owner,
				"viewchanged", args);
	}

	/**
	 * 添加开合状态变化事件处理
	 * 
	 * @param handler
	 * @return
	 */
	public final HandlerRegistration addViewChangedHandler(
			CoreEventHandler<TypeTargetIsOpenEventArgs> handler) {
		return this.addHandler(CoreEvent
				.<TypeTargetIsOpenEventArgs, OverviewMapControl> GetType(this,
						"viewchanged"), handler);
	}

	/**
	 * 触发开合状态变化中事件
	 * 
	 * @param owner
	 * @param args
	 */
	public static final void FireViewChanging(OverviewMapControl owner,
			TypeTargetEventArgs args) {
		CoreEvent.<TypeTargetEventArgs, OverviewMapControl> Fire(owner,
				"viewchanging", args);
	}

	/**
	 * 添加开合状态变化中事件处理
	 * 
	 * @param handler
	 * @return
	 */
	public final HandlerRegistration addViewChangingHandler(
			CoreEventHandler<TypeTargetEventArgs> handler) {
		return this.addHandler(CoreEvent
				.<TypeTargetEventArgs, OverviewMapControl> GetType(this,
						"viewchanging"), handler);
	}

}
