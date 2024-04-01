package com.hrms.util;

import org.apache.log4j.Logger;

public class Log4j {
	
	private static Logger log=Logger.getLogger(Log4j.class.getName());
	public static void info(String msg) {
		log.info(msg);
	}

}
