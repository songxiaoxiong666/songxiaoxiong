package com.example.love.sxx.Utils;

import com.example.love.sxx.enums.RespCode;

import java.io.Serializable;

/**
 * @program: sxx
 * @ClassName ClientResp
 * @description:
 * @author: lyy
 * @create: 2020-07-03 10:26
 * @Version 1.0
 **/
public class ClientResp<T> implements Serializable {
    private static final long serialVersionUID = 8306132465377343536L;
    private String code;
    private String msg;
    private T data;


    public ClientResp(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public ClientResp(RespCode respCode, T data) {
        this.code = respCode.getCode();
        this.msg = respCode.getMsg();
        this.data = data;
    }

    public ClientResp(String msg, RespCode respCode) {
        this.code = respCode.getCode();
        this.msg = msg;
    }

    public ClientResp(RespCode respCode) {
        this.code = respCode.getCode();
        this.msg = respCode.getMsg();
    }

    public ClientResp(ErrorCode errorCode) {
        this.code = errorCode.getCode();
        this.msg = errorCode.getMsg();
    }

    public ClientResp(T resultData) {
        this.code = RespCode.SUCCESS.getCode();
        this.msg = RespCode.SUCCESS.getMsg();
        this.data = resultData;
    }

    public ClientResp() {
        this.code = RespCode.SUCCESS.getCode();
        this.msg = RespCode.SUCCESS.getMsg();
    }
}

