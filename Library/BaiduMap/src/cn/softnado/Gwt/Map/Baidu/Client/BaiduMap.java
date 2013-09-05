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
	 * 导入Baidu地图库
	 * 
	 * @param key
	 *            如果需要使用LBS云服务，需要提供KEY
	 * @throws InvalidKeyException
	 *             Key 信息不正常
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
			// 注册窗口级别脚本回调函数
			BaiduMap.RegistGlobalMethods();
			Document.get().getBody().appendChild(BaiduMap.ScriptHrefStub);
		}
	}

	/**
	 * 注册窗口级别脚本回调函数
	 */
	private static native void RegistGlobalMethods()
	/*-{
		$wnd.BMapLoaded = $entry(@cn.softnado.Gwt.Map.Baidu.Client.BaiduMap::ScriptInited());
		$wnd.BMapScriptInited = function() {
			$wnd.BMapLoaded();
		};
	}-*/;

	/**
	 * 全局地图注册集合
	 */
	private static ArrayList<BaiduMap> BMapsList = new ArrayList<BaiduMap>();

	/**
	 * JS库加载成功后自动回调函数，请不要自行调用
	 */
	@Deprecated
	public static void ScriptInited() {
		BaiduMap.IsScriptInitedStub = true;
		for (BaiduMap bmap : BMapsList) {
			bmap.InitMapAfterScriptInited();
		}
	}

	/**
	 * 注册地图实例，以便在脚本加载后自动触发初始化事件
	 * 
	 * @param bmap
	 *            需要注册的地图
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
	 * 获取百度地图JS库是否加载状态
	 * 
	 * @return
	 */
	public static boolean IsBaiduMapLibraryInited() {
		return BaiduMap.IsScriptInitedStub;
	}

	/**
	 * 创建新地图
	 */
	public BaiduMap() {
		this(Document.get().createDivElement(), "bmap-BMap");
	}

	/**
	 * 创建新的百度地图组件
	 * 
	 * @param mapDivElement
	 *            目标初始化DIV
	 * @param styleName
	 *            目标层样式名
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
	 * 创建新百度地图组件
	 * 
	 * @param mapDivElement
	 *            目标DIV
	 */
	public BaiduMap(DivElement mapDivElement) {
		this(mapDivElement, "bdmap-Map");
	}

	/**
	 * 获取内部Map对象
	 * 
	 * @return
	 */
	public Map getMap() {
		return this.MapStub;
	}

	/**
	 * 是否初始化了
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
