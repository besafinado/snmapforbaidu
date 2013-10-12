package cn.softnado.Gwt.Map.Baidu.Client;

/**
 * App Key Incorrect
 * @author softnado
 *
 */
public class InvalidKeyException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public InvalidKeyException(String key) {
		super("Invalid app key: " + key);
	}

}
