package com.jimmy.services;

import com.jimmy.api.HelloService;

/**
 * Created by Jimmy on 2017/6/20.
 */
public class HelloServiceImpl implements HelloService{
    @Override
    public String hello() {
        return "Hello world!";
    }
}
