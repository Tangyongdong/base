package com.tangyongdong.base.common.exception;

/**
 * @author tangyongdong
 * @create 2018-04-30 14:13
 */
public interface ErrorCode {
    Integer getStatus();

    String getCode();

    String getMessage();
}
