package cn.softnado.Gwt.Map.Baidu.Client;

import com.google.gwt.event.shared.HandlerRegistration;
import com.google.gwt.event.shared.HasHandlers;

public interface HasInitedHandlers extends HasHandlers {
	HandlerRegistration addInitedHandler(InitedHandler handler);
}
