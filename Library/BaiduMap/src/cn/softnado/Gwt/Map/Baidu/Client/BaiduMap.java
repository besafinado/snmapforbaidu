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
	 * 瀵煎叆Baidu鍦板浘搴?	 * 
	 * @param key
	 *            濡傛灉闇€瑕佷娇鐢↙BS浜戞湇鍔★紝闇€瑕佹彁渚汯EY
	 * @throws InvalidKeyException
	 *             Key 淇℃伅涓嶆甯?	 */
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
			// 娉ㄥ唽绐楀彛绾у埆鑴氭湰鍥炶皟鍑芥暟
			BaiduMap.RegistGlobalMethods();
			Document.get().getBody().appendChild(BaiduMap.ScriptHrefStub);
		}
	}

	/**
	 * 娉ㄥ唽绐楀彛绾у埆鑴氭湰鍥炶皟鍑芥暟
	 */
	private static native void RegistGlobalMethods()
	/*-{
		$wnd.BMapLoaded = $entry(@cn.softnado.Gwt.Map.Baidu.Client.BaiduMap::ScriptInited());
		$wnd.BMapScriptInited = function() {
			$wnd.BMapLoaded();
		};
	}-*/;

	/**
	 * 鍏ㄥ眬鍦板浘娉ㄥ唽闆嗗悎
	 */
	private static ArrayList<BaiduMap> BMapsList = new ArrayList<BaiduMap>();

	/**
	 * JS搴撳姞杞芥垚鍔熷悗鑷姩鍥炶皟鍑芥暟锛岃涓嶈鑷璋冪敤
	 */
	@Deprecated
	public static void ScriptInited() {
		BaiduMap.IsScriptInitedStub = true;
		for (BaiduMap bmap : BMapsList) {
			bmap.InitMapAfterScriptInited();
		}
	}

	/**
	 * 娉ㄥ唽鍦板浘瀹炰緥锛屼互渚垮湪鑴氭湰鍔犺浇鍚庤嚜鍔ㄨЕ鍙戝垵濮嬪寲浜嬩欢
	 * 
	 * @param bmap
	 *            闇€瑕佹敞鍐岀殑鍦板浘
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
	 * 鑾峰彇鐧惧害鍦板浘JS搴撴槸鍚﹀姞杞界姸鎬?	 * 
	 * @return
	 */
	public static boolean IsBaiduMapLibraryInited() {
		return BaiduMap.IsScriptInitedStub;
	}

	/**
	 * 鍒涘缓鏂板湴鍥?	 */
	public BaiduMap() {
		this(Document.get().createDivElement(), "bmap-BMap");
	}

	/**
	 * 鍒涘缓鏂扮殑鐧惧害鍦板浘缁勪欢
	 * 
	 * @param mapDivElement
	 *            鐩爣鍒濆鍖朌IV
	 * @param styleName
	 *            鐩爣灞傛牱寮忓悕
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
	 * 鍒涘缓鏂扮櫨搴﹀湴鍥剧粍浠?	 * 
	 * @param mapDivElement
	 *            鐩爣DIV
	 */
	public BaiduMap(DivElement mapDivElement) {
		this(mapDivElement, "bdmap-Map");
	}

	/**
	 * 鑾峰彇鍐呴儴Map瀵硅薄
	 * 
	 * @return
	 */
	public Map getMap() {
		return this.MapStub;
	}

	/**
	 * 鏄惁鍒濆鍖栦簡
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
