package com.tangyongdong.base.common.exception;

/**
 * @author tangyongdong
 * @create 2018-04-30 14:24
 */
public enum StatusEnum {
    SHOW(1),
    HIDDEN(2);

    private Integer status;

    StatusEnum(Integer status) {
        this.status = status;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}
