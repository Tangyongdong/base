package com.tangyongdong.base.controller;

import com.tangyongdong.base.api.IdWorkerApi;
import com.tangyongdong.base.common.response.CommonResponse;
import com.tangyongdong.base.service.IdWorkerService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author tangyongdong
 * @create 2018-05-04 15:41
 */
@RestController
@Slf4j
public class IdWorkerController implements IdWorkerApi {

    @Autowired
    private IdWorkerService idWorkerService;

    @Override
    public CommonResponse<String> getId() {
        return CommonResponse.success(idWorkerService.getId());
    }
}
