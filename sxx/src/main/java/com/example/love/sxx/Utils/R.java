package com.example.love.sxx.Utils;

import com.example.love.sxx.enums.RespCode;
import io.swagger.annotations.ApiModelProperty;
import com.alibaba.fastjson.JSONObject;

/**
 * @program: sxx
 * @ClassName R
 * @description:
 * @author: lyy
 * @create: 2020-07-03 10:37
 * @Version 1.0
 **/
public class R extends ClientResp{
    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "错误码", name = "code")
    private String code;
    @ApiModelProperty(value = "错误信息", name = "msg")
    private String msg;
    @ApiModelProperty(value = "数据对象", name = "data")
    private JSONObject data;

    public R() {
        this.code = "0";
        this.msg = "success";
        this.data = new JSONObject();
    }

    public R(String code, String msg) {
        this.code = code;
        this.msg = msg;
        this.data = null;
    }

    public static R error() {
        return error("500", "未知异常，请联系管理员");
    }

    public static R error(String msg) {
        return error("500", msg);
    }

    public static R error(String code, String msg) {
        R r = new R();
        r.code = code;
        r.msg = msg;
        return r;
    }

    public static R error(RespCode respCode) {
        R r = new R();
        r.code = respCode.getCode();
        r.msg = respCode.getMsg();
        return r;
    }

    public static R ok(String msg) {
        R r = new R();
        r.msg = msg;
        return r;
    }

    public static R put(JSONObject data) {
        R r = new R();
        r.setData(data);
        return r;
    }

    public static R ok() {
        return new R();
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public JSONObject getData() {
        return data;
    }

    public void setData(JSONObject data) {
        this.data = data;
    }

    public R put(String key, Object value) {
        this.data.put(key, value);
        return this;
    }
}

