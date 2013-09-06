package cn.softnado.Gwt.Map.Baidu.Demos.Route.client;

import java.util.ArrayList;

import cn.softnado.Gwt.Map.Baidu.Client.BaiduMap;
import cn.softnado.Gwt.Map.Baidu.Client.InitedEvent;
import cn.softnado.Gwt.Map.Baidu.Client.InitedHandler;
import cn.softnado.Gwt.Map.Baidu.Client.InvalidKeyException;
import cn.softnado.Gwt.Map.Baidu.Client.Dom.Array;
import cn.softnado.Gwt.Map.Baidu.Client.Dom.CoreEvent;
import cn.softnado.Gwt.Map.Baidu.Client.Dom.CoreEventHandler;
import cn.softnado.Gwt.Map.Baidu.Client.Dom.OneParamCallback;
import cn.softnado.Gwt.Map.Baidu.Client.Dom.TypeTargetPointPixelEventArgs;
import cn.softnado.Gwt.Map.Baidu.Client.Dom.Base.Point;
import cn.softnado.Gwt.Map.Baidu.Client.Dom.Base.Size;
import cn.softnado.Gwt.Map.Baidu.Client.Dom.Core.Map;
import cn.softnado.Gwt.Map.Baidu.Client.Dom.Menu.ContextMenu;
import cn.softnado.Gwt.Map.Baidu.Client.Dom.Menu.MenuItem;
import cn.softnado.Gwt.Map.Baidu.Client.Dom.Overlay.Icon;
import cn.softnado.Gwt.Map.Baidu.Client.Dom.Overlay.InfoWindow;
import cn.softnado.Gwt.Map.Baidu.Client.Dom.Overlay.InfoWindowOptions;
import cn.softnado.Gwt.Map.Baidu.Client.Dom.Overlay.Label;
import cn.softnado.Gwt.Map.Baidu.Client.Dom.Overlay.LabelOptions;
import cn.softnado.Gwt.Map.Baidu.Client.Dom.Overlay.Marker;
import cn.softnado.Gwt.Map.Baidu.Client.Dom.Overlay.Polyline;
import cn.softnado.Gwt.Map.Baidu.Client.Dom.Overlay.PolylineOptions;
import cn.softnado.Gwt.Map.Baidu.Client.Dom.Service.DrivingRoute;
import cn.softnado.Gwt.Map.Baidu.Client.Dom.Service.DrivingRouteResult;
import cn.softnado.Gwt.Map.Baidu.Client.Dom.Service.Geocoder;
import cn.softnado.Gwt.Map.Baidu.Client.Dom.Service.GeocoderResult;
import cn.softnado.Gwt.Map.Baidu.Client.Dom.Service.Route;
import cn.softnado.Gwt.Map.Baidu.Client.Dom.Service.RoutePlan;
import cn.softnado.Gwt.Map.Baidu.Demos.Route.shared.RoutePack;
import cn.softnado.Gwt.Map.Baidu.Demos.Route.shared.RoutePath;
import cn.softnado.Gwt.Map.Baidu.Demos.Route.shared.RoutePoint;
import cn.softnado.Gwt.Map.Resources.GlobalResources;
import cn.softnado.Gwt.Map.Resources.Marker.MarkerResources;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;
import com.google.gwt.event.logical.shared.ResizeEvent;
import com.google.gwt.event.logical.shared.ResizeHandler;
import com.google.gwt.user.client.Timer;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.RootPanel;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class RouteLocator implements EntryPoint {
	final BaiduMap _BaiduMap = new BaiduMap();
	final ArrayList<RouteSearchNode> _SearchList = new ArrayList<RouteSearchNode>();
	private final MarkerResources markerResources = GWT
			.create(MarkerResources.class);
	private final GlobalResources globalResources = GWT
			.create(GlobalResources.class);
	protected Size markerOffset = null;
	protected Size labelOffset = null;
	protected Size infoOffset = null;
	protected Icon startMarkerIcon = null;
	protected Icon targetMarkerIcon = null;
	protected Icon blankShadow = null;
	protected RoutePack _RoutePack = null;
	protected int _RouteCount = 0;
	protected Array<Point> _LocationArray = Array.CreateInstance();
	protected Marker _ClickMarker = null;
	protected DrivingRoute _DrivingRoute = null;
	protected InfoWindow _InfoWindow = null;
	protected boolean _IsFresh = true;
	final OneParamCallback<GeocoderResult> _GeocoderGetLocationCallback = new OneParamCallback<GeocoderResult>() {

		@Override
		public void onCallback(GeocoderResult args) {
			_ClickMarker = Marker.CreateInstance(args.getPoint());
			_ClickMarker.RegistOriginEvents();
			_ClickMarker.setLabel(Label.CreateInstance(args.getAdderss(),
					LabelOptions.CreateInstance(labelOffset, args.getPoint(),
							true)));
			_LocationArray.push(args.getPoint());
			if (_LocationArray.length() > 0) {
				_MenuItemClean.Enable();
			}
			if (_LocationArray.length() > 1) {
				_MenuItemGetRoutes.Enable();
			}
			_ClickMarker.setShadow(blankShadow);
			if (_LocationArray.length() == 1) {
				_ClickMarker.setIcon(startMarkerIcon);
			} else {
				_ClickMarker.setIcon(targetMarkerIcon);
			}
			_BaiduMap.getMap().AddOverlay(_ClickMarker);
		}

	};
	final OneParamCallback<DrivingRouteResult> _DrivingRouteSearchCompleteCallback = new OneParamCallback<DrivingRouteResult>() {

		@Override
		public void onCallback(DrivingRouteResult args) {
			if (args.getNumPlans() > 0) {
				RoutePlan plan = args.getPlan(0);
				if (plan.getNumRoutes() > 0) {
					Route route = plan.getRoute(0);
					Array<Point> path = Array.FixArrayIssue(route.getPath());
					_BaiduMap.getMap().AddOverlay(
							Polyline.CreateInstance(path, PolylineOptions
									.CreateInstance("green", 2, 0.2, null,
											true, false, false)));
					if (_RoutePack != null) {
						RoutePath temp = new RoutePath();
						temp.setDistance(route.getDistanceAsDouble());
						temp.setStart(RouteUtil.PointToRoutePoint(args
								.getStart().getPoint()));
						temp.setEnd(RouteUtil.PointToRoutePoint(args.getEnd()
								.getPoint()));
						for (int index = 0; index < path.length(); index++) {
							temp.getPath()
									.add(RouteUtil.PointToRoutePoint(path
											.get(index)));
						}
						_RoutePack.getRoutes().add(temp);
					}
					_InfoWindow.setContent(_InfoWindow.getContentAsString()
							+ "Success!");
					_BaiduMap.getMap().OpenInfoWindow(_InfoWindow,
							_LocationArray.get(0));

					if (_RoutePack != null && _LocationArray.length() > 1) {
						if (_RoutePack.getRoutes().size() == _RouteCount) {
							_MenuItemCalc.Enable();
							_MenuItemGetRoutes.Disable();
							_InfoWindow.setContent(_InfoWindow
									.getContentAsString()
									+ "</br> All routes completed");
							_BaiduMap.getMap().OpenInfoWindow(_InfoWindow,
									_LocationArray.get(0));
						}
					}

					return;

				}
			}
			_InfoWindow
					.setContent(_InfoWindow.getContentAsString() + "Failed!");
			_BaiduMap.getMap().OpenInfoWindow(_InfoWindow,
					_LocationArray.get(0));
		}

	};
	final CoreEventHandler<TypeTargetPointPixelEventArgs> _MapDoubleClickHandler = new CoreEventHandler<TypeTargetPointPixelEventArgs>() {

		@Override
		public void onFire(CoreEvent<TypeTargetPointPixelEventArgs> event) {
			if (_IsFresh) {
				if (_LocationArray.length() < 12) {
					TypeTargetPointPixelEventArgs args = event.getEventArgs();
					Geocoder geo = Geocoder.CreateInstance();
					geo.getLocation(args.getPoint(),
							_GeocoderGetLocationCallback);
				} else {
					Window.alert("Only 12 points supported");
				}
			}
		}

	};
	protected ContextMenu _ContextMenu;
	protected Timer _SearchRouteTimer = new Timer() {

		@Override
		public void run() {
			if (_SearchList.size() > 0) {
				RouteSearchNode node = _SearchList.remove(0);
				_SearchList.trimToSize();
				_DrivingRoute.Search(node.Start, node.End);

			}
			if (_SearchList.size() == 0) {
				this.cancel();
			}
		}

	};
	protected MenuItem _MenuItemGetRoutes;
	protected OneParamCallback<Point> _MenuItemGetRoutesClickCallback = new OneParamCallback<Point>() {

		@Override
		public void onCallback(Point args) {
			if (_LocationArray.length() > 2) {
				_IsFresh = false;
				_MenuItemGetRoutes.Disable();
				for (int index = 0; index < _LocationArray.length(); index++) {
					_RoutePack.getMarkers().add(
							RouteUtil.PointToRoutePoint(_LocationArray
									.get(index)));
				}
				_RouteCount = 0;
				for (int index = 0; index < _LocationArray.length(); index++) {
					for (int index2 = 0; index2 < _LocationArray.length(); index2++) {
						if (index2 != index) {
							_RouteCount++;
							_SearchList.add(new RouteSearchNode(_LocationArray
									.get(index), _LocationArray.get(index2)));
						}
					}
				}
				_InfoWindow.setTitle("Searching " + _RouteCount
						+ " possible routes");
				_InfoWindow.setContent("");
				_BaiduMap.getMap().OpenInfoWindow(_InfoWindow,
						_LocationArray.get(0));
				_SearchRouteTimer.scheduleRepeating(500);

			}
		}

	};
	protected MenuItem _MenuItemClean;
	protected OneParamCallback<Point> _MenuItemCleanLocationsClickCallback = new OneParamCallback<Point>() {

		@Override
		public void onCallback(Point args) {
			_BaiduMap.getMap().ClearOverlays();
			_LocationArray = Array.CreateInstance();
			_RoutePack = new RoutePack();
			_RouteCount = 0;
			_MenuItemCalc.Disable();
			_MenuItemClean.Disable();
			_MenuItemGetRoutes.Disable();
			_BaiduMap.getMap().CloseInfoWindow();
			_IsFresh = true;
		}

	};
	protected MenuItem _MenuItemCalc;
	protected AsyncCallback<ArrayList<RoutePath>> _CalcRouteCallback = new AsyncCallback<ArrayList<RoutePath>>() {

		@Override
		public void onFailure(Throwable caught) {
			_MenuItemCalc.Enable();
			Window.alert("Calc routes failed");
		}

		@Override
		public void onSuccess(ArrayList<RoutePath> result) {
			if (result != null && !result.isEmpty()) {
				_MenuItemCalc.Disable();
				for (int index = 0; index < result.size(); index++) {
					RoutePath routePath = result.get(index);
					ArrayList<RoutePoint> routePoints = routePath.getPath();
					Array<Point> path = Array.CreateInstance();
					for (int index1 = 0; index1 < routePoints.size(); index1++) {
						path.push(Point.CreateInstance(routePoints.get(index1)
								.getLng(), routePoints.get(index1).getLat()));
					}
					_BaiduMap.getMap().AddOverlay(
							Polyline.CreateInstance(path, PolylineOptions
									.CreateInstance("red", (index + 1), 0.5,
											null, true, false, false)));
				}
			} else {
				Window.alert("Calc routes failed or return nothing, please implement cn.softnado.Gwt.Map.Baidu.Demos.Route.server.RoutePackServiceImpl.ClacPath.");
			}
		}

	};
	protected OneParamCallback<Point> _MenuItemCalcClickCallback = new OneParamCallback<Point>() {

		@Override
		public void onCallback(Point args) {
			_IsFresh = false;
			_MenuItemCalc.Disable();
			RoutePackService.Util.getInstance().ClacPath(_RoutePack,
					_CalcRouteCallback);
		}

	};
	final InitedHandler _MapInitedHandler = new InitedHandler() {

		@Override
		public void onInited(InitedEvent event) {
			Map map = event.getBaiduMapStub().getMap();
			map.CenterAndZoom("涓婃捣");
			map.EnableAutoResize();
			map.EnableScrollWheelZoom();
			map.DisableDoubleClickZoom();
			map.addDoubleClickHandler(_MapDoubleClickHandler);

			_MenuItemGetRoutes = MenuItem.CreateInstance("Get Routes",
					_MenuItemGetRoutesClickCallback);

			_MenuItemClean = MenuItem.CreateInstance("Clean Locations",
					_MenuItemCleanLocationsClickCallback);

			_MenuItemCalc = MenuItem.CreateInstance("Calc Routes",
					_MenuItemCalcClickCallback);
			_MenuItemCalc.Disable();

			_ContextMenu = ContextMenu.CreateInstance();
			_ContextMenu.AddItem(_MenuItemGetRoutes);
			_ContextMenu.AddItem(_MenuItemClean);
			_ContextMenu.AddItem(_MenuItemCalc);
			map.AddContextMenu(_ContextMenu);

			_DrivingRoute = DrivingRoute.CreateInstance(_BaiduMap.getMap());
			_DrivingRoute
					.setSearchCompleteCallback(_DrivingRouteSearchCompleteCallback);

			_MenuItemCleanLocationsClickCallback.onCallback(map.getCenter());

			markerOffset = Size.CreateInstance(15, 30);

			labelOffset = Size.CreateInstance(30, -5);

			infoOffset = Size.CreateInstance(5, -30);

			targetMarkerIcon = Icon.CreateInstance(markerResources
					.BallRightAzure().getSafeUri().asString(),
					Size.CreateInstance(40, 40));
			targetMarkerIcon.setAnchor(markerOffset);
			startMarkerIcon = Icon.CreateInstance(markerResources
					.BallRightPink().getSafeUri().asString(),
					Size.CreateInstance(40, 40));
			startMarkerIcon.setAnchor(markerOffset);
			blankShadow = Icon.CreateInstance(globalResources.Blank()
					.getSafeUri().asString(), Size.CreateInstance(40, 40));

			_InfoWindow = InfoWindow.CreateInstance("Processing... ...",
					InfoWindowOptions.CreateInstance(0, 0, 0, infoOffset, null,
							true, false));
			_InfoWindow.DisableMaximize();
			map.AddOverlay(_InfoWindow);

		}

	};
	final ResizeHandler _WindowResizeHandler = new ResizeHandler() {

		@Override
		public void onResize(ResizeEvent event) {
			_BaiduMap.setPixelSize(event.getWidth(), event.getHeight());
		}

	};

	public void onModuleLoad() {
		try {
			BaiduMap.ImportLibrary("Replace it with your own Baidu Key");
		} catch (InvalidKeyException e) {
			e.printStackTrace();
		}
		this._BaiduMap.addInitedHandler(_MapInitedHandler);
		this._BaiduMap.setPixelSize(Window.getClientWidth(),
				Window.getClientHeight());
		RootPanel.get().add(_BaiduMap);
		Window.addResizeHandler(_WindowResizeHandler);
	}
}
