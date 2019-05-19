package com.xuecheng.framework.exception;

import com.xuecheng.framework.model.response.ResponseResult;
import com.xuecheng.framework.model.response.ResultCode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author 麦客子
 * @desc
 * @email leeshuhua@163.com
 * @create 2019/05/19 22:03
 **/
@ControllerAdvice
public class ExceptionCatch {
    private static final Logger LOGGER = LoggerFactory.getLogger(ExceptionCatch.class);

    /**
     * 捕获 CustomException异常
     *
     * @param e
     * @return
     */
    @ExceptionHandler(CustomException.class)
    @ResponseBody
    public ResponseResult customException(CustomException e) {
        LOGGER.error("catch exception : {}\r\nexception: ", e.getMessage(), e);
        ResultCode resultCode = e.getResultCode();
        ResponseResult responseResult = new ResponseResult(resultCode);
        return responseResult;
    }
}