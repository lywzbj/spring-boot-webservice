package org.example.model;

import lombok.Data;

import javax.xml.bind.annotation.XmlSeeAlso;
import java.util.ArrayList;
import java.util.Collection;

@Data
@XmlSeeAlso({ArrayList.class})
public class ResponseData<T> {

    private String msg;


    private int code;


    private T data;





    public static  <T> ResponseData<T> success(T t) {
        ResponseData<T> responseData = new ResponseData<>();
        responseData.setData(t);
        responseData.setMsg("success");
        responseData.setCode(200);
        return responseData;
    }



}
