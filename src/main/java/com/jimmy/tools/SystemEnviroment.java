package com.jimmy.tools;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.util.Properties;

/**
 * Created by Jimmy on 2017/6/20.
 */
public class SystemEnviroment {
    private static Logger logger = LoggerFactory.getLogger(SystemEnviroment.class);
    private static Properties properties;

    private SystemEnviroment() {

    }

    private static void init() {
        logger.info("加载配置文件:{}", "config.properties");
        properties = new Properties();
        try {
            properties.load(SystemEnviroment.class.getClassLoader().getResourceAsStream("config.properties"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String getPropeties(String name) {
        String value = System.getProperty(name);
        if (null != value) {
            return value;
        } else {
            if (null == properties) init();
            return properties.getProperty(name);
        }
    }

    public static int getIntPropeties(String name) {
        return Integer.valueOf(getPropeties(name));
    }
}
