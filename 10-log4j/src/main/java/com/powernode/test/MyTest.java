package com.powernode.test;

import org.apache.log4j.Logger;

public class MyTest {

    public static void main(String[] args) {
        Logger logger = Logger.getLogger(MyTest.class);
        logger.fatal("fatal msg");
        logger.error("error msg");
        logger.warn("warn msg");
        logger.info("info msg");
        logger.debug("debug msg");
        logger.trace("trace msg");
    }

}
