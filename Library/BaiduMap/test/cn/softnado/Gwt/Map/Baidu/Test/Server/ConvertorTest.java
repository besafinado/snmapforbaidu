package cn.softnado.Gwt.Map.Baidu.Test.Server;

import static org.junit.Assert.*;

import org.junit.Test;

import cn.softnado.Gwt.Map.Baidu.Server.Convertor;
import cn.softnado.Gwt.Map.Baidu.Server.TranslateType;
import cn.softnado.Gwt.Map.Baidu.Shared.Dom.Base.IPoint;
import cn.softnado.Gwt.Map.Baidu.Test.Server.TestPoint;

public class ConvertorTest {

	@Test
	public void testTranslate() {
		assertTrue(Convertor.Translate(new TestPoint(116.397428d, 39.90923),
				TranslateType.GPS_TO_BAIDU) != null);
	}

	@Test
	public void testMultipleTranslate() {
		IPoint[] result = Convertor.Translate(TranslateType.GPS_TO_BAIDU,
				new TestPoint(116.397428d, 39.90923), new TestPoint(
						116.397428d, 39.90925), new TestPoint(116.397428d,
						39.90923), new TestPoint(116.397428d, 39.90925),
				new TestPoint(116.397428d, 39.90923), new TestPoint(
						116.397428d, 39.90925), new TestPoint(116.397428d,
						39.90923), new TestPoint(116.397428d, 39.90925),
				new TestPoint(116.397428d, 39.90923), new TestPoint(
						116.397428d, 39.90925), new TestPoint(116.397428d,
						39.90923), new TestPoint(116.397428d, 39.90925),
				new TestPoint(116.397428d, 39.90923), new TestPoint(
						116.397428d, 39.90925), new TestPoint(116.397428d,
						39.90923), new TestPoint(116.397428d, 39.90925),
				new TestPoint(116.397428d, 39.90923), new TestPoint(
						116.397428d, 39.90925), new TestPoint(116.397428d,
						39.90923), new TestPoint(116.397428d, 39.90925),
				new TestPoint(116.397428d, 39.90923), new TestPoint(
						116.397428d, 39.90925), new TestPoint(116.397428d,
						39.90923), new TestPoint(116.397428d, 39.90925));
		assertTrue(result != null && result.length == 23);
	}
}
