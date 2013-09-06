package cn.softnado.Gwt.Map.Baidu.Client.Dom;

import cn.softnado.Gwt.Map.Baidu.Client.Dom.Service.AutocompleteItem;

public class TypeTargetItemEventArgs extends TypeTargetEventArgs {
	protected TypeTargetItemEventArgs() {

	}

	public final native AutocompleteItem getItem()
	/*-{
		return this.item;
	}-*/;
}
