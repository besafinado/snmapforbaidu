package cn.softnado.Gwt.Map.Baidu.Client.Dom;

import java.util.HashMap;
import java.util.Map;

import com.google.gwt.event.shared.GwtEvent;
import com.google.gwt.event.shared.HasHandlers;

public class CoreEvent<E extends CoreEventArgs> extends
		GwtEvent<CoreEventHandler<E>> {
	private static final Map<String, Type<?>> TYPES = new HashMap<String, Type<?>>();

	private E EventArgsStub;

	public E getEventArgs() {
		return this.EventArgsStub;
	}

	private String EventNameStub;

	public String getEventName() {
		return this.EventNameStub;
	}

	private String SourceNameStub;

	public String getSourceName() {
		return this.SourceNameStub;
	}

	public static <E extends CoreEventArgs, S extends HasHandlers> void Fire(
			S source, String eventName, E eventArgs) {
		CoreEvent<E> event = new CoreEvent<E>(eventArgs, eventName, source
				.getClass().getName());
		event.setSource(source);
		source.fireEvent(event);
	}

	protected CoreEvent(E eventArgs, String eventName, String sourceName) {
		this.EventArgsStub = eventArgs;
		this.EventNameStub = eventName;
		this.SourceNameStub = sourceName;
	}

	@SuppressWarnings("unchecked")
	@Override
	public Type<CoreEventHandler<E>> getAssociatedType() {
		String eventKey = this.SourceNameStub.toUpperCase() + ":"
				+ this.EventNameStub.toUpperCase();
		if (!CoreEvent.TYPES.containsKey(eventKey)) {
			return null;
		}
		return (com.google.gwt.event.shared.GwtEvent.Type<CoreEventHandler<E>>) CoreEvent.TYPES
				.get(eventKey);
	}

	@SuppressWarnings("unchecked")
	public static <E extends CoreEventArgs, S extends HasHandlers> Type<CoreEventHandler<E>> GetType(
			S source, String eventName) {
		String eventKey = source.getClass().getName().toUpperCase() + ":"
				+ eventName.toUpperCase();
		if (!CoreEvent.TYPES.containsKey(eventKey)) {
			CoreEvent.TYPES
					.put(eventKey,
							(com.google.gwt.event.shared.GwtEvent.Type<CoreEventHandler<E>>) new Type<CoreEventHandler<E>>());
		}
		return (com.google.gwt.event.shared.GwtEvent.Type<CoreEventHandler<E>>) CoreEvent.TYPES
				.get(eventKey);
	}

	@Override
	protected void dispatch(CoreEventHandler<E> handler) {
		handler.onFire(this);
	}

	@Override
	public String toDebugString() {
		assertLive();
		return super.toDebugString() + this.SourceNameStub.toUpperCase() + ":"
				+ this.EventNameStub.toUpperCase() + ":"
				+ this.getEventArgs().toString() + " fired";
	}
}
