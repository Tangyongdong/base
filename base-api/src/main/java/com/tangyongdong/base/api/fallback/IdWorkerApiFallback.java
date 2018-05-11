package com.tangyongdong.base.api.fallback;

import com.tangyongdong.base.api.IdWorkerApi;
import com.tangyongdong.base.common.exception.BusinessException;
import com.tangyongdong.base.config.BusinessErrorCode;
import feign.hystrix.FallbackFactory;
import lombok.extern.slf4j.Slf4j;

/**
 * @author tangyongdong
 * @create 2018-04-30 13:00
 */
@Slf4j
public class IdWorkerApiFallback implements FallbackFactory {

    @Override
    public Object create(Throwable throwable) {
        log.error("IdWorkerApi fallback:{}", throwable);
        return (IdWorkerApi) () -> {
            throw new BusinessException(BusinessErrorCode.SYSTEM_BUSY);
        };
    }
}
