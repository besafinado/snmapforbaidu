package cn.softnado.Gwt.Map.Baidu.Client.Dom;

import cn.softnado.Gwt.Map.Baidu.Client.Dom.Base.Point;

public class TypeTargetPointEventArgs extends TypeTargetEventArgs {
	protected TypeTargetPointEventArgs() {

	}
	public final native Point getPoint()
	/*-{
		return this.point;
	}-*/;
}
