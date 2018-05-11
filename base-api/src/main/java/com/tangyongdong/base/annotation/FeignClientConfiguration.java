package com.tangyongdong.base.annotation;

import org.springframework.cloud.netflix.feign.EnableFeignClients;

/**
 * @author tangyongdong
 * @create 2018-05-08 13:15
 */
@EnableFeignClients({"com.tangyongdong.base.api"})
public class FeignClientConfiguration {
}
