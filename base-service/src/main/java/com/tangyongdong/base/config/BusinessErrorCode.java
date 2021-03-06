package com.tangyongdong.base.config;


import com.tangyongdong.base.common.exception.ErrorCode;

/**
 * @author tangyongdong
 * @create 2018-05-02 16:56
 */
public enum BusinessErrorCode implements ErrorCode {

    SYSTEM_BUSY(1, "A0001", "系统繁忙请稍后再试"),
    PARAMS_ERROR(1, "A0001", "参数异常");

    private Integer errorStatus;
    private String errorCode;
    private String errorMessage;

    BusinessErrorCode(Integer errorStatus, String errorCode, String errorMessage) {
        this.errorStatus = errorStatus;
        this.errorCode = errorCode;
        this.errorMessage = errorMessage;
    }

    @Override
    public Integer getStatus() {
        return this.errorStatus;
    }

    @Override
    public String getCode() {
        return this.errorCode;
    }

    @Override
    public String getMessage() {
        return this.errorMessage;
    }
}
