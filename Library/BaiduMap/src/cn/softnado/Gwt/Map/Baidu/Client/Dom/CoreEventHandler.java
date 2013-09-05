package cn.softnado.Gwt.Map.Baidu.Client.Dom;

import com.google.gwt.event.shared.EventHandler;

public interface CoreEventHandler<E extends CoreEventArgs> extends EventHandler {
	void onFire(CoreEvent<E> event);
}
