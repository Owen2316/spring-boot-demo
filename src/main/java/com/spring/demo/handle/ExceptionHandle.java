package com.spring.demo.handle;

import com.spring.demo.enums.ResultEnum;
import com.spring.demo.exception.UserException;
import com.spring.demo.model.Result;
import com.spring.demo.utils.ResultUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

public class ExceptionHandle {

    private final static Logger logger = LoggerFactory.getLogger(ExceptionHandle.class);

    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    public Result handle(Exception e){
        if(e instanceof UserException){
            UserException userException = (UserException) e;
            return ResultUtil.error(userException.getCode(),userException.getMessage());
        }
        logger.error("System error:",e);
        return ResultUtil.error(ResultEnum.UNKNONWN_ERROR);
    }
}
