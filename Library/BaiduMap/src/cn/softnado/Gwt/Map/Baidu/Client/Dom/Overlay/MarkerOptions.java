package cn.softnado.Gwt.Map.Baidu.Client.Dom.Overlay;

import cn.softnado.Gwt.Map.Baidu.Client.Dom.Base.Size;

import com.google.gwt.core.client.JavaScriptObject;

public class MarkerOptions extends JavaScriptObject {
	protected MarkerOptions() {

	}

	public static native MarkerOptions CreateInstance(Size offsetValue,
			Icon iconValue, boolean enableMassClearValue,
			boolean enableDraggingValue, boolean raiseOnDragValue,
			String draggingCursorValue, Icon shadowValue, String titleValue)
	/*-{
		return {
			offset:offsetValue
			,icon:iconValue
			,enableMassClear:enableMassClearValue
			,enableDragging:enableDraggingValue
			,enableClicking:enableClickingValue
			,raiseOnDrag:raiseOnDragValue
			,draggingCursor:draggingCursorValue
			,shadow:shadowValue
			,title:titleValue
		};
	}-*/;

	public final native Size getOffset()
	/*-{
		return this.offset;
	}-*/;

	public final native void setOffset(Size offsetValue)
	/*-{
		this.offset = offsetValue;
	}-*/;

	public final native Icon getIcon()
	/*-{
		return this.icon;
	}-*/;

	public final native void setIcon(Icon iconValue)
	/*-{
		this.icon = iconValue;
	}-*/;

	public final native boolean getEnableMassClear()
	/*-{
		return this.enableMassClear;
	}-*/;

	public final native void setEnableMassClear(boolean enableMassClearValue)
	/*-{
		this.enableMassClear = enableMassClearValue;
	}-*/;

	public final native boolean getEnableDragging()
	/*-{
		return this.enableDragging;
	}-*/;

	public final native void setEnableDragging(boolean enableDraggingValue)
	/*-{
		this.enableDragging = enableDraggingValue;
	}-*/;

	public final native boolean getEnableClicking()
	/*-{
		return this.enableClicking;
	}-*/;

	public final native void setEnableClicking(boolean enableClickingValue)
	/*-{
		this.enableClicking = enableClickingValue;
	}-*/;

	public final native boolean getRaiseOnDrag()
	/*-{
		return this.raiseOnDrag;
	}-*/;

	public final native void setRaiseOnDrag(boolean raiseOnDragValue)
	/*-{
		this.raiseOnDrag = raiseOnDragValue;
	}-*/;

	public final native String getDraggingCursor()
	/*-{
		return this.draggingCursor;
	}-*/;

	public final native void setDraggingCursor(String draggingCursorValue)
	/*-{
		this.draggingCursor = draggingCursorValue;
	}-*/;

	public final native Icon getShadow()
	/*-{
		return this.shadow;
	}-*/;

	public final native void setShadow(Icon shadowValue)
	/*-{
		this.shadow = shadowValue;
	}-*/;

	public final native String getTitle()
	/*-{
		return this.title;
	}-*/;

	public final native void setTitle(String titleValue)
	/*-{
		this.title = titleValue;
	}-*/;
}
