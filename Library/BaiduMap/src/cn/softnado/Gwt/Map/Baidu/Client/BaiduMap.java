package cn.softnado.Gwt.Map.Baidu.Client;

import java.util.ArrayList;

import cn.softnado.Gwt.Map.Baidu.Client.Dom.Core.Map;

import com.google.gwt.dom.client.DivElement;
import com.google.gwt.dom.client.Document;
import com.google.gwt.dom.client.ScriptElement;
import com.google.gwt.event.shared.HandlerRegistration;
import com.google.gwt.user.client.ui.Widget;

/**
 * 
 * @author softnado
 * 
 */
public class BaiduMap extends Widget implements HasInitedHandlers {
	/**
	 * Import Baidu Map Library
	 * 
	 * @param key
	 *            Please provide Key
	 * @throws InvalidKeyException
	 *             Key value incorrect
	 */
	public static void ImportLibrary(String key) throws InvalidKeyException {
		if (BaiduMap.ScriptHrefStub == null) {
			BaiduMap.ScriptHrefStub = Document.get().createScriptElement();
			String scriptUrl = "http://api.map.baidu.com/api?v=1.5&callback=BMapScriptInited";
			if (key != null && key.trim().length() > 0) {
				scriptUrl = scriptUrl + "&ak=" + key.trim();
			} else {
				throw new InvalidKeyException(key);
			}
			BaiduMap.ScriptHrefStub.setSrc(scriptUrl);
			BaiduMap.ScriptHrefStub.setLang("JavaScript");
			BaiduMap.ScriptHrefStub.setAttribute("type", "text/javascript");
			// Regist winow level call back method
			BaiduMap.RegistGlobalMethods();
			Document.get().getBody().appendChild(BaiduMap.ScriptHrefStub);
		}
	}

	/**
	 * Window level callback method
	 */
	private static native void RegistGlobalMethods()
	/*-{
		$wnd.BMapLoaded = $entry(@cn.softnado.Gwt.Map.Baidu.Client.BaiduMap::ScriptInited());
		$wnd.BMapScriptInited = function() {
			$wnd.BMapLoaded();
		};
	}-*/;

	/**
	 * Global Map Registry
	 */
	private static ArrayList<BaiduMap> BMapsList = new ArrayList<BaiduMap>();

	/**
	 * JS Library success load callback method, please do not call it by your self
	 */
	@Deprecated
	public static void ScriptInited() {
		BaiduMap.IsScriptInitedStub = true;
		for (BaiduMap bmap : BMapsList) {
			bmap.InitMapAfterScriptInited();
		}
	}

	/**
	 * Regist Map instance
	 * 
	 * @param bmap
	 *            Map to regist
	 */
	private static void RegistMap(BaiduMap bmap) {
		BaiduMap.BMapsList.add(bmap);
		if (BaiduMap.IsScriptInitedStub) {
			bmap.InitMapAfterScriptInited();
		}
	}

	/**
	 * Is Baidu Map Javascript API inited
	 */
	private static boolean IsScriptInitedStub = false;

	/**
	 * Baidu Map Javascript Href Element
	 */
	private static ScriptElement ScriptHrefStub = null;

	/**
	 * Is Current Map Inited
	 */
	private boolean IsInitedStub = false;

	/**
	 * Inner Map Stub
	 */
	Map MapStub = null;

	/**
	 * Get the status of Baidu Map Library
	 * 
	 * @return
	 */
	public static boolean IsBaiduMapLibraryInited() {
		return BaiduMap.IsScriptInitedStub;
	}

	/**
	 * Create new Map
	 */
	public BaiduMap() {
		this(Document.get().createDivElement(), "bmap-BMap");
	}

	/**
	 * Create new Map widget
	 * 
	 * @param mapDivElement
	 *            Target Div
	 * @param styleName
	 *            Target Div Style Name
	 */
	public BaiduMap(DivElement mapDivElement, String styleName) {
		this.setElement(mapDivElement);

		if (styleName != null) {
			this.setStyleName(styleName);
		}

		if (mapDivElement.getId() == null
				|| mapDivElement.getId().trim().length() == 0) {
			mapDivElement.setId(("BMap_" + Math.random()).replace("0.", "0_"));
		}

		BaiduMap.RegistMap(this);
	}

	/**
	 * Create new Map widget
	 * 
	 * @param mapDivElement
	 *            Target Div
	 */
	public BaiduMap(DivElement mapDivElement) {
		this(mapDivElement, "bdmap-Map");
	}

	/**
	 * Internal Baidu Map Instance
	 * 
	 * @return
	 */
	public Map getMap() {
		return this.MapStub;
	}

	/**
	 * Check if Map inited
	 * 
	 * @return
	 */
	public boolean IsInited() {
		return this.IsInitedStub;
	}

	/**
	 * Init BMap while Script inited
	 */
	private void InitMapAfterScriptInited() {
		if (!this.IsInitedStub) {
			this.MapStub = Map.CreateInstance(this.getElement().getId());
			this.MapStub.RegistOriginEvents();
			this.IsInitedStub = true;
			InitedEvent.fire(this, this);
		}
	}

	@Override
	public HandlerRegistration addInitedHandler(InitedHandler handler) {
		return this.addHandler(handler, InitedEvent.getType());
	}
}
