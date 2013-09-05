package cn.softnado.Gwt.Map.Baidu.Client.Dom.Overlay;

import com.google.gwt.dom.client.Style;
import com.google.gwt.event.shared.HandlerRegistration;

import cn.softnado.Gwt.Map.Baidu.Client.Dom.CoreEvent;
import cn.softnado.Gwt.Map.Baidu.Client.Dom.CoreEventHandler;
import cn.softnado.Gwt.Map.Baidu.Client.Dom.TypeTargetEventArgs;
import cn.softnado.Gwt.Map.Baidu.Client.Dom.Base.Point;
import cn.softnado.Gwt.Map.Baidu.Client.Dom.Base.Size;
import cn.softnado.Gwt.Map.Baidu.Client.Dom.Core.Map;

public class Label extends Overlay {
	protected Label() {

	}

	public static native Label CreateInstance(String content)
	/*-{
		return new $wnd.BMap.Label(content);
	}-*/;

	public static native Label CreateInstance(String content, LabelOptions opts)
	/*-{
		return new $wnd.BMap.Label(content,opts);
	}-*/;

	public final native void setStyle(Style style)
	/*-{
		this.setStyle(style);
	}-*/;

	public final native void setContent(String content)
	/*-{
		this.setContent(content);
	}-*/;

	public final native Point getPosition()
	/*-{
		return this.getPosition();
	}-*/;

	public final native void setPosition(Point positionValue)
	/*-{
		this.setPosition(positionValue);
	}-*/;

	public final native Size getOffset()
	/*-{
		return this.getOffset();
	}-*/;

	public final native void setOffset(Size offsetValue)
	/*-{
		this.setOffset(offsetValue);
	}-*/;

	public final native String getTitle()
	/*-{
		return this.getTitle();
	}-*/;

	public final native void setTitle(String titleValue)
	/*-{
		this.setTitle(titleValue);
	}-*/;

	public final native void EnableMassClear()
	/*-{
		this.enableMassClear();
	}-*/;

	public final native void DisableMassClear()
	/*-{
		this.disableMassClear();
	}-*/;

	public final native void setZIndex(double zIndexValue)
	/*-{
		this.setZIndex(zIndexValue);
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
			@cn.softnado.Gwt.Map.Baidu.Client.Dom.Overlay.Label::FireClick(Lcn/softnado/Gwt/Map/Baidu/Client/Dom/Overlay/Label;Lcn/softnado/Gwt/Map/Baidu/Client/Dom/TypeTargetEventArgs;)(owner,e);
		});
		owner.addEventListener("dblclick",function(e){
			@cn.softnado.Gwt.Map.Baidu.Client.Dom.Overlay.Label::FireDoubleClick(Lcn/softnado/Gwt/Map/Baidu/Client/Dom/Overlay/Label;Lcn/softnado/Gwt/Map/Baidu/Client/Dom/TypeTargetEventArgs;)(owner,e);
		});
		owner.addEventListener("mousedown",function(e){
			@cn.softnado.Gwt.Map.Baidu.Client.Dom.Overlay.Label::FireMouseDown(Lcn/softnado/Gwt/Map/Baidu/Client/Dom/Overlay/Label;Lcn/softnado/Gwt/Map/Baidu/Client/Dom/TypeTargetEventArgs;)(owner,e);
		});
		owner.addEventListener("mouseup",function(e){
			@cn.softnado.Gwt.Map.Baidu.Client.Dom.Overlay.Label::FireMouseUp(Lcn/softnado/Gwt/Map/Baidu/Client/Dom/Overlay/Label;Lcn/softnado/Gwt/Map/Baidu/Client/Dom/TypeTargetEventArgs;)(owner,e);
		});
		owner.addEventListener("mouseout",function(e){
			@cn.softnado.Gwt.Map.Baidu.Client.Dom.Overlay.Label::FireMouseOut(Lcn/softnado/Gwt/Map/Baidu/Client/Dom/Overlay/Label;Lcn/softnado/Gwt/Map/Baidu/Client/Dom/TypeTargetEventArgs;)(owner,e);
		});
		owner.addEventListener("mouseover",function(e){
			@cn.softnado.Gwt.Map.Baidu.Client.Dom.Overlay.Label::FireMouseOver(Lcn/softnado/Gwt/Map/Baidu/Client/Dom/Overlay/Label;Lcn/softnado/Gwt/Map/Baidu/Client/Dom/TypeTargetEventArgs;)(owner,e);
		});
		owner.addEventListener("remove",function(e){
			@cn.softnado.Gwt.Map.Baidu.Client.Dom.Overlay.Label::FireRemove(Lcn/softnado/Gwt/Map/Baidu/Client/Dom/Overlay/Label;Lcn/softnado/Gwt/Map/Baidu/Client/Dom/TypeTargetEventArgs;)(owner,e);
		});
		owner.addEventListener("rightclick",function(e){
			@cn.softnado.Gwt.Map.Baidu.Client.Dom.Overlay.Label::FireRightClick(Lcn/softnado/Gwt/Map/Baidu/Client/Dom/Overlay/Label;Lcn/softnado/Gwt/Map/Baidu/Client/Dom/TypeTargetEventArgs;)(owner,e);
		});
	}-*/;

	/**
	 * 触发点击事件
	 * 
	 * @param owner
	 * @param args
	 */
	public static final void FireClick(Label owner, TypeTargetEventArgs args) {
		CoreEvent.<TypeTargetEventArgs, Label> Fire(owner, "click", args);
	}

	/**
	 * 添加点击事件处理
	 * 
	 * @param handler
	 * @return
	 */
	public final HandlerRegistration addClickHandler(
			CoreEventHandler<TypeTargetEventArgs> handler) {
		return this.addHandler(
				CoreEvent.<TypeTargetEventArgs, Label> GetType(this, "click"),
				handler);
	}

	/**
	 * 触发双击事件
	 * 
	 * @param owner
	 * @param args
	 */
	public static final void FireDoubleClick(Label owner,
			TypeTargetEventArgs args) {
		CoreEvent.<TypeTargetEventArgs, Label> Fire(owner, "dblclick", args);
	}

	/**
	 * 添加双击事件处理
	 * 
	 * @param handler
	 * @return
	 */
	public final HandlerRegistration addDoubleClickHandler(
			CoreEventHandler<TypeTargetEventArgs> handler) {
		return this.addHandler(CoreEvent.<TypeTargetEventArgs, Label> GetType(
				this, "dblclick"), handler);
	}

	/**
	 * 触发鼠标按下事件
	 * 
	 * @param owner
	 * @param args
	 */
	public static final void FireMouseDown(Label owner, TypeTargetEventArgs args) {
		CoreEvent.<TypeTargetEventArgs, Label> Fire(owner, "mousedown", args);
	}

	/**
	 * 添加鼠标按下事件处理
	 * 
	 * @param handler
	 * @return
	 */
	public final HandlerRegistration addMouseDownHandler(
			CoreEventHandler<TypeTargetEventArgs> handler) {
		return this.addHandler(CoreEvent.<TypeTargetEventArgs, Label> GetType(
				this, "mousedown"), handler);
	}

	/**
	 * 触发鼠标抬起事件
	 * 
	 * @param owner
	 * @param args
	 */
	public static final void FireMouseUp(Label owner, TypeTargetEventArgs args) {
		CoreEvent.<TypeTargetEventArgs, Label> Fire(owner, "mouseup", args);
	}

	/**
	 * 添加鼠标抬起事件处理
	 * 
	 * @param handler
	 * @return
	 */
	public final HandlerRegistration addMouseUpHandler(
			CoreEventHandler<TypeTargetEventArgs> handler) {
		return this
				.addHandler(CoreEvent.<TypeTargetEventArgs, Label> GetType(
						this, "mouseup"), handler);
	}

	/**
	 * 触发鼠标移出事件
	 * 
	 * @param owner
	 * @param args
	 */
	public static final void FireMouseOut(Label owner, TypeTargetEventArgs args) {
		CoreEvent.<TypeTargetEventArgs, Label> Fire(owner, "mouseout", args);
	}

	/**
	 * 添加鼠标移出事件处理
	 * 
	 * @param handler
	 * @return
	 */
	public final HandlerRegistration addMouseOutHandler(
			CoreEventHandler<TypeTargetEventArgs> handler) {
		return this.addHandler(CoreEvent.<TypeTargetEventArgs, Label> GetType(
				this, "mouseout"), handler);
	}

	/**
	 * 触发鼠标移入事件
	 * 
	 * @param owner
	 * @param args
	 */
	public static final void FireMouseOver(Label owner, TypeTargetEventArgs args) {
		CoreEvent.<TypeTargetEventArgs, Label> Fire(owner, "mouseover", args);
	}

	/**
	 * 添加鼠标移入事件处理
	 * 
	 * @param handler
	 * @return
	 */
	public final HandlerRegistration addMouseOverHandler(
			CoreEventHandler<TypeTargetEventArgs> handler) {
		return this.addHandler(CoreEvent.<TypeTargetEventArgs, Label> GetType(
				this, "mouseover"), handler);
	}

	/**
	 * 触发移除事件
	 * 
	 * @param owner
	 * @param args
	 */
	public static final void FireRemove(Label owner, TypeTargetEventArgs args) {
		CoreEvent.<TypeTargetEventArgs, Label> Fire(owner, "remove", args);
	}

	/**
	 * 添加移除事件处理
	 * 
	 * @param handler
	 * @return
	 */
	public final HandlerRegistration addRemoveHandler(
			CoreEventHandler<TypeTargetEventArgs> handler) {
		return this.addHandler(
				CoreEvent.<TypeTargetEventArgs, Label> GetType(this, "remove"),
				handler);
	}

	/**
	 * 触发右击事件
	 * 
	 * @param owner
	 * @param args
	 */
	public static final void FireRightClick(Label owner,
			TypeTargetEventArgs args) {
		CoreEvent.<TypeTargetEventArgs, Label> Fire(owner, "rightclick", args);
	}

	/**
	 * 添加右击事件处理
	 * 
	 * @param handler
	 * @return
	 */
	public final HandlerRegistration addRightClickHandler(
			CoreEventHandler<TypeTargetEventArgs> handler) {
		return this.addHandler(CoreEvent.<TypeTargetEventArgs, Label> GetType(
				this, "rightclick"), handler);
	}

}
