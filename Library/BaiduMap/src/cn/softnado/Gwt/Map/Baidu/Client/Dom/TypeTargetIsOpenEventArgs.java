package cn.softnado.Gwt.Map.Baidu.Client.Dom;

public class TypeTargetIsOpenEventArgs extends TypeTargetEventArgs {
	protected TypeTargetIsOpenEventArgs() {

	}

	public final native boolean IsOpen()
	/*-{
		return this.isOpen;
	}-*/;
}
