package cn.softnado.Gwt.Map.Baidu.Server;

import java.io.Serializable;

public enum TranslateType implements Serializable {
	GOOGLE_TO_BAIDU(2), GPS_TO_BAIDU(0);
	private int ValueStub;

	private TranslateType(int value) {
		this.ValueStub = value;
	}

	public int getValue() {
		return this.ValueStub;
	}
}
