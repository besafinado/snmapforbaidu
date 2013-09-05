package cn.softnado.Gwt.Map.Baidu.Client.Dom.Menu;

import com.google.gwt.event.shared.HandlerRegistration;

import cn.softnado.Gwt.Map.Baidu.Client.Dom.CoreEvent;
import cn.softnado.Gwt.Map.Baidu.Client.Dom.CoreEventHandler;
import cn.softnado.Gwt.Map.Baidu.Client.Dom.HasHandlersJsObject;
import cn.softnado.Gwt.Map.Baidu.Client.Dom.TypeTargetPointPixelEventArgs;

/**
 * 右键菜单基本类型
 * 
 * @author softnado
 * 
 */
public class ContextMenu extends HasHandlersJsObject {
	protected ContextMenu() {

	}

	public static native ContextMenu CreateInstance()
	/*-{
		return new $wnd.BMap.ContextMenu();
	}-*/;

	public final native MenuItem getItem(int index)
	/*-{
		return this.getItem(index);
	}-*/;

	public final native void AddItem(MenuItem itemValue)
	/*-{
		this.addItem(itemValue);
	}-*/;

	public final native void RemoveItem(MenuItem itemValue)
	/*-{
		this.removeItem(itemValue);
	}-*/;

	public final native void AddSeparator()
	/*-{
		this.addSeparator();
	}-*/;

	public final native void RemoveSeparator(int index)
	/*-{
		this.removeSeparator(index);
	}-*/;

	public final native void RegistOriginEvents()
	/*-{
		var owner = this;
		if(owner.OriginEventsRegisted){
			return;
		}else{
			owner.OriginEventsRegisted = true;
		}
		owner.addEventListener("open",function(e){
			@cn.softnado.Gwt.Map.Baidu.Client.Dom.Menu.ContextMenu::FireOpen(Lcn/softnado/Gwt/Map/Baidu/Client/Dom/Menu/ContextMenu;Lcn/softnado/Gwt/Map/Baidu/Client/Dom/TypeTargetPointPixelEventArgs;)(owner,e);
		});
		owner.addEventListener("close",function(e){
			@cn.softnado.Gwt.Map.Baidu.Client.Dom.Menu.ContextMenu::FireClose(Lcn/softnado/Gwt/Map/Baidu/Client/Dom/Menu/ContextMenu;Lcn/softnado/Gwt/Map/Baidu/Client/Dom/TypeTargetPointPixelEventArgs;)(owner,e);
		});
	}-*/;

	/**
	 * 触发打开事件
	 * 
	 * @param owner
	 * @param args
	 */
	public static final void FireOpen(ContextMenu owner,
			TypeTargetPointPixelEventArgs args) {
		CoreEvent.<TypeTargetPointPixelEventArgs, ContextMenu> Fire(owner,
				"open", args);
	}

	/**
	 * 添加打开事件处理
	 * 
	 * @param handler
	 * @return
	 */
	public final HandlerRegistration addOpenHandler(
			CoreEventHandler<TypeTargetPointPixelEventArgs> handler) {
		return this.addHandler(CoreEvent
				.<TypeTargetPointPixelEventArgs, ContextMenu> GetType(this,
						"open"), handler);
	}

	/**
	 * 触发关闭事件
	 * 
	 * @param owner
	 * @param args
	 */
	public static final void FireClose(ContextMenu owner,
			TypeTargetPointPixelEventArgs args) {
		CoreEvent.<TypeTargetPointPixelEventArgs, ContextMenu> Fire(owner,
				"close", args);
	}

	/**
	 * 添加关闭事件处理
	 * 
	 * @param handler
	 * @return
	 */
	public final HandlerRegistration addCloseHandler(
			CoreEventHandler<TypeTargetPointPixelEventArgs> handler) {
		return this.addHandler(CoreEvent
				.<TypeTargetPointPixelEventArgs, ContextMenu> GetType(this,
						"close"), handler);
	}

}
