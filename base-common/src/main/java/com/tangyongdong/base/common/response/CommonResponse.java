package com.tangyongdong.base.common.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

/**
 * @author tangyongdong
 * @create 2018-04-30 15:06
 */
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CommonResponse<T> extends AbstractResponse {

    private int resultCode;
    private T data;

    public static CommonResponse success(Object data) {
        return CommonResponse.builder().resultCode(ResponseStatusEnum.SUCCESS.getStatusCode()).data(data).build();
    }

    @Override
    public int getResultCode() {
        return 200;
    }

    public void setResultCode(int resultCode) {
        this.resultCode = resultCode;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

}
