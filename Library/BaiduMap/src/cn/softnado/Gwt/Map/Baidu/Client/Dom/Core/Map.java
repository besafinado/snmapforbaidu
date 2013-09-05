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
	 * 构造函数
	 */

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
	 * 配置方法
	 **/
	/**
	 * 启用地图拖拽，默认启用。
	 */
	public final native void EnableDragging()
	/*-{
		this.enableDragging();
	}-*/;

	/**
	 * 禁用地图拖拽。
	 */
	public final native void DisableDragging()
	/*-{
		this.disableDragging();
	}-*/;

	/**
	 * 启用滚轮放大缩小，默认禁用。
	 */
	public final native void EnableScrollWheelZoom()
	/*-{
		this.enableScrollWheelZoom();
	}-*/;

	/**
	 * 禁用滚轮放大缩小。
	 */
	public final native void DisableScrollWheelZoom()
	/*-{
		this.disableScrollWheelZoom();
	}-*/;

	/**
	 * 启用双击放大，默认启用。
	 */
	public final native void EnableDoubleClickZoom()
	/*-{
		this.enableDoubleClickZoom();
	}-*/;

	/**
	 * 禁用双击放大。
	 */
	public final native void DisableDoubleClickZoom()
	/*-{
		this.disableDoubleClickZoom();
	}-*/;

	/**
	 * 启用键盘操作，默认禁用。键盘的上、下、左、右键可连续移动地图。同时按下其中两个键可使地图进行对角移动。PgUp、PgDn、
	 * Home和End键会使地图平移其1/2的大小。+、-键会使地图放大或缩小一级。
	 */
	public final native void EnableKeyboard()
	/*-{
		this.enableKeyboard();
	}-*/;

	/**
	 * 禁用键盘操作。
	 */
	public final native void DisableKeyboard()
	/*-{
		this.disableKeyboard();
	}-*/;

	/**
	 * 启用地图惯性拖拽，默认禁用。(自 1.1 新增)
	 */
	public final native void EnableInertialDragging()
	/*-{
		this.enableInertialDragging();
	}-*/;

	/**
	 * 禁用地图惯性拖拽。(自 1.1 新增)
	 */
	public final native void DisableInertialDragging()
	/*-{
		this.disableInertialDragging();
	}-*/;

	/**
	 * 启用连续缩放效果，默认禁用。(自 1.1 新增)
	 */
	public final native void EnableContinuousZoom()
	/*-{
		this.enableContinuousZoom();
	}-*/;

	/**
	 * 禁用连续缩放效果。(自 1.1 新增)
	 */
	public final native void DisableContinuousZoom()
	/*-{
		this.disableContinuousZoom();
	}-*/;

	/**
	 * 启用双指操作缩放，默认启用。(自 1.1 新增)
	 */
	public final native void EnablePinchToZoom()
	/*-{
		this.enablePinchToZoom();
	}-*/;

	/**
	 * 禁用双指操作缩放。(自 1.1 新增)
	 */
	public final native void DisablePinchToZoom()
	/*-{
		this.disablePinchToZoom();
	}-*/;

	/**
	 * 启用自动适应容器尺寸变化，默认启用。(自 1.2 新增)
	 */
	public final native void EnableAutoResize()
	/*-{
		this.enableAutoResize();
	}-*/;

	/**
	 * 禁用自动适应容器尺寸变化。(自 1.2 新增)
	 */
	public final native void DisableAutoResize()
	/*-{
		this.disableAutoResize();
	}-*/;

	/**
	 * 设置地图默认的鼠标指针样式。参数cursor应符合CSS的cursor属性规范。(自 1.1 新增)
	 * 
	 * @param cursor
	 *            鼠标指针样式
	 */
	public final native void setDefaultCursor(String cursor)
	/*-{
		this.setDefaultCursor(cursor);
	}-*/;

	/**
	 * 返回地图默认的鼠标指针样式。(自 1.1 新增)
	 */
	public final native String getDefaultCursor()
	/*-{
		return this.getDefaultCursor();
	}-*/;

	/**
	 * 设置拖拽地图时的鼠标指针样式。参数cursor应符合CSS的cursor属性规范。(自 1.1 新增)
	 * 
	 * @param cursor
	 *            鼠标指针样式
	 */
	public final native void setDraggingCursor(String cursor)
	/*-{
		this.setDraggingCursor(cursor);
	}-*/;

	/**
	 * 返回拖拽地图时的鼠标指针样式。(自 1.1 新增)
	 */
	public final native String getDraggingCursor()
	/*-{
		return this.getDraggingCursor();
	}-*/;

	/**
	 * 设置地图允许的最小级别。取值不得小于地图类型所允许的最小级别。(自 1.2 新增)
	 * 
	 * @param zoom
	 *            级别
	 */
	public final native void setMinZoom(double zoom)
	/*-{
		this.setMinZoom(zoom);
	}-*/;

	/**
	 * 设置地图允许的最大级别。取值不得大于地图类型所允许的最大级别。(自 1.2 新增)
	 * 
	 * @param zoom
	 *            级别
	 */
	public final native void setMaxZoom(double zoom)
	/*-{
		this.setMaxZoom(zoom);
	}-*/;

	/**
	 * 地图状态方法
	 */
	/**
	 * 返回地图可视区域，以地理坐标表示。
	 * 
	 * @return 地图可视区域
	 */
	public final native Bounds getBounds()
	/*-{
		return this.getBounds();
	}-*/;

	/**
	 * 返回地图当前中心点。
	 * 
	 * @return 中心点
	 */
	public final native Point getCenter()
	/*-{
		return this.getCenter();
	}-*/;

	/**
	 * 返回两点之间的距离，单位是米。(自 1.1 新增)
	 * 
	 * @param start
	 * @param end
	 * @return 距离，单位是米
	 */
	public final native double getDistance(Point start, Point end)
	/*-{
		return this.getDistance(start,end);
	}-*/;

	/**
	 * 返回地图类型。(自 1.1 新增)
	 * 
	 * @return
	 */
	public final native MapType getMapType()
	/*-{
		return this.getMapType(zoom);
	}-*/;

	/**
	 * 返回地图视图的大小，以像素表示。
	 * 
	 * @return 大小，以像素表示
	 */
	public final native Size getSize()
	/*-{
		return this.getSize();
	}-*/;

	/**
	 * 根据提供的地理区域或坐标获得最佳的地图视野，返回的对象中包含center和zoom属性，分别表示地图的中心点和级别。此方法仅返回视野信息，
	 * 不会将新的中心点和级别做用到当前地图上。(自 1.1 新增)
	 * 
	 * @param points
	 * @return
	 */
	public final native Viewport getViewport(Array<Point> points)
	/*-{
		return this.getViewport(points);
	}-*/;

	/**
	 * 根据提供的地理区域或坐标获得最佳的地图视野，返回的对象中包含center和zoom属性，分别表示地图的中心点和级别。此方法仅返回视野信息，
	 * 不会将新的中心点和级别做用到当前地图上。(自 1.1 新增)
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
	 * 返回地图当前缩放级别。
	 * 
	 * @return
	 */
	public final native double getZoom()
	/*-{
		return this.getZoom();
	}-*/;

	/**
	 * 修改地图状态方法
	 **/
	/**
	 * 设初始化地图。
	 * 如果center类型为Point时，zoom必须赋值，范围3-19级，若调用高清底图（针对移动端开发）时，zoom可赋值范围为3-18
	 * 级。如果center类型为字符串时，比如“北京”，zoom可以忽略，地图将自动根据center适配最佳zoom级别。
	 */
	public final native void CenterAndZoom(Point center, double zoom)
	/*-{
		this.centerAndZoom(center,zoom);
	}-*/;

	/**
	 * 修改地图状态方法
	 **/
	/**
	 * 设初始化地图。
	 * 如果center类型为Point时，zoom必须赋值，范围3-19级，若调用高清底图（针对移动端开发）时，zoom可赋值范围为3-18
	 * 级。如果center类型为字符串时，比如“北京”，zoom可以忽略，地图将自动根据center适配最佳zoom级别。
	 */
	public final native void CenterAndZoom(String center, double zoom)
	/*-{
		this.centerAndZoom(center,zoom);
	}-*/;

	/**
	 * 修改地图状态方法
	 **/
	/**
	 * 设初始化地图。
	 * 如果center类型为Point时，zoom必须赋值，范围3-19级，若调用高清底图（针对移动端开发）时，zoom可赋值范围为3-18
	 * 级。如果center类型为字符串时，比如“北京”，zoom可以忽略，地图将自动根据center适配最佳zoom级别。
	 */
	public final native void CenterAndZoom(String center)
	/*-{
		this.centerAndZoom(center);
	}-*/;

	/**
	 * 将地图的中心点更改为给定的点。如果该点在当前的地图视图中已经可见，则会以平滑动画的方式移动到中心点位置。可以通过配置强制移动过程不使用动画效果。
	 * 
	 * @param center
	 */
	public final native void PanTo(Point center)
	/*-{
		this.panTo(center);
	}-*/;

	/**
	 * 将地图的中心点更改为给定的点。如果该点在当前的地图视图中已经可见，则会以平滑动画的方式移动到中心点位置。可以通过配置强制移动过程不使用动画效果。
	 * 
	 * @param center
	 * @param opts
	 */
	public final native void PanTo(Point center, PanOptions opts)
	/*-{
		this.panTo(center,opts);
	}-*/;

	/**
	 * 将地图在水平位置上移动x像素，垂直位置上移动y像素。如果指定的像素大于可视区域范围或者在配置中指定没有动画效果，则不执行滑动效果。
	 * 
	 * @param x
	 * @param y
	 * @param opts
	 */
	public final native void PanBy(double x, double y, PanOptions opts)
	/*-{
		this.panBy(center,zoom);
	}-*/;

	/**
	 * 重新设置地图，恢复地图初始化时的中心点和级别。
	 */
	public final native void Reset()
	/*-{
		this.reset();
	}-*/;

	/**
	 * 设置地图中心点。center除了可以为坐标点以外，还支持城市名。注：使用城市名进行设置时该方法是异步执行，使用坐标点设置时该方法不是异步执行。
	 * 
	 * @param center
	 */
	public final native void setCenter(Point center)
	/*-{
		this.setCenter(center);
	}-*/;

	/**
	 * 设置地图城市，注意当地图初始化时的类型设置为BMAP_PERSPECTIVE_MAP时，
	 * 需要在调用centerAndZoom之前调用此方法设置地图所在城市。例如： var map = new BMap.Map(“container”,
	 * {mapType: BMAP_PERSPECTIVE_MAP}); map.setCurrentCity(“北京市”);
	 * map.centerAndZoom(new BMap.Point(116.404, 39.915), 18);
	 * 注意：初始化的坐标应与您设置的城市对应
	 * ，否则地图将无法正常显示。如果地图初始化为BMAP_NORMAL_MAP类型，则在调用setMapType切换地图类型时也要调用此方法。 (自
	 * 1.1 新增)
	 */
	public final native void setCurrentCity(String city)
	/*-{
		this.setCurrentCity(city);
	}-*/;

	/**
	 * 设置地图类型。注意，当设置地图类型为BMAP_PERSPECTIVE_MAP时，需要调用map.setCurrentCity方法设置城市。(自
	 * 1.1 新增)
	 */
	public final native void setMapType(MapType mapType)
	/*-{
		this.setMapType(mapType);
	}-*/;

	/**
	 * 根据提供的坐标点数组、地理区域或视野对象设置地图视野，调整后的视野会保证包含提供的坐标点或地理区域。(自 1.1 新增)
	 * 
	 * @param view
	 */
	public final native void setViewport(Array<Point> view)
	/*-{
		this.setViewport(view);
	}-*/;

	/**
	 * 根据提供的坐标点数组、地理区域或视野对象设置地图视野，调整后的视野会保证包含提供的坐标点或地理区域。(自 1.1 新增)
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
	 * 根据提供的坐标点数组、地理区域或视野对象设置地图视野，调整后的视野会保证包含提供的坐标点或地理区域。(自 1.1 新增)
	 * 
	 * @param view
	 */
	public final native void setViewport(Bounds view)
	/*-{
		this.setViewport(view);
	}-*/;

	/**
	 * 根据提供的坐标点数组、地理区域或视野对象设置地图视野，调整后的视野会保证包含提供的坐标点或地理区域。(自 1.1 新增)
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
	 * 根据提供的坐标点数组、地理区域或视野对象设置地图视野，调整后的视野会保证包含提供的坐标点或地理区域。(自 1.1 新增)
	 * 
	 * @param view
	 */
	public final native void setViewport(Viewport view)
	/*-{
		this.setViewport(view);
	}-*/;

	/**
	 * 根据提供的坐标点数组、地理区域或视野对象设置地图视野，调整后的视野会保证包含提供的坐标点或地理区域。(自 1.1 新增)
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
	 * 将视图切换到指定的缩放等级，中心点坐标不变。注意：当有信息窗口在地图上打开时，地图缩放将保证信息窗口所在的坐标位置不动。(自 1.2 废弃)
	 * 
	 * @param zoom
	 */
	public final native void ZoomTo(double zoom)
	/*-{
		this.zoomTo(zoom);
	}-*/;

	/**
	 * 将视图切换到指定的缩放等级，中心点坐标不变。注意：当有信息窗口在地图上打开时，地图缩放将保证信息窗口所在的坐标位置不动。(自 1.2 新增)
	 */
	public final native void setZoom(double zoom)
	/*-{
		this.setZoom(zoom);
	}-*/;

	/**
	 * 是否使用高分辨率底图。仅当mapOptions.enableHighResolution属性为true且设备支持高分辨率时返回true。
	 * 
	 * @return
	 */
	public final native boolean HighResolutionEnabled()
	/*-{
		this.highResolutionEnabled();
	}-*/;

	/**
	 * 放大一级视图。
	 */
	public final native void ZoomIn()
	/*-{
		this.zoomIn();
	}-*/;

	/**
	 * 缩小一级视图。
	 */
	public final native void ZoomOut()
	/*-{
		this.zoomOut();
	}-*/;

	/**
	 * 为地图添加热区。(自 1.2 新增)
	 * 
	 * @param hotspot
	 */
	public final native void AddHotspot(Hotspot hotspot)
	/*-{
		this.addHotspot(hotspot);
	}-*/;

	/**
	 * 移除某个地图热区。(自 1.2 新增)
	 * 
	 * @param hotspot
	 */
	public final native void RemoveHotspot(Hotspot hotspot)
	/*-{
		this.removeHotspot(hotspot);
	}-*/;

	/**
	 * 清空地图所有热区。(自 1.2 新增)
	 */
	public final native void ClearHotspots()
	/*-{
		this.clearHotspots();
	}-*/;

	/**
	 * 通知地图容器尺寸发生变化。默认情况下地图会自动检测容器尺寸是否发生变化并重新加载图块，
	 * 如果修改了MapOptions的enableAutoResize为false
	 * ，或者调用了Map的disableAutoResize()方法，那么需要调用此方法来通知地图。(自 1.2 新增)
	 */
	public final native void CheckResize()
	/*-{
		this.checkResize();
	}-*/;

	/**
	 * 控件方法
	 */
	/**
	 * 将控件添加到地图，一个控件实例只能向地图中添加一次。
	 * 
	 * @param control
	 */
	public final native void AddControl(Control control)
	/*-{
		this.addControl(control);
	}-*/;

	/**
	 * 从地图中移除控件。如果控件从未被添加到地图中，则该移除不起任何作用。
	 * 
	 * @param control
	 */
	public final native void RemoveControl(Control control)
	/*-{
		this.removeControl(control);
	}-*/;

	/**
	 * 返回地图的容器元素。当创建用户自定义控件时，需要自行实现Control.initialize()方法，并将控件的容器元素添加到地图上，
	 * 通过此方法可获得地图容器。
	 * 
	 * @return
	 */
	public final native DivElement getContainer()
	/*-{
		this.getContainer();
	}-*/;

	/**
	 * 右键菜单方法
	 */
	/**
	 * 添加右键菜单。
	 * 
	 * @param menu
	 */
	public final native void AddContextMenu(ContextMenu menu)
	/*-{
		this.addContextMenu(menu);
	}-*/;

	/**
	 * 移除右键菜单。
	 * 
	 * @param menu
	 */
	public final native void RemoveContextMenu(ContextMenu menu)
	/*-{
		this.removeContextMenu(menu);
	}-*/;

	/**
	 * 覆盖物方法
	 */
	/**
	 * 将覆盖物添加到地图中，一个覆盖物实例只能向地图中添加一次。
	 * 
	 * @param overlay
	 */
	public final native void AddOverlay(Overlay overlay)
	/*-{
		this.addOverlay(overlay);
	}-*/;

	/**
	 * 从地图中移除覆盖物。如果覆盖物从未被添加到地图中，则该移除不起任何作用。
	 * 
	 * @param overlay
	 */
	public final native void RemoveOverlay(Overlay overlay)
	/*-{
		this.removeOverlay(overlay);
	}-*/;

	/**
	 * 清除地图上所有覆盖物。
	 */
	public final native void ClearOverlays()
	/*-{
		this.clearOverlays();
	}-*/;

	/**
	 * 在地图上打开信息窗口。
	 * 
	 * @param infoWnd
	 * @param point
	 */
	public final native void OpenInfoWindow(InfoWindow infoWnd, Point point)
	/*-{
		this.openInfoWindow(infoWnd,point);
	}-*/;

	/**
	 * 关闭在地图上打开的信息窗口。在标注上打开的信息窗口也可通过此方法进行关闭。
	 */
	public final native void CloseInfoWindow()
	/*-{
		this.closeInfoWindow();
	}-*/;

	/**
	 * 根据地理坐标获取对应的覆盖物容器的坐标，此方法用于自定义覆盖物。(自 1.1 新增)
	 * 
	 * @param point
	 * @return
	 */
	public final native Pixel PointToOverlayPixel(Point point)
	/*-{
		return this.pointToOverlayPixel(point);
	}-*/;

	/**
	 * 根据覆盖物容器的坐标获取对应的地理坐标。(自 1.1 新增)
	 * 
	 * @param pixel
	 * @return
	 */
	public final native Point OverlayPixelToPoint(Pixel pixel)
	/*-{
		return this.overlayPixelToPoint(pixel);
	}-*/;

	/**
	 * 返回地图上处于打开状态的信息窗的实例。当地图没有打开的信息窗口时，此方法返回null。(自 1.1 新增)
	 * 
	 * @return
	 */
	public final native InfoWindow getInfoWindow()
	/*-{
		return this.getInfoWindow();
	}-*/;

	/**
	 * 返回地图上的所有覆盖物。(自 1.1 新增)
	 * 
	 * @return
	 */
	public final native Array<Overlay> getOverlays()
	/*-{
		return this.getOverlays();
	}-*/;

	/**
	 * 返回地图覆盖物容器列表。(自 1.1 新增)
	 * 
	 * @return
	 */
	public final native MapPanes getPanes()
	/*-{
		return this.getPanes();
	}-*/;

	/**
	 * 地图图层方法
	 */
	/**
	 * 添加一个自定义地图图层。
	 * 
	 * @param tileLayer
	 */
	public final native void AddTileLayer(TileLayer tileLayer)
	/*-{
		this.addTileLayer(tileLayer);
	}-*/;

	/**
	 * 移除一个自定义地图图层。
	 * 
	 * @param tilelayer
	 */
	public final native void RemoveTileLayer(TileLayer tilelayer)
	/*-{
		this.removeTileLayer(tilelayer);
	}-*/;

	/**
	 * 坐标变换
	 */
	/**
	 * 像素坐标转换为经纬度坐标。
	 * 
	 * @param pixel
	 */
	public final native Point PixelToPoint(Pixel pixel)
	/*-{
		return this.pixelToPoint(pixel);
	}-*/;

	/**
	 * 经纬度坐标转换为像素坐标。
	 * 
	 * @param point
	 */
	public final native Pixel PointToPixel(Point point)
	/*-{
		return this.pointToPixel(point);
	}-*/;

	/**
	 * 事件机制
	 */

	/**
	 * 在JS级别注册事件
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
	 * 触发单击事件
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
	 * 添加单击事件处理
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
	 * 触发双击事件
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
	 * 添加双击事件处理
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
	 * 触发右键单击
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
	 * 添加右键单击处理
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
	 * 触发右键双击
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
	 * 添加右键双击处理
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
	 * 触发地图类型更改
	 * 
	 * @param map
	 * @param args
	 */
	public static final void FireMapTypeChange(Map owner, TypeTargetEventArgs args) {
		CoreEvent.<TypeTargetEventArgs, Map> Fire(owner, "maptypechange", args);
	}

	/**
	 * 添加地图类型更改处理
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
	 * 触发鼠标移动事件
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
	 * 添加鼠标移动事件处理
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
