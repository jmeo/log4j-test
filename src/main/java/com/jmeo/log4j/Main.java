package com.jmeo.log4j;

import org.apache.log4j.Logger;

/**
 * Created by jmeo on 15/9/29.
 */
public class Main {

    static Logger logger = Logger.getLogger(Main.class);

    public static void main(String [] args){

        logger.debug("this is debug info  : ************  debug");
        logger.info("this is info message : --------------  info");
        logger.error("this is error message : &&&&&&&&&&&&&&  error");
        logger.fatal("this is fatal message : ############## fatal");

    }

}
