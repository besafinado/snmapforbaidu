package cn.softnado.Gwt.Map.Baidu.Client.Dom.Service;

import com.google.gwt.core.client.JsArrayString;
import com.google.gwt.event.shared.HandlerRegistration;

import cn.softnado.Gwt.Map.Baidu.Client.Dom.CoreEvent;
import cn.softnado.Gwt.Map.Baidu.Client.Dom.CoreEventHandler;
import cn.softnado.Gwt.Map.Baidu.Client.Dom.HasHandlersJsObject;
import cn.softnado.Gwt.Map.Baidu.Client.Dom.TypeTargetFromToItemEventArgs;
import cn.softnado.Gwt.Map.Baidu.Client.Dom.TypeTargetItemEventArgs;
import cn.softnado.Gwt.Map.Baidu.Client.Dom.Base.Point;
import cn.softnado.Gwt.Map.Baidu.Client.Dom.Core.Map;

public class Autocomplete extends HasHandlersJsObject {
	protected Autocomplete() {

	}

	public static native Autocomplete CreateInstance(AutocompleteOptions opts)
	/*-{
		return $wnd.BMap.Autocomplete(opts);
	}-*/;

	public static native Autocomplete CreateInstance()
	/*-{
		return $wnd.BMap.Autocomplete();
	}-*/;

	public final native void Show()
	/*-{
		this.show();
	}-*/;

	public final native void Hide()
	/*-{
		this.Hide();
	}-*/;

	public final native void setTypes(JsArrayString typesValue)
	/*-{
		this.setTypes(typesValue);
	}-*/;

	public final native void setLocation(Map location)
	/*-{
		this.setLocation(location);
	}-*/;

	public final native void setLocation(Point location)
	/*-{
		this.setLocation(location);
	}-*/;

	public final native void setLocation(String location)
	/*-{
		this.setLocation(location);
	}-*/;

	public final native void Search(String keywords)
	/*-{
		this.search(keywords);
	}-*/;

	public final native AutocompleteResult getResults()
	/*-{
		return this.getResults();
	}-*/;

	public final native void setInputValue(String keyword)
	/*-{
		this.setInputValue(keyword);
	}-*/;

	public final native void dispose()
	/*-{
		this.dispose();
	}-*/;

	public final native void RegistOriginEvents()
	/*-{
		var owner = this;
		owner.addEventListener("onconfirm",function(e){
			@cn.softnado.Gwt.Map.Baidu.Client.Dom.Service.Autocomplete::FireConfirm(Lcn/softnado/Gwt/Map/Baidu/Client/Dom/Service/Autocomplete;Lcn/softnado/Gwt/Map/Baidu/Client/Dom/TypeTargetItemEventArgs;)(owner,e);
		});
		owner.addEventListener("onhighlight",function(e){
			@cn.softnado.Gwt.Map.Baidu.Client.Dom.Service.Autocomplete::FireHighlight(Lcn/softnado/Gwt/Map/Baidu/Client/Dom/Service/Autocomplete;Lcn/softnado/Gwt/Map/Baidu/Client/Dom/TypeTargetFromToItemEventArgs;)(owner,e);
		});
	}-*/;

	/**
	 * 触发选中某项事件
	 * 
	 * @param owner
	 * @param args
	 */
	public static final void FireConfirm(Autocomplete owner,
			TypeTargetItemEventArgs args) {
		CoreEvent.<TypeTargetItemEventArgs, Autocomplete> Fire(owner,
				"onconfirm", args);
	}

	/**
	 * 添加选中某项事件处理
	 * 
	 * @param handler
	 * @return
	 */
	public final HandlerRegistration addConfirmHandler(
			CoreEventHandler<TypeTargetItemEventArgs> handler) {
		return this.addHandler(CoreEvent
				.<TypeTargetItemEventArgs, Autocomplete> GetType(this,
						"onconfirm"), handler);
	}

	/**
	 * 触发切换事件
	 * 
	 * @param owner
	 * @param args
	 */
	public static final void FireHighlight(Autocomplete owner,
			TypeTargetFromToItemEventArgs args) {
		CoreEvent.<TypeTargetFromToItemEventArgs, Autocomplete> Fire(owner,
				"onhighlight", args);
	}

	/**
	 * 添加切换事件处理
	 * 
	 * @param handler
	 * @return
	 */
	public final HandlerRegistration addHighlightHandler(
			CoreEventHandler<TypeTargetFromToItemEventArgs> handler) {
		return this.addHandler(CoreEvent
				.<TypeTargetFromToItemEventArgs, Autocomplete> GetType(this,
						"onhighlight"), handler);
	}

}
