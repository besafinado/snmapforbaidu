package cn.softnado.Gwt.Map.Baidu.Client.Dom.Service;

import cn.softnado.Gwt.Map.Baidu.Client.Dom.OneParamCallback;
import cn.softnado.Gwt.Map.Baidu.Client.Dom.Base.Point;
import cn.softnado.Gwt.Map.Baidu.Client.Dom.Core.Map;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArrayString;
import com.google.gwt.dom.client.Element;

public class AutocompleteOptions extends JavaScriptObject {
	protected AutocompleteOptions() {

	}

	public static native AutocompleteOptions CreateInstance(Map locationValue,
			JsArrayString typesValue,
			OneParamCallback<AutocompleteResult> onSearchCompleteCallback,
			String inputValue)
	/*-{
		return {
			location:locationValue
			,types:typesValue
			,onSearchComplete:function(res){
				onSearchCompleteCallback && $entry(onSearchCompleteCallback.@cn.softnado.Gwt.Map.Baidu.Client.Dom.OneParamCallback::onCallback(Ljava/lang/Object;)(res));
			}
			,input:inputValue
		};
	}-*/;

	public static native AutocompleteOptions CreateInstance(
			String locationValue, JsArrayString typesValue,
			OneParamCallback<AutocompleteResult> onSearchCompleteCallback,
			String inputValue)
	/*-{
		return {
			location:locationValue
			,types:typesValue
			,onSearchComplete:function(res){
				onSearchCompleteCallback && $entry(onSearchCompleteCallback.@cn.softnado.Gwt.Map.Baidu.Client.Dom.OneParamCallback::onCallback(Ljava/lang/Object;)(res));
			}
			,input:inputValue
		};
	}-*/;

	public static native AutocompleteOptions CreateInstance(
			Point locationValue, JsArrayString typesValue,
			OneParamCallback<AutocompleteResult> onSearchCompleteCallback,
			String inputValue)
	/*-{
		return {
			location:locationValue
			,types:typesValue
			,onSearchComplete:function(res){
				onSearchCompleteCallback && $entry(onSearchCompleteCallback.@cn.softnado.Gwt.Map.Baidu.Client.Dom.OneParamCallback::onCallback(Ljava/lang/Object;)(res));
			}
			,input:inputValue
		};
	}-*/;

	public static native AutocompleteOptions CreateInstance(Map locationValue,
			JsArrayString typesValue,
			OneParamCallback<AutocompleteResult> onSearchCompleteCallback,
			Element inputValue)
	/*-{
		return {
			location:locationValue
			,types:typesValue
			,onSearchComplete:function(res){
				onSearchCompleteCallback && $entry(onSearchCompleteCallback.@cn.softnado.Gwt.Map.Baidu.Client.Dom.OneParamCallback::onCallback(Ljava/lang/Object;)(res));
			}
			,input:inputValue
		};
	}-*/;

	public static native AutocompleteOptions CreateInstance(
			String locationValue, JsArrayString typesValue,
			OneParamCallback<AutocompleteResult> onSearchCompleteCallback,
			Element inputValue)
	/*-{
		return {
			location:locationValue
			,types:typesValue
			,onSearchComplete:function(res){
				onSearchCompleteCallback && $entry(onSearchCompleteCallback.@cn.softnado.Gwt.Map.Baidu.Client.Dom.OneParamCallback::onCallback(Ljava/lang/Object;)(res));
			}
			,input:inputValue
		};
	}-*/;

	public static native AutocompleteOptions CreateInstance(
			Point locationValue, JsArrayString typesValue,
			OneParamCallback<AutocompleteResult> onSearchCompleteCallback,
			Element inputValue)
	/*-{
		return {
			location:locationValue
			,types:typesValue
			,onSearchComplete:function(res){
				onSearchCompleteCallback && $entry(onSearchCompleteCallback.@cn.softnado.Gwt.Map.Baidu.Client.Dom.OneParamCallback::onCallback(Ljava/lang/Object;)(res));
			}
			,input:inputValue
		};
	}-*/;

	public final native String getLocationAsString()
	/*-{
		return this.location;
	}-*/;

	public final native Map getLocationAsMap()
	/*-{
		return this.location;
	}-*/;

	public final native Point getLocationAsPoint()
	/*-{
		return this.location;
	}-*/;

	public final native void setLocation(String locationValue)
	/*-{
		this.location = locationValue;
	}-*/;

	public final native void setLocation(Map locationValue)
	/*-{
		this.location = locationValue;
	}-*/;

	public final native void setLocation(Point locationValue)
	/*-{
		this.location = locationValue;
	}-*/;

	public final native JsArrayString getTypes()
	/*-{
		return this.types;
	}-*/;

	public final native void setTypes(JsArrayString typesValue)
	/*-{
		this.types = typesValue;
	}-*/;

	public final native String getInputAsString()
	/*-{
		return this.input;
	}-*/;

	public final native Element getInputAsElement()
	/*-{
		return this.input;
	}-*/;

	public final native void setInput(String inputValue)
	/*-{
		this.input = inputValue;
	}-*/;

	public final native void setInput(Element inputValue)
	/*-{
		this.input = inputValue;
	}-*/;

}
