package org.example.service;

import org.example.model.ResponseData;

import javax.jws.WebService;
import java.util.List;


public interface HelloService {


    String sayHello(String name);



    ResponseData<List<String>> getPermissions(String username);



}
