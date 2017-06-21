package com.jimmy.services;

import com.jimmy.api.HelloService;
import org.springframework.stereotype.Service;

/**
 * Created by Jimmy on 2017/6/20.
 */
@Service
public class HelloServiceImpl implements HelloService{
    @Override
    public String hello() {
        return "Hello world!";
    }
}
