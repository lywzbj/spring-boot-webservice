package org.example.service.impl;

import org.example.model.ResponseData;
import org.example.service.HelloService;
import org.springframework.stereotype.Service;

import javax.jws.WebParam;
import javax.jws.WebService;
import java.util.ArrayList;
import java.util.List;

@Service
@WebService(targetNamespace = "http://service.luoyu.com.cn")
public class HelloServiceImpl implements HelloService {


    @Override
    public String sayHello(@WebParam(name = "name")String name) {
        return "How are you? " + name;
    }

    @Override
    public ResponseData<List<String>> getPermissions(@WebParam(name = "username") String username) {
        List<String> data = new ArrayList<>();
        data.add("1");
        return ResponseData.success(data);
    }
}
