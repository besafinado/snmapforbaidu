package cn.softnado.Gwt.Map.Baidu.Client.Dom.Overlay;

import cn.softnado.Gwt.Map.Baidu.Client.Dom.CoreEvent;
import cn.softnado.Gwt.Map.Baidu.Client.Dom.TypeTargetEventArgs;
import cn.softnado.Gwt.Map.Baidu.Client.Dom.CoreEventHandler;
import cn.softnado.Gwt.Map.Baidu.Client.Dom.TypeTargetPointEventArgs;
import cn.softnado.Gwt.Map.Baidu.Client.Dom.Base.Point;

import com.google.gwt.dom.client.Element;
import com.google.gwt.event.shared.HandlerRegistration;

/**
 * 此类表示地图上包含信息的窗口。
 * 
 * @author softnado
 * 
 */
public class InfoWindow extends Overlay {
	protected InfoWindow() {

	}

	public static native InfoWindow CreateInstance(String content)
	/*-{
		return new $wnd.BMap.InfoWindow(content);
	}-*/;

	public static native InfoWindow CreateInstance(String content,
			InfoWindowOptions opts)
	/*-{
		return new $wnd.BMap.InfoWindow(content,opts);
	}-*/;

	public static native InfoWindow CreateInstance(Element content)
	/*-{
		return new $wnd.BMap.InfoWindow(content);
	}-*/;

	public static native InfoWindow CreateInstance(Element content,
			InfoWindowOptions opts)
	/*-{
		return new $wnd.BMap.InfoWindow(content,opts);
	}-*/;

	public final native void setContent(String content)
	/*-{
		this.setContent(content);
	}-*/;

	public final native void setContent(Element content)
	/*-{
		this.setContent(content);
	}-*/;

	public final native String getContentAsString()
	/*-{
		return this.getContent();
	}-*/;

	public final native Element getContentAsElement()
	/*-{
		return this.getContent();
	}-*/;

	public final native void setWidth(double value)
	/*-{
		this.setWidth(value);
	}-*/;

	public final native void setHeight(double value)
	/*-{
		this.setHeight(value);
	}-*/;

	public final native void ReDraw()
	/*-{
		this.redraw();
	}-*/;

	public final native void setTitle(String value)
	/*-{
		this.setTitle(value);
	}-*/;

	public final native void setTitle(Element value)
	/*-{
		this.setTitle(value);
	}-*/;

	public final native String getTitleAsString()
	/*-{
		return this.getTitle();
	}-*/;

	public final native Element getTitleAsElement()
	/*-{
		return this.getTitle();
	}-*/;

	public final native Point getPosition()
	/*-{
		return this.getPosition();
	}-*/;

	public final native void EnableMaximize()
	/*-{
		this.enableMaximize();
	}-*/;

	public final native void DisableMaximize()
	/*-{
		this.disableMaximize();
	}-*/;

	public final native boolean IsOpen()
	/*-{
		return this.isOpen();
	}-*/;

	public final native void setMaxContent(String value)
	/*-{
		this.setMaxContent(value);
	}-*/;

	public final native void setMaxContent(Element value)
	/*-{
		this.setMaxContent(value);
	}-*/;

	public final native void Maximize()
	/*-{
		this.maximize();
	}-*/;

	public final native void Restore()
	/*-{
		this.restore();
	}-*/;

	public final native void EnableAutoPan()
	/*-{
		this.enableAutoPan();
	}-*/;

	public final native void DisableAutoPan()
	/*-{
		this.disableAutoPan();
	}-*/;

	public final native void EnableCloseOnClick()
	/*-{
		this.enableCloseOnClick();
	}-*/;

	public final native void DisableCloseOnClick()
	/*-{
		this.disableCloseOnClick();
	}-*/;

	public final native void RegistOriginEvents()
	/*-{
		var owner = this;
		if(owner.OriginEventsRegisted){
			return;
		}else{
			owner.OriginEventsRegisted = true;
		}
		owner.addEventListener("close",function(e){
			@cn.softnado.Gwt.Map.Baidu.Client.Dom.Overlay.InfoWindow::FireClose(Lcn/softnado/Gwt/Map/Baidu/Client/Dom/Overlay/InfoWindow;Lcn/softnado/Gwt/Map/Baidu/Client/Dom/TypeTargetPointEventArgs;)(owner,e);
		});
		owner.addEventListener("open",function(e){
			@cn.softnado.Gwt.Map.Baidu.Client.Dom.Overlay.InfoWindow::FireOpen(Lcn/softnado/Gwt/Map/Baidu/Client/Dom/Overlay/InfoWindow;Lcn/softnado/Gwt/Map/Baidu/Client/Dom/TypeTargetPointEventArgs;)(owner,e);
		});
		owner.addEventListener("maximize",function(e){
			@cn.softnado.Gwt.Map.Baidu.Client.Dom.Overlay.InfoWindow::FireMaximize(Lcn/softnado/Gwt/Map/Baidu/Client/Dom/Overlay/InfoWindow;Lcn/softnado/Gwt/Map/Baidu/Client/Dom/TypeTargetEventArgs;)(owner,e);
		});
		owner.addEventListener("restore",function(e){
			@cn.softnado.Gwt.Map.Baidu.Client.Dom.Overlay.InfoWindow::FireRestore(Lcn/softnado/Gwt/Map/Baidu/Client/Dom/Overlay/InfoWindow;Lcn/softnado/Gwt/Map/Baidu/Client/Dom/TypeTargetEventArgs;)(owner,e);
		});
		owner.addEventListener("clickclose",function(e){
			@cn.softnado.Gwt.Map.Baidu.Client.Dom.Overlay.InfoWindow::FireClickClose(Lcn/softnado/Gwt/Map/Baidu/Client/Dom/Overlay/InfoWindow;Lcn/softnado/Gwt/Map/Baidu/Client/Dom/TypeTargetEventArgs;)(owner,e);
		});
	}-*/;

	/**
	 * 触发关闭事件事件
	 * 
	 * @param owner
	 * @param args
	 */
	public static final void FireClose(InfoWindow owner, TypeTargetPointEventArgs args) {
		CoreEvent.<TypeTargetPointEventArgs, InfoWindow> Fire(owner, "close", args);
	}

	/**
	 * 添加关闭事件事件处理
	 * 
	 * @param handler
	 * @return
	 */
	public final HandlerRegistration addCloseHandler(
			CoreEventHandler<TypeTargetPointEventArgs> handler) {
		return this.addHandler(
				CoreEvent.<TypeTargetPointEventArgs, InfoWindow> GetType(this, "close"),
				handler);
	}

	/**
	 * 触发打开事件事件
	 * 
	 * @param owner
	 * @param args
	 */
	public static final void FireOpen(InfoWindow owner, TypeTargetPointEventArgs args) {
		CoreEvent.<TypeTargetPointEventArgs, InfoWindow> Fire(owner, "open", args);
	}

	/**
	 * 添加打开事件事件处理
	 * 
	 * @param handler
	 * @return
	 */
	public final HandlerRegistration addOpenHandler(
			CoreEventHandler<TypeTargetPointEventArgs> handler) {
		return this.addHandler(
				CoreEvent.<TypeTargetPointEventArgs, InfoWindow> GetType(this, "open"),
				handler);
	}

	/**
	 * 触发最大化事件事件
	 * 
	 * @param owner
	 * @param args
	 */
	public static final void FireMaximize(InfoWindow owner, TypeTargetEventArgs args) {
		CoreEvent.<TypeTargetEventArgs, InfoWindow> Fire(owner, "maximize", args);
	}

	/**
	 * 添加最大化事件事件处理
	 * 
	 * @param handler
	 * @return
	 */
	public final HandlerRegistration addMaximizeHandler(
			CoreEventHandler<TypeTargetEventArgs> handler) {
		return this
				.addHandler(CoreEvent.<TypeTargetEventArgs, InfoWindow> GetType(this,
						"maximize"), handler);
	}

	/**
	 * 触发还原事件事件
	 * 
	 * @param owner
	 * @param args
	 */
	public static final void FireRestore(InfoWindow owner, TypeTargetEventArgs args) {
		CoreEvent.<TypeTargetEventArgs, InfoWindow> Fire(owner, "restore", args);
	}

	/**
	 * 添加还原事件事件处理
	 * 
	 * @param handler
	 * @return
	 */
	public final HandlerRegistration addRestoreHandler(
			CoreEventHandler<TypeTargetEventArgs> handler) {
		return this.addHandler(
				CoreEvent.<TypeTargetEventArgs, InfoWindow> GetType(this, "restore"),
				handler);
	}

	/**
	 * 触发点击关闭事件事件
	 * 
	 * @param owner
	 * @param args
	 */
	public static final void FireClickClose(InfoWindow owner, TypeTargetEventArgs args) {
		CoreEvent.<TypeTargetEventArgs, InfoWindow> Fire(owner, "clickclose", args);
	}

	/**
	 * 添加点击关闭事件事件处理
	 * 
	 * @param handler
	 * @return
	 */
	public final HandlerRegistration addClickCloseHandler(
			CoreEventHandler<TypeTargetEventArgs> handler) {
		return this.addHandler(CoreEvent.<TypeTargetEventArgs, InfoWindow> GetType(
				this, "clickclose"), handler);
	}

}
