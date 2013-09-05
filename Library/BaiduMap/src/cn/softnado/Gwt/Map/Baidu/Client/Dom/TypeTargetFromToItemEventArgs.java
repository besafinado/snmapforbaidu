package cn.softnado.Gwt.Map.Baidu.Client.Dom;

import cn.softnado.Gwt.Map.Baidu.Client.Dom.Service.AutocompleteItem;

public class TypeTargetFromToItemEventArgs extends TypeTargetEventArgs {
	protected TypeTargetFromToItemEventArgs() {

	}

	public final native AutocompleteItem getFromItem()
	/*-{
		return this.fromitem;
	}-*/;

	public final native AutocompleteItem getToItem()
	/*-{
		return this.toitem;
	}-*/;
}
