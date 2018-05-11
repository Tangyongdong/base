package com.tangyongdong.base.common.exception;

/**
 * @author tangyongdong
 * @create 2018-04-30 14:34
 */
public class BusinessException extends RuntimeException {

    private Integer status;
    private String code;
    private String message;

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @Override
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public BusinessException(ErrorCode errorCode) {
        super();
        this.status = errorCode.getStatus();
        this.code = errorCode.getCode();
        this.message = errorCode.getMessage();
    }
}
