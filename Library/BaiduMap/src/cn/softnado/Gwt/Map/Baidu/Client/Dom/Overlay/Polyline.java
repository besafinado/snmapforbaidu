package cn.softnado.Gwt.Map.Baidu.Client.Dom.Overlay;

import com.google.gwt.event.shared.HandlerRegistration;

import cn.softnado.Gwt.Map.Baidu.Client.Dom.Array;
import cn.softnado.Gwt.Map.Baidu.Client.Dom.CoreEvent;
import cn.softnado.Gwt.Map.Baidu.Client.Dom.TypeTargetEventArgs;
import cn.softnado.Gwt.Map.Baidu.Client.Dom.CoreEventHandler;
import cn.softnado.Gwt.Map.Baidu.Client.Dom.TypeTargetPointPixelEventArgs;
import cn.softnado.Gwt.Map.Baidu.Client.Dom.Base.Bounds;
import cn.softnado.Gwt.Map.Baidu.Client.Dom.Base.Point;
import cn.softnado.Gwt.Map.Baidu.Client.Dom.Core.Map;

public class Polyline extends Overlay {
	protected Polyline() {

	}

	public static native Polyline CreateInstance(Array<Point> points,
			PolylineOptions opts)
	/*-{
		return new $wnd.BMap.Polyline(points,opts);
	}-*/;

	public static native Polyline CreateInstance(Array<Point> points)
	/*-{
		return new $wnd.BMap.Polyline(points);
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

	public final native double getStrokeOpacity()
	/*-{
		return this.getStrokeOpacity();
	}-*/;

	public final native void setStrokeOpacity(double strokeOpacityValue)
	/*-{
		this.setStrokeOpacity(strokeOpacityValue);
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
		var polyline = this;
		if(owner.OriginEventsRegisted){
			return;
		}else{
			owner.OriginEventsRegisted = true;
		}
		polyline.addEventListener("click",function(e){
			@cn.softnado.Gwt.Map.Baidu.Client.Dom.Overlay.Polyline::FireClick(Lcn/softnado/Gwt/Map/Baidu/Client/Dom/Overlay/Polyline;Lcn/softnado/Gwt/Map/Baidu/Client/Dom/TypeTargetPointPixelEventArgs;)(polyline,e);
		});
		polyline.addEventListener("dblclick",function(e){
			@cn.softnado.Gwt.Map.Baidu.Client.Dom.Overlay.Polyline::FireDoubleClick(Lcn/softnado/Gwt/Map/Baidu/Client/Dom/Overlay/Polyline;Lcn/softnado/Gwt/Map/Baidu/Client/Dom/TypeTargetPointPixelEventArgs;)(polyline,e);
		});
		polyline.addEventListener("mousedown",function(e){
			@cn.softnado.Gwt.Map.Baidu.Client.Dom.Overlay.Polyline::FireMouseDown(Lcn/softnado/Gwt/Map/Baidu/Client/Dom/Overlay/Polyline;Lcn/softnado/Gwt/Map/Baidu/Client/Dom/TypeTargetPointPixelEventArgs;)(polyline,e);
		});
		polyline.addEventListener("mouseup",function(e){
			@cn.softnado.Gwt.Map.Baidu.Client.Dom.Overlay.Polyline::FireMouseUp(Lcn/softnado/Gwt/Map/Baidu/Client/Dom/Overlay/Polyline;Lcn/softnado/Gwt/Map/Baidu/Client/Dom/TypeTargetPointPixelEventArgs;)(polyline,e);
		});
		polyline.addEventListener("mouseout",function(e){
			@cn.softnado.Gwt.Map.Baidu.Client.Dom.Overlay.Polyline::FireMouseOut(Lcn/softnado/Gwt/Map/Baidu/Client/Dom/Overlay/Polyline;Lcn/softnado/Gwt/Map/Baidu/Client/Dom/TypeTargetPointPixelEventArgs;)(polyline,e);
		});
		polyline.addEventListener("mouseover",function(e){
			@cn.softnado.Gwt.Map.Baidu.Client.Dom.Overlay.Polyline::FireMouseOver(Lcn/softnado/Gwt/Map/Baidu/Client/Dom/Overlay/Polyline;Lcn/softnado/Gwt/Map/Baidu/Client/Dom/TypeTargetPointPixelEventArgs;)(polyline,e);
		});
		polyline.addEventListener("remove",function(e){
			@cn.softnado.Gwt.Map.Baidu.Client.Dom.Overlay.Polyline::FireRemove(Lcn/softnado/Gwt/Map/Baidu/Client/Dom/Overlay/Polyline;Lcn/softnado/Gwt/Map/Baidu/Client/Dom/TypeTargetEventArgs;)(polyline,e);
		});
		polyline.addEventListener("lineupdate",function(e){
			@cn.softnado.Gwt.Map.Baidu.Client.Dom.Overlay.Polyline::FireLineUpdate(Lcn/softnado/Gwt/Map/Baidu/Client/Dom/Overlay/Polyline;Lcn/softnado/Gwt/Map/Baidu/Client/Dom/TypeTargetEventArgs;)(polyline,e);
		});
	}-*/;

	/**
	 * 触发点击事件事件
	 * 
	 * @param polyline
	 * @param args
	 */
	public static final void FireClick(Polyline polyline,
			TypeTargetPointPixelEventArgs args) {
		CoreEvent.<TypeTargetPointPixelEventArgs, Polyline> Fire(polyline,
				"click", args);
	}

	/**
	 * 添加点击事件事件处理
	 * 
	 * @param handler
	 * @return
	 */
	public final HandlerRegistration addClickHandler(
			CoreEventHandler<TypeTargetPointPixelEventArgs> handler) {
		return this.addHandler(CoreEvent
				.<TypeTargetPointPixelEventArgs, Polyline> GetType(this,
						"click"), handler);
	}

	/**
	 * 触发双击事件事件
	 * 
	 * @param polyline
	 * @param args
	 */
	public static final void FireDoubleClick(Polyline polyline,
			TypeTargetPointPixelEventArgs args) {
		CoreEvent.<TypeTargetPointPixelEventArgs, Polyline> Fire(polyline,
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
				.<TypeTargetPointPixelEventArgs, Polyline> GetType(this,
						"dblclick"), handler);
	}

	/**
	 * 触发鼠标按下事件事件
	 * 
	 * @param polyline
	 * @param args
	 */
	public static final void FireMouseDown(Polyline polyline,
			TypeTargetPointPixelEventArgs args) {
		CoreEvent.<TypeTargetPointPixelEventArgs, Polyline> Fire(polyline,
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
				.<TypeTargetPointPixelEventArgs, Polyline> GetType(this,
						"mousedown"), handler);
	}

	/**
	 * 触发鼠标抬起事件事件
	 * 
	 * @param polyline
	 * @param args
	 */
	public static final void FireMouseUp(Polyline polyline,
			TypeTargetPointPixelEventArgs args) {
		CoreEvent.<TypeTargetPointPixelEventArgs, Polyline> Fire(polyline,
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
				.<TypeTargetPointPixelEventArgs, Polyline> GetType(this,
						"mouseup"), handler);
	}

	/**
	 * 触发鼠标移出事件事件
	 * 
	 * @param polyline
	 * @param args
	 */
	public static final void FireMouseOut(Polyline polyline,
			TypeTargetPointPixelEventArgs args) {
		CoreEvent.<TypeTargetPointPixelEventArgs, Polyline> Fire(polyline,
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
				.<TypeTargetPointPixelEventArgs, Polyline> GetType(this,
						"mouseout"), handler);
	}

	/**
	 * 触发鼠标移入事件事件
	 * 
	 * @param polyline
	 * @param args
	 */
	public static final void FireMouseOver(Polyline polyline,
			TypeTargetPointPixelEventArgs args) {
		CoreEvent.<TypeTargetPointPixelEventArgs, Polyline> Fire(polyline,
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
				.<TypeTargetPointPixelEventArgs, Polyline> GetType(this,
						"mouseover"), handler);
	}

	/**
	 * 触发移除事件事件
	 * 
	 * @param polyline
	 * @param args
	 */
	public static final void FireRemove(Polyline polyline,
			TypeTargetEventArgs args) {
		CoreEvent
				.<TypeTargetEventArgs, Polyline> Fire(polyline, "remove", args);
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
				.<TypeTargetEventArgs, Polyline> GetType(this, "remove"),
				handler);
	}

	/**
	 * 触发线更新事件事件
	 * 
	 * @param polyline
	 * @param args
	 */
	public static final void FireLineUpdate(Polyline polyline,
			TypeTargetEventArgs args) {
		CoreEvent.<TypeTargetEventArgs, Polyline> Fire(polyline, "lineupdate",
				args);
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
				.<TypeTargetEventArgs, Polyline> GetType(this, "lineupdate"),
				handler);
	}

}
