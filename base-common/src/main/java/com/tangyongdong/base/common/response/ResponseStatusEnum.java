package com.tangyongdong.base.common.response;

/**
 * @author tangyongdong
 * @create 2018-04-30 14:58
 */
public enum ResponseStatusEnum {
    SUCCESS(200),
    FAIL(400);

    private Integer statusCode;

    ResponseStatusEnum(Integer statusCode) {
        this.statusCode = statusCode;
    }

    public Integer getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
    }
}
