package com.springboot.college.exception;

import com.springboot.college.common.ErrorInfoInterface;


/**
 * @Description TODO
 * @Date 2019/12/13 15:10
 * @Created by zhuozuoying
 */
public class SSPException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    protected String errorCode;

    protected String errorMsg;

    protected ErrorInfoInterface errorInfoInterface;

    public SSPException() {
        super();
    }

    public SSPException(ErrorInfoInterface errorInfoInterface) {
        super(errorInfoInterface.getStatus());
        this.errorInfoInterface = errorInfoInterface;
        this.errorCode = errorInfoInterface.getStatus();
        this.errorMsg = errorInfoInterface.getMessage();
    }

    public SSPException(ErrorInfoInterface errorInfoInterface, Throwable cause) {
        super(errorInfoInterface.getStatus(), cause);
        this.errorCode = errorInfoInterface.getStatus();
        this.errorMsg = errorInfoInterface.getMessage();
    }

    public SSPException(String errorMsg) {
        super(errorMsg);
        this.errorMsg = errorMsg;
    }

    public SSPException(String errorCode, String errorMsg) {
        super(errorCode);
        this.errorCode = errorCode;
        this.errorMsg = errorMsg;
    }

    public SSPException(String errorCode, String errorMsg, Throwable cause) {
        super(errorCode, cause);
        this.errorCode = errorCode;
        this.errorMsg = errorMsg;
    }


    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public String getErrorMsg() {
        return errorMsg;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }

    public String getMessage() {
        return errorMsg;
    }

    public ErrorInfoInterface getErrorInfoInterface() {
        return errorInfoInterface;
    }

    public void setErrorInfoInterface(ErrorInfoInterface errorInfoInterface) {
        this.errorInfoInterface = errorInfoInterface;
    }

    @Override
    public Throwable fillInStackTrace() {
        return this;
    }

}
