package cn.softnado.Gwt.Map.Baidu.Client.Dom.Core;

import cn.softnado.Gwt.Map.Baidu.Client.Dom.Array;
import cn.softnado.Gwt.Map.Baidu.Client.Dom.CoreEvent;
import cn.softnado.Gwt.Map.Baidu.Client.Dom.TypeTargetEventArgs;
import cn.softnado.Gwt.Map.Baidu.Client.Dom.CoreEventHandler;
import cn.softnado.Gwt.Map.Baidu.Client.Dom.HasHandlersJsObject;
import cn.softnado.Gwt.Map.Baidu.Client.Dom.TypeTargetPointPixelEventArgs;
import cn.softnado.Gwt.Map.Baidu.Client.Dom.TypeTargetPointPixelOverlayEventArgs;
import cn.softnado.Gwt.Map.Baidu.Client.Dom.Base.Bounds;
import cn.softnado.Gwt.Map.Baidu.Client.Dom.Base.Pixel;
import cn.softnado.Gwt.Map.Baidu.Client.Dom.Base.Point;
import cn.softnado.Gwt.Map.Baidu.Client.Dom.Base.Size;
import cn.softnado.Gwt.Map.Baidu.Client.Dom.Control.Control;
import cn.softnado.Gwt.Map.Baidu.Client.Dom.Layer.TileLayer;
import cn.softnado.Gwt.Map.Baidu.Client.Dom.Menu.ContextMenu;
import cn.softnado.Gwt.Map.Baidu.Client.Dom.Overlay.Hotspot;
import cn.softnado.Gwt.Map.Baidu.Client.Dom.Overlay.InfoWindow;
import cn.softnado.Gwt.Map.Baidu.Client.Dom.Overlay.MapPanes;
import cn.softnado.Gwt.Map.Baidu.Client.Dom.Overlay.Overlay;
import cn.softnado.Gwt.Map.Baidu.Client.Dom.Type.MapType;

import com.google.gwt.dom.client.DivElement;
import com.google.gwt.event.shared.HandlerRegistration;

public class Map extends HasHandlersJsObject {

	protected Map() {
	}

	/**
	 * 鏋勯€犲嚱鏁?	 */

	public static native Map CreateInstance(String divId)
	/*-{
		return new $wnd.BMap.Map(divId);
	}-*/;

	public static native Map CreateInstance(String divId, MapOptions option)
	/*-{
		return new $wnd.BMap.Map(divId,option);
	}-*/;

	public static native Map CreateInstance(DivElement divElement)
	/*-{
		return new $wnd.BMap.Map(divElement);
	}-*/;

	public static native Map CreateInstance(DivElement divElement,
			MapOptions option)
	/*-{
		return new $wnd.BMap.Map(divElement,option);
	}-*/;

	/**
	 * 閰嶇疆鏂规硶
	 **/
	/**
	 * 鍚敤鍦板浘鎷栨嫿锛岄粯璁ゅ惎鐢ㄣ€?	 */
	public final native void EnableDragging()
	/*-{
		this.enableDragging();
	}-*/;

	/**
	 * 绂佺敤鍦板浘鎷栨嫿銆?	 */
	public final native void DisableDragging()
	/*-{
		this.disableDragging();
	}-*/;

	/**
	 * 鍚敤婊氳疆鏀惧ぇ缂╁皬锛岄粯璁ょ鐢ㄣ€?	 */
	public final native void EnableScrollWheelZoom()
	/*-{
		this.enableScrollWheelZoom();
	}-*/;

	/**
	 * 绂佺敤婊氳疆鏀惧ぇ缂╁皬銆?	 */
	public final native void DisableScrollWheelZoom()
	/*-{
		this.disableScrollWheelZoom();
	}-*/;

	/**
	 * 鍚敤鍙屽嚮鏀惧ぇ锛岄粯璁ゅ惎鐢ㄣ€?	 */
	public final native void EnableDoubleClickZoom()
	/*-{
		this.enableDoubleClickZoom();
	}-*/;

	/**
	 * 绂佺敤鍙屽嚮鏀惧ぇ銆?	 */
	public final native void DisableDoubleClickZoom()
	/*-{
		this.disableDoubleClickZoom();
	}-*/;

	/**
	 * 鍚敤閿洏鎿嶄綔锛岄粯璁ょ鐢ㄣ€傞敭鐩樼殑涓娿€佷笅銆佸乏銆佸彸閿彲杩炵画绉诲姩鍦板浘銆傚悓鏃舵寜涓嬪叾涓袱涓敭鍙娇鍦板浘杩涜瀵硅绉诲姩銆侾gUp銆丳gDn銆?	 * Home鍜孍nd閿細浣垮湴鍥惧钩绉诲叾1/2鐨勫ぇ灏忋€?銆?閿細浣垮湴鍥炬斁澶ф垨缂╁皬涓€绾с€?	 */
	public final native void EnableKeyboard()
	/*-{
		this.enableKeyboard();
	}-*/;

	/**
	 * 绂佺敤閿洏鎿嶄綔銆?	 */
	public final native void DisableKeyboard()
	/*-{
		this.disableKeyboard();
	}-*/;

	/**
	 * 鍚敤鍦板浘鎯€ф嫋鎷斤紝榛樿绂佺敤銆?鑷?1.1 鏂板)
	 */
	public final native void EnableInertialDragging()
	/*-{
		this.enableInertialDragging();
	}-*/;

	/**
	 * 绂佺敤鍦板浘鎯€ф嫋鎷姐€?鑷?1.1 鏂板)
	 */
	public final native void DisableInertialDragging()
	/*-{
		this.disableInertialDragging();
	}-*/;

	/**
	 * 鍚敤杩炵画缂╂斁鏁堟灉锛岄粯璁ょ鐢ㄣ€?鑷?1.1 鏂板)
	 */
	public final native void EnableContinuousZoom()
	/*-{
		this.enableContinuousZoom();
	}-*/;

	/**
	 * 绂佺敤杩炵画缂╂斁鏁堟灉銆?鑷?1.1 鏂板)
	 */
	public final native void DisableContinuousZoom()
	/*-{
		this.disableContinuousZoom();
	}-*/;

	/**
	 * 鍚敤鍙屾寚鎿嶄綔缂╂斁锛岄粯璁ゅ惎鐢ㄣ€?鑷?1.1 鏂板)
	 */
	public final native void EnablePinchToZoom()
	/*-{
		this.enablePinchToZoom();
	}-*/;

	/**
	 * 绂佺敤鍙屾寚鎿嶄綔缂╂斁銆?鑷?1.1 鏂板)
	 */
	public final native void DisablePinchToZoom()
	/*-{
		this.disablePinchToZoom();
	}-*/;

	/**
	 * 鍚敤鑷姩閫傚簲瀹瑰櫒灏哄鍙樺寲锛岄粯璁ゅ惎鐢ㄣ€?鑷?1.2 鏂板)
	 */
	public final native void EnableAutoResize()
	/*-{
		this.enableAutoResize();
	}-*/;

	/**
	 * 绂佺敤鑷姩閫傚簲瀹瑰櫒灏哄鍙樺寲銆?鑷?1.2 鏂板)
	 */
	public final native void DisableAutoResize()
	/*-{
		this.disableAutoResize();
	}-*/;

	/**
	 * 璁剧疆鍦板浘榛樿鐨勯紶鏍囨寚閽堟牱寮忋€傚弬鏁癱ursor搴旂鍚圕SS鐨刢ursor灞炴€ц鑼冦€?鑷?1.1 鏂板)
	 * 
	 * @param cursor
	 *            榧犳爣鎸囬拡鏍峰紡
	 */
	public final native void setDefaultCursor(String cursor)
	/*-{
		this.setDefaultCursor(cursor);
	}-*/;

	/**
	 * 杩斿洖鍦板浘榛樿鐨勯紶鏍囨寚閽堟牱寮忋€?鑷?1.1 鏂板)
	 */
	public final native String getDefaultCursor()
	/*-{
		return this.getDefaultCursor();
	}-*/;

	/**
	 * 璁剧疆鎷栨嫿鍦板浘鏃剁殑榧犳爣鎸囬拡鏍峰紡銆傚弬鏁癱ursor搴旂鍚圕SS鐨刢ursor灞炴€ц鑼冦€?鑷?1.1 鏂板)
	 * 
	 * @param cursor
	 *            榧犳爣鎸囬拡鏍峰紡
	 */
	public final native void setDraggingCursor(String cursor)
	/*-{
		this.setDraggingCursor(cursor);
	}-*/;

	/**
	 * 杩斿洖鎷栨嫿鍦板浘鏃剁殑榧犳爣鎸囬拡鏍峰紡銆?鑷?1.1 鏂板)
	 */
	public final native String getDraggingCursor()
	/*-{
		return this.getDraggingCursor();
	}-*/;

	/**
	 * 璁剧疆鍦板浘鍏佽鐨勬渶灏忕骇鍒€傚彇鍊间笉寰楀皬浜庡湴鍥剧被鍨嬫墍鍏佽鐨勬渶灏忕骇鍒€?鑷?1.2 鏂板)
	 * 
	 * @param zoom
	 *            绾у埆
	 */
	public final native void setMinZoom(double zoom)
	/*-{
		this.setMinZoom(zoom);
	}-*/;

	/**
	 * 璁剧疆鍦板浘鍏佽鐨勬渶澶х骇鍒€傚彇鍊间笉寰楀ぇ浜庡湴鍥剧被鍨嬫墍鍏佽鐨勬渶澶х骇鍒€?鑷?1.2 鏂板)
	 * 
	 * @param zoom
	 *            绾у埆
	 */
	public final native void setMaxZoom(double zoom)
	/*-{
		this.setMaxZoom(zoom);
	}-*/;

	/**
	 * 鍦板浘鐘舵€佹柟娉?	 */
	/**
	 * 杩斿洖鍦板浘鍙鍖哄煙锛屼互鍦扮悊鍧愭爣琛ㄧず銆?	 * 
	 * @return 鍦板浘鍙鍖哄煙
	 */
	public final native Bounds getBounds()
	/*-{
		return this.getBounds();
	}-*/;

	/**
	 * 杩斿洖鍦板浘褰撳墠涓績鐐广€?	 * 
	 * @return 涓績鐐?	 */
	public final native Point getCenter()
	/*-{
		return this.getCenter();
	}-*/;

	/**
	 * 杩斿洖涓ょ偣涔嬮棿鐨勮窛绂伙紝鍗曚綅鏄背銆?鑷?1.1 鏂板)
	 * 
	 * @param start
	 * @param end
	 * @return 璺濈锛屽崟浣嶆槸绫?	 */
	public final native double getDistance(Point start, Point end)
	/*-{
		return this.getDistance(start,end);
	}-*/;

	/**
	 * 杩斿洖鍦板浘绫诲瀷銆?鑷?1.1 鏂板)
	 * 
	 * @return
	 */
	public final native MapType getMapType()
	/*-{
		return this.getMapType(zoom);
	}-*/;

	/**
	 * 杩斿洖鍦板浘瑙嗗浘鐨勫ぇ灏忥紝浠ュ儚绱犺〃绀恒€?	 * 
	 * @return 澶у皬锛屼互鍍忕礌琛ㄧず
	 */
	public final native Size getSize()
	/*-{
		return this.getSize();
	}-*/;

	/**
	 * 鏍规嵁鎻愪緵鐨勫湴鐞嗗尯鍩熸垨鍧愭爣鑾峰緱鏈€浣崇殑鍦板浘瑙嗛噹锛岃繑鍥炵殑瀵硅薄涓寘鍚玞enter鍜寊oom灞炴€э紝鍒嗗埆琛ㄧず鍦板浘鐨勪腑蹇冪偣鍜岀骇鍒€傛鏂规硶浠呰繑鍥炶閲庝俊鎭紝
	 * 涓嶄細灏嗘柊鐨勪腑蹇冪偣鍜岀骇鍒仛鐢ㄥ埌褰撳墠鍦板浘涓娿€?鑷?1.1 鏂板)
	 * 
	 * @param points
	 * @return
	 */
	public final native Viewport getViewport(Array<Point> points)
	/*-{
		return this.getViewport(points);
	}-*/;

	/**
	 * 鏍规嵁鎻愪緵鐨勫湴鐞嗗尯鍩熸垨鍧愭爣鑾峰緱鏈€浣崇殑鍦板浘瑙嗛噹锛岃繑鍥炵殑瀵硅薄涓寘鍚玞enter鍜寊oom灞炴€э紝鍒嗗埆琛ㄧず鍦板浘鐨勪腑蹇冪偣鍜岀骇鍒€傛鏂规硶浠呰繑鍥炶閲庝俊鎭紝
	 * 涓嶄細灏嗘柊鐨勪腑蹇冪偣鍜岀骇鍒仛鐢ㄥ埌褰撳墠鍦板浘涓娿€?鑷?1.1 鏂板)
	 * 
	 * @param points
	 * @param viewportOptions
	 * @return
	 */
	public final native Viewport getViewport(Array<Point> points,
			ViewportOptions viewportOptions)
	/*-{
		return this.getViewport(points,viewportOptions);
	}-*/;

	/**
	 * 杩斿洖鍦板浘褰撳墠缂╂斁绾у埆銆?	 * 
	 * @return
	 */
	public final native double getZoom()
	/*-{
		return this.getZoom();
	}-*/;

	/**
	 * 淇敼鍦板浘鐘舵€佹柟娉?	 **/
	/**
	 * 璁惧垵濮嬪寲鍦板浘銆?	 * 濡傛灉center绫诲瀷涓篜oint鏃讹紝zoom蹇呴』璧嬪€硷紝鑼冨洿3-19绾э紝鑻ヨ皟鐢ㄩ珮娓呭簳鍥撅紙閽堝绉诲姩绔紑鍙戯級鏃讹紝zoom鍙祴鍊艰寖鍥翠负3-18
	 * 绾с€傚鏋渃enter绫诲瀷涓哄瓧绗︿覆鏃讹紝姣斿鈥滃寳浜€濓紝zoom鍙互蹇界暐锛屽湴鍥惧皢鑷姩鏍规嵁center閫傞厤鏈€浣硓oom绾у埆銆?	 */
	public final native void CenterAndZoom(Point center, double zoom)
	/*-{
		this.centerAndZoom(center,zoom);
	}-*/;

	/**
	 * 淇敼鍦板浘鐘舵€佹柟娉?	 **/
	/**
	 * 璁惧垵濮嬪寲鍦板浘銆?	 * 濡傛灉center绫诲瀷涓篜oint鏃讹紝zoom蹇呴』璧嬪€硷紝鑼冨洿3-19绾э紝鑻ヨ皟鐢ㄩ珮娓呭簳鍥撅紙閽堝绉诲姩绔紑鍙戯級鏃讹紝zoom鍙祴鍊艰寖鍥翠负3-18
	 * 绾с€傚鏋渃enter绫诲瀷涓哄瓧绗︿覆鏃讹紝姣斿鈥滃寳浜€濓紝zoom鍙互蹇界暐锛屽湴鍥惧皢鑷姩鏍规嵁center閫傞厤鏈€浣硓oom绾у埆銆?	 */
	public final native void CenterAndZoom(String center, double zoom)
	/*-{
		this.centerAndZoom(center,zoom);
	}-*/;

	/**
	 * 淇敼鍦板浘鐘舵€佹柟娉?	 **/
	/**
	 * 璁惧垵濮嬪寲鍦板浘銆?	 * 濡傛灉center绫诲瀷涓篜oint鏃讹紝zoom蹇呴』璧嬪€硷紝鑼冨洿3-19绾э紝鑻ヨ皟鐢ㄩ珮娓呭簳鍥撅紙閽堝绉诲姩绔紑鍙戯級鏃讹紝zoom鍙祴鍊艰寖鍥翠负3-18
	 * 绾с€傚鏋渃enter绫诲瀷涓哄瓧绗︿覆鏃讹紝姣斿鈥滃寳浜€濓紝zoom鍙互蹇界暐锛屽湴鍥惧皢鑷姩鏍规嵁center閫傞厤鏈€浣硓oom绾у埆銆?	 */
	public final native void CenterAndZoom(String center)
	/*-{
		this.centerAndZoom(center);
	}-*/;

	/**
	 * 灏嗗湴鍥剧殑涓績鐐规洿鏀逛负缁欏畾鐨勭偣銆傚鏋滆鐐瑰湪褰撳墠鐨勫湴鍥捐鍥句腑宸茬粡鍙锛屽垯浼氫互骞虫粦鍔ㄧ敾鐨勬柟寮忕Щ鍔ㄥ埌涓績鐐逛綅缃€傚彲浠ラ€氳繃閰嶇疆寮哄埗绉诲姩杩囩▼涓嶄娇鐢ㄥ姩鐢绘晥鏋溿€?	 * 
	 * @param center
	 */
	public final native void PanTo(Point center)
	/*-{
		this.panTo(center);
	}-*/;

	/**
	 * 灏嗗湴鍥剧殑涓績鐐规洿鏀逛负缁欏畾鐨勭偣銆傚鏋滆鐐瑰湪褰撳墠鐨勫湴鍥捐鍥句腑宸茬粡鍙锛屽垯浼氫互骞虫粦鍔ㄧ敾鐨勬柟寮忕Щ鍔ㄥ埌涓績鐐逛綅缃€傚彲浠ラ€氳繃閰嶇疆寮哄埗绉诲姩杩囩▼涓嶄娇鐢ㄥ姩鐢绘晥鏋溿€?	 * 
	 * @param center
	 * @param opts
	 */
	public final native void PanTo(Point center, PanOptions opts)
	/*-{
		this.panTo(center,opts);
	}-*/;

	/**
	 * 灏嗗湴鍥惧湪姘村钩浣嶇疆涓婄Щ鍔▁鍍忕礌锛屽瀭鐩翠綅缃笂绉诲姩y鍍忕礌銆傚鏋滄寚瀹氱殑鍍忕礌澶т簬鍙鍖哄煙鑼冨洿鎴栬€呭湪閰嶇疆涓寚瀹氭病鏈夊姩鐢绘晥鏋滐紝鍒欎笉鎵ц婊戝姩鏁堟灉銆?	 * 
	 * @param x
	 * @param y
	 * @param opts
	 */
	public final native void PanBy(double x, double y, PanOptions opts)
	/*-{
		this.panBy(center,zoom);
	}-*/;

	/**
	 * 閲嶆柊璁剧疆鍦板浘锛屾仮澶嶅湴鍥惧垵濮嬪寲鏃剁殑涓績鐐瑰拰绾у埆銆?	 */
	public final native void Reset()
	/*-{
		this.reset();
	}-*/;

	/**
	 * 璁剧疆鍦板浘涓績鐐广€俢enter闄や簡鍙互涓哄潗鏍囩偣浠ュ锛岃繕鏀寔鍩庡競鍚嶃€傛敞锛氫娇鐢ㄥ煄甯傚悕杩涜璁剧疆鏃惰鏂规硶鏄紓姝ユ墽琛岋紝浣跨敤鍧愭爣鐐硅缃椂璇ユ柟娉曚笉鏄紓姝ユ墽琛屻€?	 * 
	 * @param center
	 */
	public final native void setCenter(Point center)
	/*-{
		this.setCenter(center);
	}-*/;

	/**
	 * 璁剧疆鍦板浘鍩庡競锛屾敞鎰忓綋鍦板浘鍒濆鍖栨椂鐨勭被鍨嬭缃负BMAP_PERSPECTIVE_MAP鏃讹紝
	 * 闇€瑕佸湪璋冪敤centerAndZoom涔嬪墠璋冪敤姝ゆ柟娉曡缃湴鍥炬墍鍦ㄥ煄甯傘€備緥濡傦細 var map = new BMap.Map(鈥渃ontainer鈥?
	 * {mapType: BMAP_PERSPECTIVE_MAP}); map.setCurrentCity(鈥滃寳浜競鈥?;
	 * map.centerAndZoom(new BMap.Point(116.404, 39.915), 18);
	 * 娉ㄦ剰锛氬垵濮嬪寲鐨勫潗鏍囧簲涓庢偍璁剧疆鐨勫煄甯傚搴?	 * 锛屽惁鍒欏湴鍥惧皢鏃犳硶姝ｅ父鏄剧ず銆傚鏋滃湴鍥惧垵濮嬪寲涓築MAP_NORMAL_MAP绫诲瀷锛屽垯鍦ㄨ皟鐢╯etMapType鍒囨崲鍦板浘绫诲瀷鏃朵篃瑕佽皟鐢ㄦ鏂规硶銆?(鑷?	 * 1.1 鏂板)
	 */
	public final native void setCurrentCity(String city)
	/*-{
		this.setCurrentCity(city);
	}-*/;

	/**
	 * 璁剧疆鍦板浘绫诲瀷銆傛敞鎰忥紝褰撹缃湴鍥剧被鍨嬩负BMAP_PERSPECTIVE_MAP鏃讹紝闇€瑕佽皟鐢╩ap.setCurrentCity鏂规硶璁剧疆鍩庡競銆?鑷?	 * 1.1 鏂板)
	 */
	public final native void setMapType(MapType mapType)
	/*-{
		this.setMapType(mapType);
	}-*/;

	/**
	 * 鏍规嵁鎻愪緵鐨勫潗鏍囩偣鏁扮粍銆佸湴鐞嗗尯鍩熸垨瑙嗛噹瀵硅薄璁剧疆鍦板浘瑙嗛噹锛岃皟鏁村悗鐨勮閲庝細淇濊瘉鍖呭惈鎻愪緵鐨勫潗鏍囩偣鎴栧湴鐞嗗尯鍩熴€?鑷?1.1 鏂板)
	 * 
	 * @param view
	 */
	public final native void setViewport(Array<Point> view)
	/*-{
		this.setViewport(view);
	}-*/;

	/**
	 * 鏍规嵁鎻愪緵鐨勫潗鏍囩偣鏁扮粍銆佸湴鐞嗗尯鍩熸垨瑙嗛噹瀵硅薄璁剧疆鍦板浘瑙嗛噹锛岃皟鏁村悗鐨勮閲庝細淇濊瘉鍖呭惈鎻愪緵鐨勫潗鏍囩偣鎴栧湴鐞嗗尯鍩熴€?鑷?1.1 鏂板)
	 * 
	 * @param view
	 * @param viewportOptions
	 */
	public final native void setViewport(Array<Point> view,
			ViewportOptions viewportOptions)
	/*-{
		this.setViewport(view,viewportOptions);
	}-*/;

	/**
	 * 鏍规嵁鎻愪緵鐨勫潗鏍囩偣鏁扮粍銆佸湴鐞嗗尯鍩熸垨瑙嗛噹瀵硅薄璁剧疆鍦板浘瑙嗛噹锛岃皟鏁村悗鐨勮閲庝細淇濊瘉鍖呭惈鎻愪緵鐨勫潗鏍囩偣鎴栧湴鐞嗗尯鍩熴€?鑷?1.1 鏂板)
	 * 
	 * @param view
	 */
	public final native void setViewport(Bounds view)
	/*-{
		this.setViewport(view);
	}-*/;

	/**
	 * 鏍规嵁鎻愪緵鐨勫潗鏍囩偣鏁扮粍銆佸湴鐞嗗尯鍩熸垨瑙嗛噹瀵硅薄璁剧疆鍦板浘瑙嗛噹锛岃皟鏁村悗鐨勮閲庝細淇濊瘉鍖呭惈鎻愪緵鐨勫潗鏍囩偣鎴栧湴鐞嗗尯鍩熴€?鑷?1.1 鏂板)
	 * 
	 * @param view
	 * @param viewportOptions
	 */
	public final native void setViewport(Bounds view,
			ViewportOptions viewportOptions)
	/*-{
		this.setViewport(view,viewportOptions);
	}-*/;

	/**
	 * 鏍规嵁鎻愪緵鐨勫潗鏍囩偣鏁扮粍銆佸湴鐞嗗尯鍩熸垨瑙嗛噹瀵硅薄璁剧疆鍦板浘瑙嗛噹锛岃皟鏁村悗鐨勮閲庝細淇濊瘉鍖呭惈鎻愪緵鐨勫潗鏍囩偣鎴栧湴鐞嗗尯鍩熴€?鑷?1.1 鏂板)
	 * 
	 * @param view
	 */
	public final native void setViewport(Viewport view)
	/*-{
		this.setViewport(view);
	}-*/;

	/**
	 * 鏍规嵁鎻愪緵鐨勫潗鏍囩偣鏁扮粍銆佸湴鐞嗗尯鍩熸垨瑙嗛噹瀵硅薄璁剧疆鍦板浘瑙嗛噹锛岃皟鏁村悗鐨勮閲庝細淇濊瘉鍖呭惈鎻愪緵鐨勫潗鏍囩偣鎴栧湴鐞嗗尯鍩熴€?鑷?1.1 鏂板)
	 * 
	 * @param view
	 * @param viewportOptions
	 */
	public final native void setViewport(Viewport view,
			ViewportOptions viewportOptions)
	/*-{
		this.setViewport(view,viewportOptions);
	}-*/;

	/**
	 * 灏嗚鍥惧垏鎹㈠埌鎸囧畾鐨勭缉鏀剧瓑绾э紝涓績鐐瑰潗鏍囦笉鍙樸€傛敞鎰忥細褰撴湁淇℃伅绐楀彛鍦ㄥ湴鍥句笂鎵撳紑鏃讹紝鍦板浘缂╂斁灏嗕繚璇佷俊鎭獥鍙ｆ墍鍦ㄧ殑鍧愭爣浣嶇疆涓嶅姩銆?鑷?1.2 搴熷純)
	 * 
	 * @param zoom
	 */
	public final native void ZoomTo(double zoom)
	/*-{
		this.zoomTo(zoom);
	}-*/;

	/**
	 * 灏嗚鍥惧垏鎹㈠埌鎸囧畾鐨勭缉鏀剧瓑绾э紝涓績鐐瑰潗鏍囦笉鍙樸€傛敞鎰忥細褰撴湁淇℃伅绐楀彛鍦ㄥ湴鍥句笂鎵撳紑鏃讹紝鍦板浘缂╂斁灏嗕繚璇佷俊鎭獥鍙ｆ墍鍦ㄧ殑鍧愭爣浣嶇疆涓嶅姩銆?鑷?1.2 鏂板)
	 */
	public final native void setZoom(double zoom)
	/*-{
		this.setZoom(zoom);
	}-*/;

	/**
	 * 鏄惁浣跨敤楂樺垎杈ㄧ巼搴曞浘銆備粎褰搈apOptions.enableHighResolution灞炴€т负true涓旇澶囨敮鎸侀珮鍒嗚鲸鐜囨椂杩斿洖true銆?	 * 
	 * @return
	 */
	public final native boolean HighResolutionEnabled()
	/*-{
		this.highResolutionEnabled();
	}-*/;

	/**
	 * 鏀惧ぇ涓€绾ц鍥俱€?	 */
	public final native void ZoomIn()
	/*-{
		this.zoomIn();
	}-*/;

	/**
	 * 缂╁皬涓€绾ц鍥俱€?	 */
	public final native void ZoomOut()
	/*-{
		this.zoomOut();
	}-*/;

	/**
	 * 涓哄湴鍥炬坊鍔犵儹鍖恒€?鑷?1.2 鏂板)
	 * 
	 * @param hotspot
	 */
	public final native void AddHotspot(Hotspot hotspot)
	/*-{
		this.addHotspot(hotspot);
	}-*/;

	/**
	 * 绉婚櫎鏌愪釜鍦板浘鐑尯銆?鑷?1.2 鏂板)
	 * 
	 * @param hotspot
	 */
	public final native void RemoveHotspot(Hotspot hotspot)
	/*-{
		this.removeHotspot(hotspot);
	}-*/;

	/**
	 * 娓呯┖鍦板浘鎵€鏈夌儹鍖恒€?鑷?1.2 鏂板)
	 */
	public final native void ClearHotspots()
	/*-{
		this.clearHotspots();
	}-*/;

	/**
	 * 閫氱煡鍦板浘瀹瑰櫒灏哄鍙戠敓鍙樺寲銆傞粯璁ゆ儏鍐典笅鍦板浘浼氳嚜鍔ㄦ娴嬪鍣ㄥ昂瀵告槸鍚﹀彂鐢熷彉鍖栧苟閲嶆柊鍔犺浇鍥惧潡锛?	 * 濡傛灉淇敼浜哅apOptions鐨別nableAutoResize涓篺alse
	 * 锛屾垨鑰呰皟鐢ㄤ簡Map鐨刣isableAutoResize()鏂规硶锛岄偅涔堥渶瑕佽皟鐢ㄦ鏂规硶鏉ラ€氱煡鍦板浘銆?鑷?1.2 鏂板)
	 */
	public final native void CheckResize()
	/*-{
		this.checkResize();
	}-*/;

	/**
	 * 鎺т欢鏂规硶
	 */
	/**
	 * 灏嗘帶浠舵坊鍔犲埌鍦板浘锛屼竴涓帶浠跺疄渚嬪彧鑳藉悜鍦板浘涓坊鍔犱竴娆°€?	 * 
	 * @param control
	 */
	public final native void AddControl(Control control)
	/*-{
		this.addControl(control);
	}-*/;

	/**
	 * 浠庡湴鍥句腑绉婚櫎鎺т欢銆傚鏋滄帶浠朵粠鏈娣诲姞鍒板湴鍥句腑锛屽垯璇ョЩ闄や笉璧蜂换浣曚綔鐢ㄣ€?	 * 
	 * @param control
	 */
	public final native void RemoveControl(Control control)
	/*-{
		this.removeControl(control);
	}-*/;

	/**
	 * 杩斿洖鍦板浘鐨勫鍣ㄥ厓绱犮€傚綋鍒涘缓鐢ㄦ埛鑷畾涔夋帶浠舵椂锛岄渶瑕佽嚜琛屽疄鐜癈ontrol.initialize()鏂规硶锛屽苟灏嗘帶浠剁殑瀹瑰櫒鍏冪礌娣诲姞鍒板湴鍥句笂锛?	 * 閫氳繃姝ゆ柟娉曞彲鑾峰緱鍦板浘瀹瑰櫒銆?	 * 
	 * @return
	 */
	public final native DivElement getContainer()
	/*-{
		this.getContainer();
	}-*/;

	/**
	 * 鍙抽敭鑿滃崟鏂规硶
	 */
	/**
	 * 娣诲姞鍙抽敭鑿滃崟銆?	 * 
	 * @param menu
	 */
	public final native void AddContextMenu(ContextMenu menu)
	/*-{
		this.addContextMenu(menu);
	}-*/;

	/**
	 * 绉婚櫎鍙抽敭鑿滃崟銆?	 * 
	 * @param menu
	 */
	public final native void RemoveContextMenu(ContextMenu menu)
	/*-{
		this.removeContextMenu(menu);
	}-*/;

	/**
	 * 瑕嗙洊鐗╂柟娉?	 */
	/**
	 * 灏嗚鐩栫墿娣诲姞鍒板湴鍥句腑锛屼竴涓鐩栫墿瀹炰緥鍙兘鍚戝湴鍥句腑娣诲姞涓€娆°€?	 * 
	 * @param overlay
	 */
	public final native void AddOverlay(Overlay overlay)
	/*-{
		this.addOverlay(overlay);
	}-*/;

	/**
	 * 浠庡湴鍥句腑绉婚櫎瑕嗙洊鐗┿€傚鏋滆鐩栫墿浠庢湭琚坊鍔犲埌鍦板浘涓紝鍒欒绉婚櫎涓嶈捣浠讳綍浣滅敤銆?	 * 
	 * @param overlay
	 */
	public final native void RemoveOverlay(Overlay overlay)
	/*-{
		this.removeOverlay(overlay);
	}-*/;

	/**
	 * 娓呴櫎鍦板浘涓婃墍鏈夎鐩栫墿銆?	 */
	public final native void ClearOverlays()
	/*-{
		this.clearOverlays();
	}-*/;

	/**
	 * 鍦ㄥ湴鍥句笂鎵撳紑淇℃伅绐楀彛銆?	 * 
	 * @param infoWnd
	 * @param point
	 */
	public final native void OpenInfoWindow(InfoWindow infoWnd, Point point)
	/*-{
		this.openInfoWindow(infoWnd,point);
	}-*/;

	/**
	 * 鍏抽棴鍦ㄥ湴鍥句笂鎵撳紑鐨勪俊鎭獥鍙ｃ€傚湪鏍囨敞涓婃墦寮€鐨勪俊鎭獥鍙ｄ篃鍙€氳繃姝ゆ柟娉曡繘琛屽叧闂€?	 */
	public final native void CloseInfoWindow()
	/*-{
		this.closeInfoWindow();
	}-*/;

	/**
	 * 鏍规嵁鍦扮悊鍧愭爣鑾峰彇瀵瑰簲鐨勮鐩栫墿瀹瑰櫒鐨勫潗鏍囷紝姝ゆ柟娉曠敤浜庤嚜瀹氫箟瑕嗙洊鐗┿€?鑷?1.1 鏂板)
	 * 
	 * @param point
	 * @return
	 */
	public final native Pixel PointToOverlayPixel(Point point)
	/*-{
		return this.pointToOverlayPixel(point);
	}-*/;

	/**
	 * 鏍规嵁瑕嗙洊鐗╁鍣ㄧ殑鍧愭爣鑾峰彇瀵瑰簲鐨勫湴鐞嗗潗鏍囥€?鑷?1.1 鏂板)
	 * 
	 * @param pixel
	 * @return
	 */
	public final native Point OverlayPixelToPoint(Pixel pixel)
	/*-{
		return this.overlayPixelToPoint(pixel);
	}-*/;

	/**
	 * 杩斿洖鍦板浘涓婂浜庢墦寮€鐘舵€佺殑淇℃伅绐楃殑瀹炰緥銆傚綋鍦板浘娌℃湁鎵撳紑鐨勪俊鎭獥鍙ｆ椂锛屾鏂规硶杩斿洖null銆?鑷?1.1 鏂板)
	 * 
	 * @return
	 */
	public final native InfoWindow getInfoWindow()
	/*-{
		return this.getInfoWindow();
	}-*/;

	/**
	 * 杩斿洖鍦板浘涓婄殑鎵€鏈夎鐩栫墿銆?鑷?1.1 鏂板)
	 * 
	 * @return
	 */
	public final native Array<Overlay> getOverlays()
	/*-{
		return this.getOverlays();
	}-*/;

	/**
	 * 杩斿洖鍦板浘瑕嗙洊鐗╁鍣ㄥ垪琛ㄣ€?鑷?1.1 鏂板)
	 * 
	 * @return
	 */
	public final native MapPanes getPanes()
	/*-{
		return this.getPanes();
	}-*/;

	/**
	 * 鍦板浘鍥惧眰鏂规硶
	 */
	/**
	 * 娣诲姞涓€涓嚜瀹氫箟鍦板浘鍥惧眰銆?	 * 
	 * @param tileLayer
	 */
	public final native void AddTileLayer(TileLayer tileLayer)
	/*-{
		this.addTileLayer(tileLayer);
	}-*/;

	/**
	 * 绉婚櫎涓€涓嚜瀹氫箟鍦板浘鍥惧眰銆?	 * 
	 * @param tilelayer
	 */
	public final native void RemoveTileLayer(TileLayer tilelayer)
	/*-{
		this.removeTileLayer(tilelayer);
	}-*/;

	/**
	 * 鍧愭爣鍙樻崲
	 */
	/**
	 * 鍍忕礌鍧愭爣杞崲涓虹粡绾害鍧愭爣銆?	 * 
	 * @param pixel
	 */
	public final native Point PixelToPoint(Pixel pixel)
	/*-{
		return this.pixelToPoint(pixel);
	}-*/;

	/**
	 * 缁忕含搴﹀潗鏍囪浆鎹负鍍忕礌鍧愭爣銆?	 * 
	 * @param point
	 */
	public final native Pixel PointToPixel(Point point)
	/*-{
		return this.pointToPixel(point);
	}-*/;

	/**
	 * 浜嬩欢鏈哄埗
	 */

	/**
	 * 鍦↗S绾у埆娉ㄥ唽浜嬩欢
	 */
	public final native void RegistOriginEvents()
	/*-{
		var owner = this;
		if(owner.OriginEventsRegisted){
			return;
		}else{
			owner.OriginEventsRegisted = true;
		}
		owner.addEventListener("click",function(e){
			@cn.softnado.Gwt.Map.Baidu.Client.Dom.Core.Map::FireClick(Lcn/softnado/Gwt/Map/Baidu/Client/Dom/Core/Map;Lcn/softnado/Gwt/Map/Baidu/Client/Dom/TypeTargetPointPixelOverlayEventArgs;)(owner,e);
		});
		owner.addEventListener("dblclick",function(e){
			@cn.softnado.Gwt.Map.Baidu.Client.Dom.Core.Map::FireDoubleClick(Lcn/softnado/Gwt/Map/Baidu/Client/Dom/Core/Map;Lcn/softnado/Gwt/Map/Baidu/Client/Dom/TypeTargetPointPixelEventArgs;)(owner,e);
		});
		owner.addEventListener("rightclick",function(e){
			@cn.softnado.Gwt.Map.Baidu.Client.Dom.Core.Map::FireRightClick(Lcn/softnado/Gwt/Map/Baidu/Client/Dom/Core/Map;Lcn/softnado/Gwt/Map/Baidu/Client/Dom/TypeTargetPointPixelOverlayEventArgs;)(owner,e);
		});
		owner.addEventListener("rightdblclick",function(e){
			@cn.softnado.Gwt.Map.Baidu.Client.Dom.Core.Map::FireRightDoubleClick(Lcn/softnado/Gwt/Map/Baidu/Client/Dom/Core/Map;Lcn/softnado/Gwt/Map/Baidu/Client/Dom/TypeTargetPointPixelEventArgs;)(owner,e);
		});
		owner.addEventListener("mousemove",function(e){
			@cn.softnado.Gwt.Map.Baidu.Client.Dom.Core.Map::FireMouseMove(Lcn/softnado/Gwt/Map/Baidu/Client/Dom/Core/Map;Lcn/softnado/Gwt/Map/Baidu/Client/Dom/TypeTargetPointPixelOverlayEventArgs;)(owner,e);
		});
	}-*/;

	/**
	 * 瑙﹀彂鍗曞嚮浜嬩欢
	 * 
	 * @param map
	 * @param args
	 */
	public static final void FireClick(Map owner,
			TypeTargetPointPixelOverlayEventArgs args) {
		CoreEvent.<TypeTargetPointPixelOverlayEventArgs, Map> Fire(owner,
				"click", args);
	}

	/**
	 * 娣诲姞鍗曞嚮浜嬩欢澶勭悊
	 * 
	 * @param handler
	 * @return
	 */
	public final HandlerRegistration addClickHandler(
			CoreEventHandler<TypeTargetPointPixelOverlayEventArgs> handler) {
		return this.addHandler(CoreEvent
				.<TypeTargetPointPixelOverlayEventArgs, Map> GetType(this,
						"click"), handler);
	}

	/**
	 * 瑙﹀彂鍙屽嚮浜嬩欢
	 * 
	 * @param map
	 * @param args
	 */
	public static final void FireDoubleClick(Map owner,
			TypeTargetPointPixelEventArgs args) {
		CoreEvent.<TypeTargetPointPixelEventArgs, Map> Fire(owner, "dblclick",
				args);
	}

	/**
	 * 娣诲姞鍙屽嚮浜嬩欢澶勭悊
	 * 
	 * @param handler
	 * @return
	 */
	public final HandlerRegistration addDoubleClickHandler(
			CoreEventHandler<TypeTargetPointPixelEventArgs> handler) {
		return this.addHandler(
				CoreEvent.<TypeTargetPointPixelEventArgs, Map> GetType(this,
						"dblclick"), handler);
	}

	/**
	 * 瑙﹀彂鍙抽敭鍗曞嚮
	 * 
	 * @param map
	 * @param args
	 */
	public static final void FireRightClick(Map owner,
			TypeTargetPointPixelOverlayEventArgs args) {
		CoreEvent.<TypeTargetPointPixelOverlayEventArgs, Map> Fire(owner,
				"rightclick", args);
	}

	/**
	 * 娣诲姞鍙抽敭鍗曞嚮澶勭悊
	 * 
	 * @param handler
	 * @return
	 */
	public final HandlerRegistration addRightClickHandler(
			CoreEventHandler<TypeTargetPointPixelOverlayEventArgs> handler) {
		return this.addHandler(CoreEvent
				.<TypeTargetPointPixelOverlayEventArgs, Map> GetType(this,
						"rightclick"), handler);
	}

	/**
	 * 瑙﹀彂鍙抽敭鍙屽嚮
	 * 
	 * @param map
	 * @param args
	 */
	public static final void FireRightDoubleClick(Map owner,
			TypeTargetPointPixelEventArgs args) {
		CoreEvent.<TypeTargetPointPixelEventArgs, Map> Fire(owner,
				"rightdblclick", args);
	}

	/**
	 * 娣诲姞鍙抽敭鍙屽嚮澶勭悊
	 * 
	 * @param handler
	 * @return
	 */
	public final HandlerRegistration addRightDoubleClickHandler(
			CoreEventHandler<TypeTargetPointPixelEventArgs> handler) {
		return this.addHandler(CoreEvent
				.<TypeTargetPointPixelEventArgs, Map> GetType(this,
						"rightdblclick"), handler);
	}

	/**
	 * 瑙﹀彂鍦板浘绫诲瀷鏇存敼
	 * 
	 * @param map
	 * @param args
	 */
	public static final void FireMapTypeChange(Map owner, TypeTargetEventArgs args) {
		CoreEvent.<TypeTargetEventArgs, Map> Fire(owner, "maptypechange", args);
	}

	/**
	 * 娣诲姞鍦板浘绫诲瀷鏇存敼澶勭悊
	 * 
	 * @param handler
	 * @return
	 */
	public final HandlerRegistration addMapTypeChangeHandler(
			CoreEventHandler<TypeTargetEventArgs> handler) {
		return this.addHandler(CoreEvent.<TypeTargetEventArgs, Map> GetType(
				this, "maptypechange"), handler);
	}

	/**
	 * 瑙﹀彂榧犳爣绉诲姩浜嬩欢
	 * 
	 * @param map
	 * @param args
	 */
	public static final void FireMouseMove(Map owner,
			TypeTargetPointPixelOverlayEventArgs args) {
		CoreEvent.<TypeTargetPointPixelOverlayEventArgs, Map> Fire(owner,
				"mousemove", args);
	}

	/**
	 * 娣诲姞榧犳爣绉诲姩浜嬩欢澶勭悊
	 * 
	 * @param handler
	 * @return
	 */
	public final HandlerRegistration addMouseMoveHandler(
			CoreEventHandler<TypeTargetPointPixelOverlayEventArgs> handler) {
		return this.addHandler(CoreEvent
				.<TypeTargetPointPixelOverlayEventArgs, Map> GetType(this,
						"mousemove"), handler);
	}

}
