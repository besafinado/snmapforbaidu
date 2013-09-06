package cn.softnado.Gwt.Map.Baidu.Client.Dom.Overlay;

import com.google.gwt.event.shared.HandlerRegistration;

import cn.softnado.Gwt.Map.Baidu.Client.Dom.Array;
import cn.softnado.Gwt.Map.Baidu.Client.Dom.CoreEvent;
import cn.softnado.Gwt.Map.Baidu.Client.Dom.CoreEventHandler;
import cn.softnado.Gwt.Map.Baidu.Client.Dom.TypeTargetEventArgs;
import cn.softnado.Gwt.Map.Baidu.Client.Dom.TypeTargetPointPixelEventArgs;
import cn.softnado.Gwt.Map.Baidu.Client.Dom.Base.Bounds;
import cn.softnado.Gwt.Map.Baidu.Client.Dom.Base.Point;
import cn.softnado.Gwt.Map.Baidu.Client.Dom.Core.Map;

public class Polygon extends Overlay {
	protected Polygon() {

	}

	public static native Polygon CreateInstance(Array<Point> path,
			PolygonOptions opts)
	/*-{
		return new $wnd.BMap.Polygon(path,opts);
	}-*/;

	public static native Polygon CreateInstance(Array<Point> path)
	/*-{
		return new $wnd.BMap.Polygon(path);
	}-*/;

	public final native Array<Point> getPath()
	/*-{
		return this.getPath();
	}-*/;

	public final native void setPath(Array<Point> pathValue)
	/*-{
		this.setPath(pathValue);
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
			@cn.softnado.Gwt.Map.Baidu.Client.Dom.Overlay.Polygon::FireClick(Lcn/softnado/Gwt/Map/Baidu/Client/Dom/Overlay/Polygon;Lcn/softnado/Gwt/Map/Baidu/Client/Dom/TypeTargetPointPixelEventArgs;)(owner,e);
		});
		owner.addEventListener("dblclick",function(e){
			@cn.softnado.Gwt.Map.Baidu.Client.Dom.Overlay.Polygon::FireDoubleClick(Lcn/softnado/Gwt/Map/Baidu/Client/Dom/Overlay/Polygon;Lcn/softnado/Gwt/Map/Baidu/Client/Dom/TypeTargetPointPixelEventArgs;)(owner,e);
		});
		owner.addEventListener("mousedown",function(e){
			@cn.softnado.Gwt.Map.Baidu.Client.Dom.Overlay.Polygon::FireMouseDown(Lcn/softnado/Gwt/Map/Baidu/Client/Dom/Overlay/Polygon;Lcn/softnado/Gwt/Map/Baidu/Client/Dom/TypeTargetPointPixelEventArgs;)(owner,e);
		});
		owner.addEventListener("mouseup",function(e){
			@cn.softnado.Gwt.Map.Baidu.Client.Dom.Overlay.Polygon::FireMouseUp(Lcn/softnado/Gwt/Map/Baidu/Client/Dom/Overlay/Polygon;Lcn/softnado/Gwt/Map/Baidu/Client/Dom/TypeTargetPointPixelEventArgs;)(owner,e);
		});
		owner.addEventListener("mouseout",function(e){
			@cn.softnado.Gwt.Map.Baidu.Client.Dom.Overlay.Polygon::FireMouseOut(Lcn/softnado/Gwt/Map/Baidu/Client/Dom/Overlay/Polygon;Lcn/softnado/Gwt/Map/Baidu/Client/Dom/TypeTargetPointPixelEventArgs;)(owner,e);
		});
		owner.addEventListener("mouseover",function(e){
			@cn.softnado.Gwt.Map.Baidu.Client.Dom.Overlay.Polygon::FireMouseOver(Lcn/softnado/Gwt/Map/Baidu/Client/Dom/Overlay/Polygon;Lcn/softnado/Gwt/Map/Baidu/Client/Dom/TypeTargetPointPixelEventArgs;)(owner,e);
		});
		owner.addEventListener("remove",function(e){
			@cn.softnado.Gwt.Map.Baidu.Client.Dom.Overlay.Polygon::FireRemove(Lcn/softnado/Gwt/Map/Baidu/Client/Dom/Overlay/Polygon;Lcn/softnado/Gwt/Map/Baidu/Client/Dom/TypeTargetEventArgs;)(owner,e);
		});
		owner.addEventListener("lineupdate",function(e){
			@cn.softnado.Gwt.Map.Baidu.Client.Dom.Overlay.Polygon::FireLineUpdate(Lcn/softnado/Gwt/Map/Baidu/Client/Dom/Overlay/Polygon;Lcn/softnado/Gwt/Map/Baidu/Client/Dom/TypeTargetEventArgs;)(owner,e);
		});
	}-*/;

	/**
	 * 触发点击事件事件
	 * 
	 * @param polyline
	 * @param args
	 */
	public static final void FireClick(Polygon owner,
			TypeTargetPointPixelEventArgs args) {
		CoreEvent.<TypeTargetPointPixelEventArgs, Polygon> Fire(owner, "click",
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
				CoreEvent.<TypeTargetPointPixelEventArgs, Polygon> GetType(
						this, "click"), handler);
	}

	/**
	 * 触发双击事件事件
	 * 
	 * @param polyline
	 * @param args
	 */
	public static final void FireDoubleClick(Polygon owner,
			TypeTargetPointPixelEventArgs args) {
		CoreEvent.<TypeTargetPointPixelEventArgs, Polygon> Fire(owner,
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
				.<TypeTargetPointPixelEventArgs, Polygon> GetType(this,
						"dblclick"), handler);
	}

	/**
	 * 触发鼠标按下事件事件
	 * 
	 * @param polyline
	 * @param args
	 */
	public static final void FireMouseDown(Polygon owner,
			TypeTargetPointPixelEventArgs args) {
		CoreEvent.<TypeTargetPointPixelEventArgs, Polygon> Fire(owner,
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
				.<TypeTargetPointPixelEventArgs, Polygon> GetType(this,
						"mousedown"), handler);
	}

	/**
	 * 触发鼠标抬起事件事件
	 * 
	 * @param polyline
	 * @param args
	 */
	public static final void FireMouseUp(Polygon owner,
			TypeTargetPointPixelEventArgs args) {
		CoreEvent.<TypeTargetPointPixelEventArgs, Polygon> Fire(owner,
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
				.<TypeTargetPointPixelEventArgs, Polygon> GetType(this,
						"mouseup"), handler);
	}

	/**
	 * 触发鼠标移出事件事件
	 * 
	 * @param polyline
	 * @param args
	 */
	public static final void FireMouseOut(Polygon owner,
			TypeTargetPointPixelEventArgs args) {
		CoreEvent.<TypeTargetPointPixelEventArgs, Polygon> Fire(owner,
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
				.<TypeTargetPointPixelEventArgs, Polygon> GetType(this,
						"mouseout"), handler);
	}

	/**
	 * 触发鼠标移入事件事件
	 * 
	 * @param polyline
	 * @param args
	 */
	public static final void FireMouseOver(Polygon owner,
			TypeTargetPointPixelEventArgs args) {
		CoreEvent.<TypeTargetPointPixelEventArgs, Polygon> Fire(owner,
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
				.<TypeTargetPointPixelEventArgs, Polygon> GetType(this,
						"mouseover"), handler);
	}

	/**
	 * 触发移除事件事件
	 * 
	 * @param polyline
	 * @param args
	 */
	public static final void FireRemove(Polygon owner, TypeTargetEventArgs args) {
		CoreEvent.<TypeTargetEventArgs, Polygon> Fire(owner, "remove", args);
	}

	/**
	 * 添加移除事件事件处理
	 * 
	 * @param handler
	 * @return
	 */
	public final HandlerRegistration addRemoveHandler(
			CoreEventHandler<TypeTargetEventArgs> handler) {
		return this.addHandler(CoreEvent
				.<TypeTargetEventArgs, Polygon> GetType(this, "remove"),
				handler);
	}

	/**
	 * 触发线更新事件事件
	 * 
	 * @param polyline
	 * @param args
	 */
	public static final void FireLineUpdate(Polygon owner,
			TypeTargetEventArgs args) {
		CoreEvent
				.<TypeTargetEventArgs, Polygon> Fire(owner, "lineupdate", args);
	}

	/**
	 * 添加线更新事件事件处理
	 * 
	 * @param handler
	 * @return
	 */
	public final HandlerRegistration addLineUpdateHandler(
			CoreEventHandler<TypeTargetEventArgs> handler) {
		return this.addHandler(CoreEvent
				.<TypeTargetEventArgs, Polygon> GetType(this, "lineupdate"),
				handler);
	}
}
