package com.springboot.college.exception;

import com.springboot.college.common.ErrorInfoInterface;


/**
 * @Description TODO
 * @Date 2019/12/13 15:10
 * @Created by zhuozuoying
 */
public class UnsupportedException extends SSPException {

    public UnsupportedException(ErrorInfoInterface errorInfoInterface) {
        super(errorInfoInterface);
    }

    public UnsupportedException(ErrorInfoInterface errorInfoInterface, Throwable cause) {
        super(errorInfoInterface, cause);
    }

    public UnsupportedException(String errorMsg) {
        super(errorMsg);
    }

}
