package com.demo.java;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
public class App 
{
	static final Logger LOG= LoggerFactory.getLogger(App.class);
    public static void main( String[] args )
    {
        int result = Maths.add(4,8);
		LOG.debug("The Sum = {}",result);
    }
}
