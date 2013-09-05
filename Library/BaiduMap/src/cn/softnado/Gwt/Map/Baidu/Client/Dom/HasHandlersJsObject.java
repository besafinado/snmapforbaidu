package cn.softnado.Gwt.Map.Baidu.Client.Dom;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.event.shared.EventBus;
import com.google.gwt.event.shared.EventHandler;
import com.google.gwt.event.shared.GwtEvent;
import com.google.gwt.event.shared.HandlerRegistration;
import com.google.gwt.event.shared.HasHandlers;

public abstract class HasHandlersJsObject extends JavaScriptObject implements
		HasHandlers {

	protected HasHandlersJsObject() {

	}

	public final native EventBus getEventBus()
	/*-{
		if(this.BMapEventBus == null) {
			this.BMapEventBus = @com.google.gwt.event.shared.SimpleEventBus::new()();
		}
		return this.BMapEventBus;
	}-*/;

	public final void fireEvent(GwtEvent<?> event) {
		this.getEventBus().fireEvent(event);
	}

	public final <H extends EventHandler> HandlerRegistration addHandler(
			GwtEvent.Type<H> type, final H handler) {
		return this.getEventBus().addHandler(type, handler);
	}

	public final native void setTag(Object tag)
	/*-{
		this.BMapCustomTag = tag;
	}-*/;

	public final native Object getTag()
	/*-{
	 	if(this.BMapCustomTag ==null) {
	 		return null;
	 	}
		return this.BMapCustomTag;
	}-*/;
}
