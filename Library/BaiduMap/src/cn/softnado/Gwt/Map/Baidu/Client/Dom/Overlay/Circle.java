package cn.softnado.Gwt.Map.Baidu.Client.Dom.Overlay;

import cn.softnado.Gwt.Map.Baidu.Client.Dom.CoreEvent;
import cn.softnado.Gwt.Map.Baidu.Client.Dom.CoreEventHandler;
import cn.softnado.Gwt.Map.Baidu.Client.Dom.TypeTargetEventArgs;
import cn.softnado.Gwt.Map.Baidu.Client.Dom.TypeTargetPointPixelEventArgs;
import cn.softnado.Gwt.Map.Baidu.Client.Dom.Base.Bounds;
import cn.softnado.Gwt.Map.Baidu.Client.Dom.Base.Point;
import cn.softnado.Gwt.Map.Baidu.Client.Dom.Core.Map;

import com.google.gwt.event.shared.HandlerRegistration;

public class Circle extends Overlay {
	protected Circle() {

	}

	public static native Circle CreateInstance(Point center, double radius,
			CircleOptions opts)
	/*-{
		return new $wnd.BMap.Circle(center,radius,opts);
	}-*/;

	public static native Circle CreateInstance(Point center, double radius)
	/*-{
		return new $wnd.BMap.Circle(center,radius);
	}-*/;

	public final native Point getCenter()
	/*-{
		return this.getCenter();
	}-*/;

	public final native void setCenter(Point centerValue)
	/*-{
		this.setCenter(centerValue);
	}-*/;

	public final native double getRadius()
	/*-{
		return this.getRadius();
	}-*/;

	public final native void setRadius(double radiusValue)
	/*-{
		this.setRadius(radiusValue);
	}-*/;

	public final native String getStrokeColor()
	/*-{
		return this.getStrokeColor();
	}-*/;

	public final native void setStrokeColor(String strokeColorValue)
	/*-{
		this.setStrokeColor(strokeColorValue);
	}-*/;

	public final native String getFillColor()
	/*-{
		return this.getFillColor();
	}-*/;

	public final native void setFillColor(String fillColorValue)
	/*-{
		this.setFillColor(fillColorValue);
	}-*/;

	public final native double getStrokeOpacity()
	/*-{
		return this.getStrokeOpacity();
	}-*/;

	public final native void setStrokeOpacity(double strokeOpacityValue)
	/*-{
		this.setStrokeOpacity(strokeOpacityValue);
	}-*/;

	public final native double getFillOpacity()
	/*-{
		return this.getFillOpacity();
	}-*/;

	public final native void setFillOpacity(double fillOpacityValue)
	/*-{
		this.setFillOpacity(fillOpacityValue);
	}-*/;

	public final native double getStrokeWeight()
	/*-{
		return this.getStrokeWeight();
	}-*/;

	public final native void setStrokeWeight(double strokeWeightValue)
	/*-{
		this.setStrokeWeight(strokeWeightValue);
	}-*/;

	public final native String getStrokeStyle()
	/*-{
		return this.getStrokeStyle();
	}-*/;

	public final native void setStrokeStyle(String strokeStyleValue)
	/*-{
		this.setStrokeStyle(strokeStyleValue);
	}-*/;

	public final native Bounds getBounds()
	/*-{
		return this.getBounds();
	}-*/;

	public final native void EnableEditing()
	/*-{
		this.enableEditing();
	}-*/;

	public final native void DisableEditing()
	/*-{
		this.disableEditing();
	}-*/;

	public final native void EnableMassClear()
	/*-{
		this.enableMassClear();
	}-*/;

	public final native void DisableMassClear()
	/*-{
		this.disableMassClear();
	}-*/;

	public final native void setPositionAt(int index, Point point)
	/*-{
		this.setPositionAt(index,point);		
	}-*/;

	public final native Map getMap()
	/*-{
		return this.getMap();
	}-*/;

	public final native void RegistOriginEvents()
	/*-{
		var owner = this;
		if(owner.OriginEventsRegisted){
			return;
		}else{
			owner.OriginEventsRegisted = true;
		}
		owner.addEventListener("click",function(e){
			@cn.softnado.Gwt.Map.Baidu.Client.Dom.Overlay.Circle::FireClick(Lcn/softnado/Gwt/Map/Baidu/Client/Dom/Overlay/Circle;Lcn/softnado/Gwt/Map/Baidu/Client/Dom/TypeTargetPointPixelEventArgs;)(owner,e);
		});
		owner.addEventListener("dblclick",function(e){
			@cn.softnado.Gwt.Map.Baidu.Client.Dom.Overlay.Circle::FireDoubleClick(Lcn/softnado/Gwt/Map/Baidu/Client/Dom/Overlay/Circle;Lcn/softnado/Gwt/Map/Baidu/Client/Dom/TypeTargetPointPixelEventArgs;)(owner,e);
		});
		owner.addEventListener("mousedown",function(e){
			@cn.softnado.Gwt.Map.Baidu.Client.Dom.Overlay.Circle::FireMouseDown(Lcn/softnado/Gwt/Map/Baidu/Client/Dom/Overlay/Circle;Lcn/softnado/Gwt/Map/Baidu/Client/Dom/TypeTargetPointPixelEventArgs;)(owner,e);
		});
		owner.addEventListener("mouseup",function(e){
			@cn.softnado.Gwt.Map.Baidu.Client.Dom.Overlay.Circle::FireMouseUp(Lcn/softnado/Gwt/Map/Baidu/Client/Dom/Overlay/Circle;Lcn/softnado/Gwt/Map/Baidu/Client/Dom/TypeTargetPointPixelEventArgs;)(owner,e);
		});
		owner.addEventListener("mouseout",function(e){
			@cn.softnado.Gwt.Map.Baidu.Client.Dom.Overlay.Circle::FireMouseOut(Lcn/softnado/Gwt/Map/Baidu/Client/Dom/Overlay/Circle;Lcn/softnado/Gwt/Map/Baidu/Client/Dom/TypeTargetPointPixelEventArgs;)(owner,e);
		});
		owner.addEventListener("mouseover",function(e){
			@cn.softnado.Gwt.Map.Baidu.Client.Dom.Overlay.Circle::FireMouseOver(Lcn/softnado/Gwt/Map/Baidu/Client/Dom/Overlay/Circle;Lcn/softnado/Gwt/Map/Baidu/Client/Dom/TypeTargetPointPixelEventArgs;)(owner,e);
		});
		owner.addEventListener("remove",function(e){
			@cn.softnado.Gwt.Map.Baidu.Client.Dom.Overlay.Circle::FireRemove(Lcn/softnado/Gwt/Map/Baidu/Client/Dom/Overlay/Circle;Lcn/softnado/Gwt/Map/Baidu/Client/Dom/TypeTargetEventArgs;)(owner,e);
		});
		owner.addEventListener("lineupdate",function(e){
			@cn.softnado.Gwt.Map.Baidu.Client.Dom.Overlay.Circle::FireLineUpdate(Lcn/softnado/Gwt/Map/Baidu/Client/Dom/Overlay/Circle;Lcn/softnado/Gwt/Map/Baidu/Client/Dom/TypeTargetEventArgs;)(owner,e);
		});
	}-*/;

	/**
	 * 触发点击事件事件
	 * 
	 * @param polyline
	 * @param args
	 */
	public static final void FireClick(Circle owner,
			TypeTargetPointPixelEventArgs args) {
		CoreEvent.<TypeTargetPointPixelEventArgs, Circle> Fire(owner, "click",
				args);
	}

	/**
	 * 添加点击事件事件处理
	 * 
	 * @param handler
	 * @return
	 */
	public final HandlerRegistration addClickHandler(
			CoreEventHandler<TypeTargetPointPixelEventArgs> handler) {
		return this.addHandler(
				CoreEvent.<TypeTargetPointPixelEventArgs, Circle> GetType(this,
						"click"), handler);
	}

	/**
	 * 触发双击事件事件
	 * 
	 * @param polyline
	 * @param args
	 */
	public static final void FireDoubleClick(Circle owner,
			TypeTargetPointPixelEventArgs args) {
		CoreEvent.<TypeTargetPointPixelEventArgs, Circle> Fire(owner,
				"dblclick", args);
	}

	/**
	 * 添加双击事件事件处理
	 * 
	 * @param handler
	 * @return
	 */
	public final HandlerRegistration addDoubleClickHandler(
			CoreEventHandler<TypeTargetPointPixelEventArgs> handler) {
		return this.addHandler(CoreEvent
				.<TypeTargetPointPixelEventArgs, Circle> GetType(this,
						"dblclick"), handler);
	}

	/**
	 * 触发鼠标按下事件事件
	 * 
	 * @param polyline
	 * @param args
	 */
	public static final void FireMouseDown(Circle owner,
			TypeTargetPointPixelEventArgs args) {
		CoreEvent.<TypeTargetPointPixelEventArgs, Circle> Fire(owner,
				"mousedown", args);
	}

	/**
	 * 添加鼠标按下事件事件处理
	 * 
	 * @param handler
	 * @return
	 */
	public final HandlerRegistration addMouseDownHandler(
			CoreEventHandler<TypeTargetPointPixelEventArgs> handler) {
		return this.addHandler(CoreEvent
				.<TypeTargetPointPixelEventArgs, Circle> GetType(this,
						"mousedown"), handler);
	}

	/**
	 * 触发鼠标抬起事件事件
	 * 
	 * @param polyline
	 * @param args
	 */
	public static final void FireMouseUp(Circle owner,
			TypeTargetPointPixelEventArgs args) {
		CoreEvent.<TypeTargetPointPixelEventArgs, Circle> Fire(owner,
				"mouseup", args);
	}

	/**
	 * 添加鼠标抬起事件事件处理
	 * 
	 * @param handler
	 * @return
	 */
	public final HandlerRegistration addMouseUpHandler(
			CoreEventHandler<TypeTargetPointPixelEventArgs> handler) {
		return this.addHandler(CoreEvent
				.<TypeTargetPointPixelEventArgs, Circle> GetType(this,
						"mouseup"), handler);
	}

	/**
	 * 触发鼠标移出事件事件
	 * 
	 * @param polyline
	 * @param args
	 */
	public static final void FireMouseOut(Circle owner,
			TypeTargetPointPixelEventArgs args) {
		CoreEvent.<TypeTargetPointPixelEventArgs, Circle> Fire(owner,
				"mouseout", args);
	}

	/**
	 * 添加鼠标移出事件事件处理
	 * 
	 * @param handler
	 * @return
	 */
	public final HandlerRegistration addMouseOutHandler(
			CoreEventHandler<TypeTargetPointPixelEventArgs> handler) {
		return this.addHandler(CoreEvent
				.<TypeTargetPointPixelEventArgs, Circle> GetType(this,
						"mouseout"), handler);
	}

	/**
	 * 触发鼠标移入事件事件
	 * 
	 * @param polyline
	 * @param args
	 */
	public static final void FireMouseOver(Circle owner,
			TypeTargetPointPixelEventArgs args) {
		CoreEvent.<TypeTargetPointPixelEventArgs, Circle> Fire(owner,
				"mouseover", args);
	}

	/**
	 * 添加鼠标移入事件事件处理
	 * 
	 * @param handler
	 * @return
	 */
	public final HandlerRegistration addMouseOverHandler(
			CoreEventHandler<TypeTargetPointPixelEventArgs> handler) {
		return this.addHandler(CoreEvent
				.<TypeTargetPointPixelEventArgs, Circle> GetType(this,
						"mouseover"), handler);
	}

	/**
	 * 触发移除事件事件
	 * 
	 * @param polyline
	 * @param args
	 */
	public static final void FireRemove(Circle owner, TypeTargetEventArgs args) {
		CoreEvent.<TypeTargetEventArgs, Circle> Fire(owner, "remove", args);
	}

	/**
	 * 添加移除事件事件处理
	 * 
	 * @param handler
	 * @return
	 */
	public final HandlerRegistration addRemoveHandler(
			CoreEventHandler<TypeTargetEventArgs> handler) {
		return this
				.addHandler(CoreEvent.<TypeTargetEventArgs, Circle> GetType(
						this, "remove"), handler);
	}

	/**
	 * 触发线更新事件事件
	 * 
	 * @param polyline
	 * @param args
	 */
	public static final void FireLineUpdate(Circle owner,
			TypeTargetEventArgs args) {
		CoreEvent.<TypeTargetEventArgs, Circle> Fire(owner, "lineupdate", args);
	}

	/**
	 * 添加线更新事件事件处理
	 * 
	 * @param handler
	 * @return
	 */
	public final HandlerRegistration addLineUpdateHandler(
			CoreEventHandler<TypeTargetEventArgs> handler) {
		return this.addHandler(CoreEvent.<TypeTargetEventArgs, Circle> GetType(
				this, "lineupdate"), handler);
	}
}
