package cn.softnado.Gwt.Map.Baidu.Client.Dom.Service;

import cn.softnado.Gwt.Map.Baidu.Client.Dom.Array;
import cn.softnado.Gwt.Map.Baidu.Client.Dom.OneParamCallback;
import cn.softnado.Gwt.Map.Baidu.Client.Dom.TwoParamsCallback;
import cn.softnado.Gwt.Map.Baidu.Client.Dom.Base.Bounds;
import cn.softnado.Gwt.Map.Baidu.Client.Dom.Base.Point;
import cn.softnado.Gwt.Map.Baidu.Client.Dom.Core.Map;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArrayString;
import com.google.gwt.dom.client.Element;

public class LocalSearch extends JavaScriptObject {
	protected LocalSearch() {

	}

	public static native LocalSearch CreateInstance(Map location,
			LocalSearchOptions opts)
	/*-{
		return new $wnd.BMap.LocalSearch(location,opts);
	}-*/;

	public static native LocalSearch CreateInstance(Map location)
	/*-{
		return new $wnd.BMap.LocalSearch(location);
	}-*/;

	public static native LocalSearch CreateInstance(Point location,
			LocalSearchOptions opts)
	/*-{
		return new $wnd.BMap.LocalSearch(location,opts);
	}-*/;

	public static native LocalSearch CreateInstance(Point location)
	/*-{
		return new $wnd.BMap.LocalSearch(location);
	}-*/;

	public static native LocalSearch CreateInstance(String location,
			LocalSearchOptions opts)
	/*-{
		return new $wnd.BMap.LocalSearch(location,opts);
	}-*/;

	public static native LocalSearch CreateInstance(String location)
	/*-{
		return new $wnd.BMap.LocalSearch(location);
	}-*/;

	public final native void Search(String keyword, boolean forceLocalValue,
			CustomData customDataValue)
	/*-{
		this.search(keyword,{forceLocal:forceLocalValue,customData:customDataValue});
	}-*/;

	public final native void Search(String keyword)
	/*-{
		this.search(keyword);
	}-*/;

	public final native void Search(JsArrayString keywords,
			boolean forceLocalValue, CustomData customDataValue)
	/*-{
		this.search(keywords,{forceLocal:forceLocalValue,customData:customDataValue});
	}-*/;

	public final native void Search(JsArrayString keywords)
	/*-{
		this.search(keywords);
	}-*/;

	public final native void SearchInBounds(String keyword, Bounds bounds,
			CustomData customDataValue)
	/*-{
		this.searchInBounds(keyword,bounds,{customData:customDataValue});
	}-*/;

	public final native void SearchInBounds(String keyword, Bounds bounds)
	/*-{
		this.searchInBounds(keyword,bounds);
	}-*/;

	public final native void SearchInBounds(JsArrayString keywords,
			Bounds bounds, CustomData customDataValue)
	/*-{
		this.searchInBounds(keywords,bounds,{customData:customDataValue});
	}-*/;

	public final native void SearchInBounds(JsArrayString keywords,
			Bounds bounds)
	/*-{
		this.searchInBounds(keywords,bounds);
	}-*/;

	public final native void SearchNearby(String keyword,
			LocalResultPoi center, double radius, CustomData customDataValue)
	/*-{
		this.searchNearby(keyword,center,radius,{customData:customDataValue});
	}-*/;

	public final native void SearchNearby(String keyword, String center,
			double radius, CustomData customDataValue)
	/*-{
		this.searchNearby(keyword,center,radius,{customData:customDataValue});
	}-*/;

	public final native void SearchNearby(String keyword, Point center,
			double radius, CustomData customDataValue)
	/*-{
		this.searchNearby(keyword,center,radius,{customData:customDataValue});
	}-*/;

	public final native void SearchNearby(String keyword,
			LocalResultPoi center, double radius)
	/*-{
		this.searchNearby(keyword,center,radius);
	}-*/;

	public final native void SearchNearby(String keyword, String center,
			double radius)
	/*-{
		this.searchNearby(keyword,center,radius);
	}-*/;

	public final native void SearchNearby(String keyword, Point center,
			double radius)
	/*-{
		this.searchNearby(keyword,center,radius);
	}-*/;

	public final native void SearchNearby(JsArrayString keywords,
			LocalResultPoi center, double radius, CustomData customDataValue)
	/*-{
		this.searchNearby(keywords,center,radius,{customData:customDataValue});
	}-*/;

	public final native void SearchNearby(JsArrayString keywords,
			String center, double radius, CustomData customDataValue)
	/*-{
		this.searchNearby(keywords,center,radius,{customData:customDataValue});
	}-*/;

	public final native void SearchNearby(JsArrayString keywords, Point center,
			double radius, CustomData customDataValue)
	/*-{
		this.searchNearby(keywords,center,radius,{customData:customDataValue});
	}-*/;

	public final native void SearchNearby(JsArrayString keywords,
			LocalResultPoi center, double radius)
	/*-{
		this.searchNearby(keywords,center,radius);
	}-*/;

	public final native void SearchNearby(JsArrayString keywords,
			String center, double radius)
	/*-{
		this.searchNearby(keywords,center,radius);
	}-*/;

	public final native void SearchNearby(JsArrayString keywords, Point center,
			double radius)
	/*-{
		this.searchNearby(keywords,center,radius);
	}-*/;

	public final native Array<LocalResult> getResults()
	/*-{
		var results = this.getResults();
		var resultsArray = null;
		if(Object.prototype.toString.apply(results) === '[object Array]'){
			resultsArray = results;
		}else{
			resultsArray = new Array();
			resultsArray.push(results);
		}
		return resultsArray;
	}-*/;

	public final native void ClearResults()
	/*-{
		this.clearResults();
	}-*/;

	public final native void GotoPage(int page)
	/*-{
		this.gotoPage(page);
	}-*/;

	public final native void EnableAutoViewport()
	/*-{
		this.enableAutoViewport();
	}-*/;

	public final native void DisableAutoViewport()
	/*-{
		this.disableAutoViewport();
	}-*/;

	public final native void EnableFirstResultSelection()
	/*-{
		this.enableFirstResultSelection();
	}-*/;

	public final native void DisableFirstResultSelection()
	/*-{
		this.disableFirstResultSelection();
	}-*/;

	public final native int getPageCapacity()
	/*-{
		return this.getPageCapacity();
	}-*/;

	public final native void setPageCapacity(int pageCapacityValue)
	/*-{
		this.setPageCapacity(pageCapacityValue);
	}-*/;

	public final native StatusCode getStatus()
	/*-{
		return this.getStatus();
	}-*/;

	public final native void setSearchCompleteCallback(
			OneParamCallback<Array<LocalResult>> callback)
	/*-{
		this.setSearchCompleteCallback(function(results){
				var resultsArray = null;
				if(Object.prototype.toString.apply(results) === '[object Array]'){
					resultsArray = results;
				}else{
					resultsArray = new Array();
					resultsArray.push(results);
				}
				callback && $entry(callback.@cn.softnado.Gwt.Map.Baidu.Client.Dom.OneParamCallback::onCallback(Ljava/lang/Object;)(resultsArray));
			});
	}-*/;

	public final native void setMarkersSetCallback(
			OneParamCallback<Array<LocalResultPoi>> callback)
	/*-{
		this.setMarkersSetCallback(function(pois){
				callback && $entry(callback.@cn.softnado.Gwt.Map.Baidu.Client.Dom.OneParamCallback::onCallback(Ljava/lang/Object;)(pois));
			});
	}-*/;

	public final native void setInfoHtmlSetCallback(
			TwoParamsCallback<LocalResultPoi, Element> callback)
	/*-{
		this.setInfoHtmlSetCallback(function(poi,html){
				callback && $entry(callback.@cn.softnado.Gwt.Map.Baidu.Client.Dom.TwoParamsCallback::onCallback(Ljava/lang/Object;Ljava/lang/Object;)(poi,html));				
			});
	}-*/;

	public final native void setResultsHtmlSetCallback(
			OneParamCallback<Element> callback)
	/*-{
		this.setResultsHtmlSetCallback(function(container){
				callback && $entry(callback.@cn.softnado.Gwt.Map.Baidu.Client.Dom.OneParamCallback::onCallback(Ljava/lang/Object;)(container));				
			});
	}-*/;

}
