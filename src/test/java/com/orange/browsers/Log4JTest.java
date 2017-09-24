package com.orange.browsers;

import org.apache.log4j.Logger;
import org.testng.annotations.Test;

public class Log4JTest {

    Logger logger = Logger.getLogger(Log4JTest.class);

    @Test
    public void testMethod1(){
        logger.debug("I'm in Test Method 1");
    }
    @Test
    public void testMethod2(){
        logger.debug("I'm in Test Method 2");
    }
    @Test
    public void testMethod3(){
        logger.debug("I'm in Test Method 3");
    }
    @Test
    public void testMethod4(){
        logger.debug("I'm in Test Method 4");
    }
    @Test
    public void testMethod5(){
        logger.debug("I'm in Test Method 5");
    }

}
