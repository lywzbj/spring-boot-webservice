package org.example.service.impl;

import org.example.service.HelloService;
import org.springframework.stereotype.Service;

import javax.jws.WebParam;
import javax.jws.WebService;

@Service
@WebService(targetNamespace = "http://service.luoyu.com.cn")
public class HelloServiceImpl implements HelloService {


    @Override
    public String sayHello(@WebParam(name = "name")String name) {
        return "How are you? " + name;
    }
}
