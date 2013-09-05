package cn.softnado.Gwt.Map.Baidu.Shared.Dom.Base;

public interface IPoint {
	/**
	 * 地理经度。
	 * 
	 * @return
	 */
	double getLng();

	/**
	 * 地理经度。
	 * 
	 * @param value
	 */
	void setLng(double value);

	/**
	 * 地理纬度。
	 * 
	 * @return
	 */
	double getLat();

	/**
	 * 地理纬度。
	 * 
	 * @param value
	 */
	void setLat(double value);

}
