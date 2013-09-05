package cn.softnado.Gwt.Map.Baidu.Client.Dom;

import cn.softnado.Gwt.Map.Baidu.Client.Dom.Layer.Custompoi;

public class TypeTargetCustompoiEventArgs extends TypeTargetEventArgs {
	protected TypeTargetCustompoiEventArgs() {

	}

	public final native Custompoi getCustompoi()
	/*-{
		return this.custompoi;
	}-*/;

}
