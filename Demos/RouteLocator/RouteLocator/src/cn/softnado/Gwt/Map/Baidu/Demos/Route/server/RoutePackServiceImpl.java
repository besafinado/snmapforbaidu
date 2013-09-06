package cn.softnado.Gwt.Map.Baidu.Demos.Route.server;

import java.util.ArrayList;

import cn.softnado.Gwt.Map.Baidu.Demos.Route.client.RoutePackService;
import cn.softnado.Gwt.Map.Baidu.Demos.Route.shared.RoutePack;
import cn.softnado.Gwt.Map.Baidu.Demos.Route.shared.RoutePath;

import com.google.gwt.user.server.rpc.RemoteServiceServlet;

public class RoutePackServiceImpl extends RemoteServiceServlet implements
		RoutePackService {

	private static final long serialVersionUID = 1L;

	@Override
	public ArrayList<RoutePath> ClacPath(RoutePack pack) {
		ArrayList<RoutePath> result = new ArrayList<RoutePath>();
		// Add your logic to calc short route paths.
		return result;
	}
}
