package cn.softnado.Gwt.Map.Baidu.Client.Dom.Help;

import cn.softnado.Gwt.Map.Baidu.Client.Dom.EmptyParamCallback;

import com.google.gwt.core.client.JavaScriptObject;

public class ScriptManager extends JavaScriptObject {
	protected ScriptManager() {

	}

	public static native void LoadScript(String url)
	/*-{
	    var head = $doc.getElementsByTagName('head')[0];
	    var script = $doc.createElement('script');
	    script.type = 'text/javascript';
	    script.src = url;
	    //借鉴了jQuery的script跨域方法
	    script.onload = script.onreadystatechange = function(){
	        if((!this.readyState || this.readyState === "loaded" || this.readyState === "complete")){
	            // Handle memory leak in IE
	            script.onload = script.onreadystatechange = null;
	            if ( head && script.parentNode ) {
	                head.removeChild( script );
	            }
	        }
	    };
	    // Use insertBefore instead of appendChild  to circumvent an IE6 bug.
	    head.insertBefore( script, head.firstChild );		
	}-*/;

	public static native void LoadScript(String url, EmptyParamCallback callback)
	/*-{
	    var head = $doc.getElementsByTagName('head')[0];
	    var script = $doc.createElement('script');
	    script.type = 'text/javascript';
	    script.src = url;
	    //借鉴了jQuery的script跨域方法
	    script.onload = script.onreadystatechange = function(){
	        if((!this.readyState || this.readyState === "loaded" || this.readyState === "complete")){
	            callback && callback.@cn.softnado.Gwt.Map.Baidu.Client.Dom.EmptyParamCallback::onCallback()();
	            // Handle memory leak in IE
	            script.onload = script.onreadystatechange = null;
	            if ( head && script.parentNode ) {
	                head.removeChild( script );
	            }
	        }
	    };
	    // Use insertBefore instead of appendChild  to circumvent an IE6 bug.
	    head.insertBefore( script, head.firstChild );
	}-*/;

}
