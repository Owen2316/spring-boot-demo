package com.spring.demo.utils;

import com.spring.demo.enums.ResultEnum;
import com.spring.demo.model.Result;

public class ResultUtil {
    public static Result success(Object object){
        Result result = new Result();
        result.setCode(ResultEnum.SUCCESS.getCode());
        result.setMsg(ResultEnum.SUCCESS.getMsg());
        result.setData(object);
        return result;
    }

    public static Result success(){
        return success(null);
    }

    public static Result error(int code,String msg){
        Result result = new Result();
        result.setCode(code);
        result.setMsg(msg);
        return result;

    }
    public static Result error(ResultEnum resultEnum){
        return error(resultEnum.getCode(),resultEnum.getMsg());
    }
}
