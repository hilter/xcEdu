package com.xuecheng.framework.exception;

import com.xuecheng.framework.model.response.ResultCode;

/**
 * @author 麦客子
 * @desc
 * @email leeshuhua@163.com
 * @create 2019/05/19 21:55
 **/
public class ExceptionCast {

    /**
     * 使用此静态方法抛出自定义异常
     * @param resultCode
     */
    public static void cast(ResultCode resultCode) {
        throw new CustomException(resultCode);
    }
}