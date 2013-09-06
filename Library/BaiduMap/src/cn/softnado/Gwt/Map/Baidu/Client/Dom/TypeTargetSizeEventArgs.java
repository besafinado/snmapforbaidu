package cn.softnado.Gwt.Map.Baidu.Client.Dom;

import cn.softnado.Gwt.Map.Baidu.Client.Dom.Base.Size;

public class TypeTargetSizeEventArgs extends TypeTargetEventArgs {
	protected TypeTargetSizeEventArgs() {

	}

	public final native Size getSize()
	/*-{
		return this.size;
	}-*/;
}
