package cn.softnado.Gwt.Map.Baidu.Client.Dom.Service;

import cn.softnado.Gwt.Map.Baidu.Client.Dom.Core.Map;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.dom.client.Element;

public class RenderOptions extends JavaScriptObject {
	protected RenderOptions() {

	}

	public static native RenderOptions CreateInstance(Map mapValue,
			boolean selectFirstResultValue, boolean autoViewportValue,
			HighlightModes highlightModeValue)
	/*-{
		return {
			map:mapValue
			,selectFirstResult:selectFirstResultValue
			,autoViewport:autoViewportValue
			,highlightMode:highlightModeValue
		};
	}-*/;

	public static native RenderOptions CreateInstance(Map mapValue,
			String panelValue, boolean selectFirstResultValue,
			boolean autoViewportValue, HighlightModes highlightModeValue)
	/*-{
		return {
			map:mapValue
			,panel:panelValue
			,selectFirstResult:selectFirstResultValue
			,autoViewport:autoViewportValue
			,highlightMode:highlightModeValue
		};
	}-*/;

	public static native RenderOptions CreateInstance(Map mapValue,
			Element panelValue, boolean selectFirstResultValue,
			boolean autoViewportValue, HighlightModes highlightModeValue)
	/*-{
		return {
			map:mapValue
			,panel:panelValue
			,selectFirstResult:selectFirstResultValue
			,autoViewport:autoViewportValue
			,highlightMode:highlightModeValue
		};
	}-*/;

	public final native Map getMap()
	/*-{
		return this.map;
	}-*/;

	public final native void setMap(Map mapValue)
	/*-{
		this.map = mapValue;
	}-*/;

	public final native String getPanelAsString()
	/*-{
		return this.panel ? this.panel : null;
	}-*/;

	public final native Element getPanelAsElement()
	/*-{
		return this.panel ? this.panel : null;
	}-*/;

	public final native void setPanel(Element panelValue)
	/*-{
		this.panel = panelValue;
	}-*/;

	public final native void setPanel(String panelValue)
	/*-{
		this.panel = panelValue;
	}-*/;

	public final native boolean getSelectFirstResult()
	/*-{
		return this.selectFirstResult;
	}-*/;

	public final native void setSelectFirstResult(boolean selectFirstResultValue)
	/*-{
		this.selectFirstResult = selectFirstResultValue;
	}-*/;

	public final native boolean getAutoViewport()
	/*-{
		return this.autoViewport;
	}-*/;

	public final native void setAutoViewport(boolean autoViewportValue)
	/*-{
		this.autoViewport = autoViewportValue;
	}-*/;

	public final native HighlightModes getHighlightMode()
	/*-{
		return this.highlightMode;
	}-*/;

	public final native void setHighlightMode(HighlightModes highlightModeValue)
	/*-{
		this.highlightMode = highlightModeValue;
	}-*/;

}
