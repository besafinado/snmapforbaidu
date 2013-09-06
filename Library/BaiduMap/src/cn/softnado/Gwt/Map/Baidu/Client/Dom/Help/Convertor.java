package cn.softnado.Gwt.Map.Baidu.Client.Dom.Help;

import cn.softnado.Gwt.Map.Baidu.Client.Dom.Array;
import cn.softnado.Gwt.Map.Baidu.Client.Dom.OneParamCallback;
import cn.softnado.Gwt.Map.Baidu.Client.Dom.Base.Point;

import com.google.gwt.core.client.JavaScriptObject;

public class Convertor extends JavaScriptObject {
	protected Convertor() {

	}

	public static final native void Translate(Point point, TranslateType type,
			OneParamCallback<Point> callback)
	/*-{
		if($wnd.BMap.Convertor == null) {
			$wnd.BMap.Convertor = {};
		}
		var callbackName = 'cbk_' + Math.round(Math.random() * 10000);		
		var xyUrl = "http://api.map.baidu.com/ag/coord/convert?from="
						+ type
						+ "&to=4&x="
						+ point.lng
						+ "&y="
						+ point.lat
						+ "&callback=BMap.Convertor."
						+ callbackName;
	    $wnd.BMap.Convertor[callbackName] = function(xyResult){
	        delete $wnd.BMap.Convertor[callbackName];
	        var pointRes = new $wnd.BMap.Point(xyResult.x, xyResult.y);
	        callback && $entry(callback.@cn.softnado.Gwt.Map.Baidu.Client.Dom.OneParamCallback::onCallback(Ljava/lang/Object;)(pointRes));
	    };
		@cn.softnado.Gwt.Map.Baidu.Client.Dom.Help.ScriptManager::LoadScript(Ljava/lang/String;)(xyUrl);
	}-*/;

	public static final native void Translate(Array<Point> points,
			TranslateType type, OneParamCallback<Array<Point>> callback)
	/*-{
		if($wnd.BMap.Convertor == null) {
			$wnd.BMap.Convertor = {};
		}
		
		var xyUrl = "http://api.map.baidu.com/ag/coord/convert?from="
						+ type
						+ "&to=4&mode=1";
		var xS = new $wnd.Array();
		var yS = new $wnd.Array();
		var maxCnt = 20;
		var send = function(){
			var callbackName = 'cbk_' + Math.round(Math.random() * 10000);		    
			$wnd.BMap.Convertor[callbackName] = function(xyResults){
		        delete $wnd.BMap.Convertor[callbackName];
		        var results = new $wnd.Array();
		        var xyResult = null;
				for(var index in xyResults) {
					xyResult = xyResults[index];
					if(xyResult.error != 0) {
						results.push(null);
					}
					var point = new $wnd.BMap.Point(xyResult.x, xyResult.y);
					results.push(point);
				}
		        callback && $entry(callback.@cn.softnado.Gwt.Map.Baidu.Client.Dom.OneParamCallback::onCallback(Ljava/lang/Object;)(results));
		    };
			var url = xyUrl
						+ "&x=" + xS.join(",")
						+ "&y=" + yS.join(",")
						+ "&callback=BMap.Convertor."
						+ callbackName;
		    @cn.softnado.Gwt.Map.Baidu.Client.Dom.Help.ScriptManager::LoadScript(Ljava/lang/String;)(url);
			xS = [];
			yS = [];
		};
		
		for(var index in points){
			if(index % maxCnt == 0 && index != 0){
				send();
			}
	    	xS.push(points[index].lng);
	    	yS.push(points[index].lat);
			if(index == points.length - 1){
				send();
			}
	    }
	}-*/;
}
