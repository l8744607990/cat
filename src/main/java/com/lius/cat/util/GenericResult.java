package com.lius.cat.util;

/**
 * 封装json数据结果
 * User : liulu ,
 * Date : 2016-7-17 21:14 ,
 * version $Id: GenericResult.java, v 0.1 Exp $
 */
public class GenericResult<T> {

    private boolean success;

    private T data;

    private String code;

    private String message;

    public GenericResult() {
        this.success = true;
    }

    public GenericResult(T data) {
        this.success = true;
        this.data = data;
    }

    public GenericResult(boolean success, T data) {
        this.success = success;
        this.data = data;
    }

    public GenericResult(boolean success, String message) {
        this.success = success;
        this.message = message;
    }

    public GenericResult(boolean success, String code, String message) {

        this.success = success;
        this.message = message;
        this.code = code;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
