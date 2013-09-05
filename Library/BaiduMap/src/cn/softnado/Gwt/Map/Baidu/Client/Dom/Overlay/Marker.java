package cn.softnado.Gwt.Map.Baidu.Client.Dom.Overlay;

import com.google.gwt.event.shared.HandlerRegistration;

import cn.softnado.Gwt.Map.Baidu.Client.Dom.CoreEvent;
import cn.softnado.Gwt.Map.Baidu.Client.Dom.TypeTargetEventArgs;
import cn.softnado.Gwt.Map.Baidu.Client.Dom.CoreEventHandler;
import cn.softnado.Gwt.Map.Baidu.Client.Dom.TypeTargetPointPixelEventArgs;
import cn.softnado.Gwt.Map.Baidu.Client.Dom.Base.Point;
import cn.softnado.Gwt.Map.Baidu.Client.Dom.Base.Size;
import cn.softnado.Gwt.Map.Baidu.Client.Dom.Core.Map;
import cn.softnado.Gwt.Map.Baidu.Client.Dom.Menu.ContextMenu;

public class Marker extends Overlay {
	protected Marker() {

	}

	public static native Marker CreateInstance(Point point)
	/*-{
		return new $wnd.BMap.Marker(point);
	}-*/;

	public static native Marker CreateInstance(Point point, MarkerOptions opts)
	/*-{
		return new $wnd.BMap.Marker(point,opts);
	}-*/;

	public final native void OpenInfoWindow(InfoWindow infoWnd)
	/*-{
		this.openInfoWindow(infoWnd);
	}-*/;

	public final native void CloseInfoWindow()
	/*-{
		this.closeInfoWindow();
	}-*/;

	public final native void setIcon(Icon icon)
	/*-{
		this.setIcon(icon);
	}-*/;

	public final native Icon getIcon()
	/*-{
		this.getIcon();
	}-*/;

	public final native void setPosition(Point position)
	/*-{
		this.setPosition(position);
	}-*/;

	public final native Point getPosition()
	/*-{
		return this.getPosition();
	}-*/;

	public final native void setOffset(Size offset)
	/*-{
		this.setOffset(offset);
	}-*/;

	public final native Size getOffset()
	/*-{
		return this.getOffset();
	}-*/;

	public final native Label getLabel()
	/*-{
		return this.getLabel();
	}-*/;

	public final native void setLabel(Label label)
	/*-{
		this.setLabel(label);
	}-*/;

	public final native void setTitle(String title)
	/*-{
		this.setTitle(title);
	}-*/;

	public final native String getTitle()
	/*-{
		return this.getTitle();
	}-*/;

	public final native void setTop(Boolean isTop)
	/*-{
		return this.setTop(isTop);
	}-*/;

	/**
	 * 开启标注拖拽功能。(自 1.1 新增)
	 */
	public final native void enableDragging()
	/*-{
		this.enableDragging();
	}-*/;

	/**
	 * 关闭标注拖拽功能。(自 1.1 新增)
	 */
	public final native void disableDragging()
	/*-{
		this.disableDragging();
	}-*/;

	/**
	 * 允许覆盖物在map.clearOverlays方法中被清除。(自 1.1 新增)
	 */
	public final native void enableMassClear()
	/*-{
		this.enableMassClear();
	}-*/;

	/**
	 * 禁止覆盖物在map.clearOverlays方法中被清除。(自 1.1 新增)
	 */
	public final native void disableMassClear()
	/*-{
		this.disableMassClear();
	}-*/;

	/**
	 * 设置覆盖物的zIndex。(自 1.1 新增)
	 * 
	 * @param zIndex
	 */
	public final native void setZIndex(int zIndex)
	/*-{
		this.setZIndex(zIndex);
	}-*/;

	/**
	 * 返回覆盖物所在的map对象。(自 1.2 新增)
	 * 
	 * @return
	 */
	public final native Map getMap()
	/*-{
		return this.getMap();
	}-*/;

	/**
	 * 添加右键菜单。(自 1.2 新增)
	 * 
	 * @param menu
	 */
	public final native void addContextMenu(ContextMenu menu)
	/*-{
		this.addContextMenu(menu);
	}-*/;

	/**
	 * 移除右键菜单。(自 1.2 新增)
	 * 
	 * @param menu
	 */
	public final native void removeContextMenu(ContextMenu menu)
	/*-{
		this.removeContextMenu(menu);
	}-*/;

	/**
	 * 设置标注动画效果。如果参数为null，则取消动画效果。(自 1.2 新增)
	 * 
	 * @param animation
	 */
	public final native void setAnimation(Animation animation)
	/*-{
		this.setAnimation(animation);
	}-*/;

	/**
	 * 设置标注阴影图标。(自 1.2 新增)
	 * 
	 * @param shadow
	 */
	public final native void setShadow(Icon shadow)
	/*-{
		this.setShadow(shadow);
	}-*/;

	public final native Icon getShadow()
	/*-{
		return this.getShadow();
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
			@cn.softnado.Gwt.Map.Baidu.Client.Dom.Overlay.Marker::FireClick(Lcn/softnado/Gwt/Map/Baidu/Client/Dom/Overlay/Marker;Lcn/softnado/Gwt/Map/Baidu/Client/Dom/TypeTargetPointPixelEventArgs;)(owner,e);
		});
		owner.addEventListener("dblclick",function(e){
			@cn.softnado.Gwt.Map.Baidu.Client.Dom.Overlay.Marker::FireDoubleclick(Lcn/softnado/Gwt/Map/Baidu/Client/Dom/Overlay/Marker;Lcn/softnado/Gwt/Map/Baidu/Client/Dom/TypeTargetPointPixelEventArgs;)(owner,e);
		});
		owner.addEventListener("mousedown",function(e){
			@cn.softnado.Gwt.Map.Baidu.Client.Dom.Overlay.Marker::FireMouseDown(Lcn/softnado/Gwt/Map/Baidu/Client/Dom/Overlay/Marker;Lcn/softnado/Gwt/Map/Baidu/Client/Dom/TypeTargetPointPixelEventArgs;)(owner,e);
		});
		owner.addEventListener("mouseup",function(e){
			@cn.softnado.Gwt.Map.Baidu.Client.Dom.Overlay.Marker::FireMouseUp(Lcn/softnado/Gwt/Map/Baidu/Client/Dom/Overlay/Marker;Lcn/softnado/Gwt/Map/Baidu/Client/Dom/TypeTargetPointPixelEventArgs;)(owner,e);
		});
		owner.addEventListener("mouseout",function(e){
			@cn.softnado.Gwt.Map.Baidu.Client.Dom.Overlay.Marker::FireMouseOut(Lcn/softnado/Gwt/Map/Baidu/Client/Dom/Overlay/Marker;Lcn/softnado/Gwt/Map/Baidu/Client/Dom/TypeTargetPointPixelEventArgs;)(owner,e);
		});
		owner.addEventListener("mouseover",function(e){
			@cn.softnado.Gwt.Map.Baidu.Client.Dom.Overlay.Marker::FireMouseOver(Lcn/softnado/Gwt/Map/Baidu/Client/Dom/Overlay/Marker;Lcn/softnado/Gwt/Map/Baidu/Client/Dom/TypeTargetPointPixelEventArgs;)(owner,e);
		});
		owner.addEventListener("remove",function(e){
			@cn.softnado.Gwt.Map.Baidu.Client.Dom.Overlay.Marker::FireRemove(Lcn/softnado/Gwt/Map/Baidu/Client/Dom/Overlay/Marker;Lcn/softnado/Gwt/Map/Baidu/Client/Dom/TypeTargetEventArgs;)(owner,e);
		});
		owner.addEventListener("infowindowclose",function(e){
			@cn.softnado.Gwt.Map.Baidu.Client.Dom.Overlay.Marker::FireInfoWindowClose(Lcn/softnado/Gwt/Map/Baidu/Client/Dom/Overlay/Marker;Lcn/softnado/Gwt/Map/Baidu/Client/Dom/TypeTargetEventArgs;)(owner,e);
		});
		owner.addEventListener("infowindowopen",function(e){
			@cn.softnado.Gwt.Map.Baidu.Client.Dom.Overlay.Marker::FireInfoWindowOpen(Lcn/softnado/Gwt/Map/Baidu/Client/Dom/Overlay/Marker;Lcn/softnado/Gwt/Map/Baidu/Client/Dom/TypeTargetEventArgs;)(owner,e);
		});
		owner.addEventListener("dragstart",function(e){
			@cn.softnado.Gwt.Map.Baidu.Client.Dom.Overlay.Marker::FireDragStart(Lcn/softnado/Gwt/Map/Baidu/Client/Dom/Overlay/Marker;Lcn/softnado/Gwt/Map/Baidu/Client/Dom/TypeTargetEventArgs;)(owner,e);
		});
		owner.addEventListener("dragging",function(e){
			@cn.softnado.Gwt.Map.Baidu.Client.Dom.Overlay.Marker::FireDragging(Lcn/softnado/Gwt/Map/Baidu/Client/Dom/Overlay/Marker;Lcn/softnado/Gwt/Map/Baidu/Client/Dom/TypeTargetPointPixelEventArgs;)(owner,e);
		});
		owner.addEventListener("dragend",function(e){
			@cn.softnado.Gwt.Map.Baidu.Client.Dom.Overlay.Marker::FireDragEnd(Lcn/softnado/Gwt/Map/Baidu/Client/Dom/Overlay/Marker;Lcn/softnado/Gwt/Map/Baidu/Client/Dom/TypeTargetPointPixelEventArgs;)(owner,e);
		});
		owner.addEventListener("rightclick",function(e){
			@cn.softnado.Gwt.Map.Baidu.Client.Dom.Overlay.Marker::FireRightClick(Lcn/softnado/Gwt/Map/Baidu/Client/Dom/Overlay/Marker;Lcn/softnado/Gwt/Map/Baidu/Client/Dom/TypeTargetEventArgs;)(owner,e);
		});
	}-*/;

	/**
	 * 触发点击事件
	 * 
	 * @param owner
	 * @param args
	 */
	public static final void FireClick(Marker owner,
			TypeTargetPointPixelEventArgs args) {
		CoreEvent.<TypeTargetPointPixelEventArgs, Marker> Fire(owner, "click",
				args);
	}

	/**
	 * 添加点击事件处理
	 * 
	 * @param handler
	 * @return
	 */
	public final HandlerRegistration addClickHandler(
			CoreEventHandler<TypeTargetPointPixelEventArgs> handler) {
		return this.addHandler(
				CoreEvent.<TypeTargetPointPixelEventArgs, Marker> GetType(this,
						"click"), handler);
	}

	/**
	 * 触发双击事件
	 * 
	 * @param owner
	 * @param args
	 */
	public static final void FireDoubleclick(Marker owner,
			TypeTargetPointPixelEventArgs args) {
		CoreEvent.<TypeTargetPointPixelEventArgs, Marker> Fire(owner,
				"dblclick", args);
	}

	/**
	 * 添加双击事件处理
	 * 
	 * @param handler
	 * @return
	 */
	public final HandlerRegistration addDoubleclickHandler(
			CoreEventHandler<TypeTargetPointPixelEventArgs> handler) {
		return this.addHandler(CoreEvent
				.<TypeTargetPointPixelEventArgs, Marker> GetType(this,
						"dblclick"), handler);
	}

	/**
	 * 触发鼠标按下事件
	 * 
	 * @param owner
	 * @param args
	 */
	public static final void FireMouseDown(Marker owner,
			TypeTargetPointPixelEventArgs args) {
		CoreEvent.<TypeTargetPointPixelEventArgs, Marker> Fire(owner,
				"mousedown", args);
	}

	/**
	 * 添加鼠标按下事件处理
	 * 
	 * @param handler
	 * @return
	 */
	public final HandlerRegistration addMouseDownHandler(
			CoreEventHandler<TypeTargetPointPixelEventArgs> handler) {
		return this.addHandler(CoreEvent
				.<TypeTargetPointPixelEventArgs, Marker> GetType(this,
						"mousedown"), handler);
	}

	/**
	 * 触发鼠标抬起事件
	 * 
	 * @param owner
	 * @param args
	 */
	public static final void FireMouseUp(Marker owner,
			TypeTargetPointPixelEventArgs args) {
		CoreEvent.<TypeTargetPointPixelEventArgs, Marker> Fire(owner,
				"mouseup", args);
	}

	/**
	 * 添加鼠标抬起事件处理
	 * 
	 * @param handler
	 * @return
	 */
	public final HandlerRegistration addMouseUpHandler(
			CoreEventHandler<TypeTargetPointPixelEventArgs> handler) {
		return this.addHandler(CoreEvent
				.<TypeTargetPointPixelEventArgs, Marker> GetType(this,
						"mouseup"), handler);
	}

	/**
	 * 触发鼠标移出事件
	 * 
	 * @param owner
	 * @param args
	 */
	public static final void FireMouseOut(Marker owner,
			TypeTargetPointPixelEventArgs args) {
		CoreEvent.<TypeTargetPointPixelEventArgs, Marker> Fire(owner,
				"mouseout", args);
	}

	/**
	 * 添加鼠标移出事件处理
	 * 
	 * @param handler
	 * @return
	 */
	public final HandlerRegistration addMouseOutHandler(
			CoreEventHandler<TypeTargetPointPixelEventArgs> handler) {
		return this.addHandler(CoreEvent
				.<TypeTargetPointPixelEventArgs, Marker> GetType(this,
						"mouseout"), handler);
	}

	/**
	 * 触发鼠标移入事件
	 * 
	 * @param owner
	 * @param args
	 */
	public static final void FireMouseOver(Marker owner,
			TypeTargetPointPixelEventArgs args) {
		CoreEvent.<TypeTargetPointPixelEventArgs, Marker> Fire(owner,
				"mouseover", args);
	}

	/**
	 * 添加鼠标移入事件处理
	 * 
	 * @param handler
	 * @return
	 */
	public final HandlerRegistration addMouseOverHandler(
			CoreEventHandler<TypeTargetPointPixelEventArgs> handler) {
		return this.addHandler(CoreEvent
				.<TypeTargetPointPixelEventArgs, Marker> GetType(this,
						"mouseover"), handler);
	}

	/**
	 * 触发移除事件
	 * 
	 * @param owner
	 * @param args
	 */
	public static final void FireRemove(Marker owner, TypeTargetEventArgs args) {
		CoreEvent.<TypeTargetEventArgs, Marker> Fire(owner, "remove", args);
	}

	/**
	 * 添加移除事件处理
	 * 
	 * @param handler
	 * @return
	 */
	public final HandlerRegistration addRemoveHandler(
			CoreEventHandler<TypeTargetEventArgs> handler) {
		return this
				.addHandler(CoreEvent.<TypeTargetEventArgs, Marker> GetType(
						this, "remove"), handler);
	}

	/**
	 * 触发信息窗关闭事件
	 * 
	 * @param owner
	 * @param args
	 */
	public static final void FireInfoWindowClose(Marker owner,
			TypeTargetEventArgs args) {
		CoreEvent.<TypeTargetEventArgs, Marker> Fire(owner, "infowindowclose",
				args);
	}

	/**
	 * 添加信息窗关闭事件处理
	 * 
	 * @param handler
	 * @return
	 */
	public final HandlerRegistration addInfoWindowCloseHandler(
			CoreEventHandler<TypeTargetEventArgs> handler) {
		return this.addHandler(CoreEvent.<TypeTargetEventArgs, Marker> GetType(
				this, "infowindowclose"), handler);
	}

	/**
	 * 触发信息窗打开事件
	 * 
	 * @param owner
	 * @param args
	 */
	public static final void FireInfoWindowOpen(Marker owner,
			TypeTargetEventArgs args) {
		CoreEvent.<TypeTargetEventArgs, Marker> Fire(owner, "infowindowopen",
				args);
	}

	/**
	 * 添加信息窗打开事件处理
	 * 
	 * @param handler
	 * @return
	 */
	public final HandlerRegistration addInfoWindowOpenHandler(
			CoreEventHandler<TypeTargetEventArgs> handler) {
		return this.addHandler(CoreEvent.<TypeTargetEventArgs, Marker> GetType(
				this, "infowindowopen"), handler);
	}

	/**
	 * 触发拖动开始事件
	 * 
	 * @param owner
	 * @param args
	 */
	public static final void FireDragStart(Marker owner,
			TypeTargetEventArgs args) {
		CoreEvent.<TypeTargetEventArgs, Marker> Fire(owner, "dragstart", args);
	}

	/**
	 * 添加拖动开始事件处理
	 * 
	 * @param handler
	 * @return
	 */
	public final HandlerRegistration addDragStartHandler(
			CoreEventHandler<TypeTargetEventArgs> handler) {
		return this.addHandler(CoreEvent.<TypeTargetEventArgs, Marker> GetType(
				this, "dragstart"), handler);
	}

	/**
	 * 触发拖动中事件
	 * 
	 * @param owner
	 * @param args
	 */
	public static final void FireDragging(Marker owner,
			TypeTargetPointPixelEventArgs args) {
		CoreEvent.<TypeTargetPointPixelEventArgs, Marker> Fire(owner,
				"dragging", args);
	}

	/**
	 * 添加拖动中事件处理
	 * 
	 * @param handler
	 * @return
	 */
	public final HandlerRegistration addDraggingHandler(
			CoreEventHandler<TypeTargetPointPixelEventArgs> handler) {
		return this.addHandler(CoreEvent
				.<TypeTargetPointPixelEventArgs, Marker> GetType(this,
						"dragging"), handler);
	}

	/**
	 * 触发拖动结束事件
	 * 
	 * @param owner
	 * @param args
	 */
	public static final void FireDragEnd(Marker owner,
			TypeTargetPointPixelEventArgs args) {
		CoreEvent.<TypeTargetPointPixelEventArgs, Marker> Fire(owner,
				"dragend", args);
	}

	/**
	 * 添加拖动结束事件处理
	 * 
	 * @param handler
	 * @return
	 */
	public final HandlerRegistration addDragEndHandler(
			CoreEventHandler<TypeTargetPointPixelEventArgs> handler) {
		return this.addHandler(CoreEvent
				.<TypeTargetPointPixelEventArgs, Marker> GetType(this,
						"dragend"), handler);
	}

	/**
	 * 触发右击事件
	 * 
	 * @param owner
	 * @param args
	 */
	public static final void FireRightClick(Marker owner,
			TypeTargetEventArgs args) {
		CoreEvent.<TypeTargetEventArgs, Marker> Fire(owner, "rightclick", args);
	}

	/**
	 * 添加右击事件处理
	 * 
	 * @param handler
	 * @return
	 */
	public final HandlerRegistration addRightClickHandler(
			CoreEventHandler<TypeTargetEventArgs> handler) {
		return this.addHandler(CoreEvent.<TypeTargetEventArgs, Marker> GetType(
				this, "rightclick"), handler);
	}

}
