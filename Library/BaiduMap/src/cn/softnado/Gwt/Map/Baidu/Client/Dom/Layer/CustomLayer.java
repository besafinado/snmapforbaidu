package cn.softnado.Gwt.Map.Baidu.Client.Dom.Layer;

import com.google.gwt.event.shared.HandlerRegistration;

import cn.softnado.Gwt.Map.Baidu.Client.Dom.CoreEvent;
import cn.softnado.Gwt.Map.Baidu.Client.Dom.CoreEventHandler;
import cn.softnado.Gwt.Map.Baidu.Client.Dom.TypeTargetCustompoiEventArgs;

public class CustomLayer extends TileLayer {
	protected CustomLayer() {

	}

	public static native CustomLayer CreateInstance(double databoxId,
			CustomLayerOptions opts)
	/*-{
		return new BMap.CustomLayer(databoxId,opts);
	}-*/;

	public static native CustomLayer CreateInstance(double databoxId)
	/*-{
		return new BMap.CustomLayer(databoxId,opts);
	}-*/;

	public final native void RegistOriginEvents()
	/*-{
		var owner = this;
		if(owner.OriginEventsRegisted){
			return;
		}else{
			owner.OriginEventsRegisted = true;
		}
		owner.addEventListener("hotspotclick",function(e){
			@cn.softnado.Gwt.Map.Baidu.Client.Dom.Layer.CustomLayer::FireHotspotClick(Lcn/softnado/Gwt/Map/Baidu/Client/Dom/Layer/CustomLayer;Lcn/softnado/Gwt/Map/Baidu/Client/Dom/TypeTargetCustompoiEventArgs;)(owner,e);
		});
	}-*/;

	/**
	 * 触发点击热区事件
	 * 
	 * @param owner
	 * @param args
	 */
	public static final void FireHotspotClick(CustomLayer owner,
			TypeTargetCustompoiEventArgs args) {
		CoreEvent.<TypeTargetCustompoiEventArgs, CustomLayer> Fire(owner,
				"hotspotclick", args);
	}

	/**
	 * 添加点击热区事件处理
	 * 
	 * @param handler
	 * @return
	 */
	public final HandlerRegistration addHotspotClickHandler(
			CoreEventHandler<TypeTargetCustompoiEventArgs> handler) {
		return this.addHandler(CoreEvent
				.<TypeTargetCustompoiEventArgs, CustomLayer> GetType(this,
						"hotspotclick"), handler);
	}

}
