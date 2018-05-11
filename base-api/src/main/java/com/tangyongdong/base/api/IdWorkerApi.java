package com.tangyongdong.base.api;


import com.tangyongdong.base.api.fallback.IdWorkerApiFallback;
import com.tangyongdong.base.common.response.CommonResponse;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author tangyongdong
 * @create 2018-04-30 12:55
 */
@FeignClient(value = "base-service", fallbackFactory = IdWorkerApiFallback.class)
public interface IdWorkerApi {

    /**
     * 获取唯一ID
     *
     * @return
     */
    @RequestMapping(value = "/v1/get/id",method = RequestMethod.POST)
    CommonResponse<String> getId();
}
