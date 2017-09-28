/**
 * 
 */
package practice.framework.utils;

/**
 * @author Dzmitry_Malchanau
 *
 */
public class Logger {
	private static org.apache.log4j.Logger logger = org.apache.log4j.Logger.getRootLogger();

	/**
	 * Logs fatal level message
	 * 
	 * @param message
	 *            - message
	 */
	public static final void fatal(String message) {
		logger.fatal(message);
	}

	/**
	 * Logs error level message
	 * 
	 * @param message
	 *            - message
	 */
	public static final void error(String message) {
		logger.error(message);
	}

	/**
	 * Logs warning level message
	 * 
	 * @param message
	 *            - message
	 */
	public static final void warn(String message) {
		logger.warn(message);
	}

	/**
	 * Logs info level message
	 * 
	 * @param message
	 *            - message
	 */
	public static final void info(String message) {
		logger.info(message);
	}

	/**
	 * Logs debug level message
	 * 
	 * @param message
	 *            - message
	 */
	public static final void debug(String message) {
		logger.debug(message);
	}

	/**
	 * Shutdown
	 */
	public static void shutdown() {
		org.apache.log4j.LogManager.shutdown();
	}

}
