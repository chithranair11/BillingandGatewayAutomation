package com.pratian.billingandgatewayTests.testlisteners;

import org.apache.log4j.Logger;



public class ActivityLogger {
	
	private static Logger log ;
	
	public static void intializeLogger(String name)
	{
		log=Logger.getLogger("Logger");
	}
	
	/**
	 * Intialize the logger.
	 *
	 * @param testCaseName the test case name
	 * @return the logger
	 */

	public static void startTest(String testCaseName)
	{
		log.info("Test Case Name: "+testCaseName);
	}
	/**
	 * log information
	 *
	 * @param message the message
	 */
	
    public static void info(String message) {
        log.info(message);
        TestListener.reportLog(message);
    }
	
	/**
	 * log warning
	 *
	 * @param message the message
	 */
	 
	  public static void warn(String message) {
	        log.warn(message);
	        TestListener.reportLog(message);
	    }

	/**
	 * Log error
	 *
	 * @param message the message
	 */
	 
	    public static void error(String message) {
	        log.error(message);
	        TestListener.reportLog(message);
	    }

	
	/**
	 * Log Fatal.
	 *
	 * @param message the message
	 */
	    public static void fatal(String message) {
	        log.fatal(message);
	        TestListener.reportLog(message);
	    }

	/**
	 * Log Debug.
	 *
	 * @param message the message
	 */
	    public  static void debug(String message) {
	        log.debug(message);
	        TestListener.reportLog(message);
	    }
}
