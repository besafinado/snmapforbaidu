package cn.softnado.Gwt.Map.Baidu.Client;

import cn.softnado.Gwt.Map.Baidu.Client.Dom.Core.Map;

import com.google.gwt.event.shared.GwtEvent;
import com.google.gwt.event.shared.HasHandlers;

public class InitedEvent extends GwtEvent<InitedHandler> {

	public static <S extends HasInitedHandlers & HasHandlers> void fire(
			S source, BaiduMap mapWidget) {
		if (TYPE != null) {
			InitedEvent event = new InitedEvent(mapWidget);
			event.setSource(source);
			source.fireEvent(event);
		}
	}

	public static Type<InitedHandler> getType() {
		if (TYPE == null) {
			TYPE = new Type<InitedHandler>();
		}
		return TYPE;
	}

	protected InitedEvent(BaiduMap mapWidget) {
		this.MapWidgetStub = mapWidget;
		this.MapStub = this.MapWidgetStub.MapStub;
	}

	private static Type<InitedHandler> TYPE;

	private final BaiduMap MapWidgetStub;

	public BaiduMap getBaiduMapStub() {
		return this.MapWidgetStub;
	}

	private final Map MapStub;

	public Map getMapStub() {
		return this.MapStub;
	}

	@Override
	public Type<InitedHandler> getAssociatedType() {
		return TYPE;
	}

	@Override
	protected void dispatch(InitedHandler handler) {
		handler.onInited(this);
	}

	@Override
	public String toDebugString() {
		assertLive();
		return super.toDebugString() + " BaiduMap ID = "
				+ this.MapWidgetStub.getElement().getId();
	}

}
