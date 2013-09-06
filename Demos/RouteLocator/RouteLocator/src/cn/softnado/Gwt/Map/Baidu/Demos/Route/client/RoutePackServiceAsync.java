package cn.softnado.Gwt.Map.Baidu.Demos.Route.client;

import java.util.ArrayList;

import cn.softnado.Gwt.Map.Baidu.Demos.Route.shared.RoutePack;
import cn.softnado.Gwt.Map.Baidu.Demos.Route.shared.RoutePath;

import com.google.gwt.user.client.rpc.AsyncCallback;

public interface RoutePackServiceAsync {

	void ClacPath(RoutePack pack, AsyncCallback<ArrayList<RoutePath>> callback);

}
