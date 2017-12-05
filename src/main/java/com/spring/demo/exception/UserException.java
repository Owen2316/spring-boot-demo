package com.spring.demo.exception;

import com.spring.demo.enums.ResultEnum;

public class UserException extends RuntimeException{
    private Integer code;
    public UserException(ResultEnum resultEnum){
        super(resultEnum.getMsg());
        this.code = resultEnum.getCode();
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }
}
