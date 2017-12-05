package com.spring.demo.enums;

public enum ResultEnum {
    UNKNONWN_ERROR(-1,"Unkonw error"),
    SUCCESS(0,"Success"),
    ;

    private Integer code;
    private String msg;

    ResultEnum(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public Integer getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }
}
