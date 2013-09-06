package cn.softnado.Gwt.Map.Baidu.Client.Dom;

import cn.softnado.Gwt.Map.Baidu.Client.Dom.Control.StatusCode;

public class StatusCodeEventArgs extends CoreEventArgs {
	protected StatusCodeEventArgs() {

	}

	public final native StatusCode getStatusCode()
	/*-{
		return this.StatusCode;
	}-*/;

}
