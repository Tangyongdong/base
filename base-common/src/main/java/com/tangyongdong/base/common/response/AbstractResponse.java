package com.tangyongdong.base.common.response;

import java.io.Serializable;

/**
 * @author tangyongdong
 * @create 2018-04-30 14:56
 */
public abstract class AbstractResponse<T> implements Serializable {

    public abstract int getResultCode();

    /**
     * 判断操作是否成功
     *
     * @return
     */
    public boolean isSuccess() {
        return ResponseStatusEnum.SUCCESS.getStatusCode().equals(this.getResultCode());
    }

}
