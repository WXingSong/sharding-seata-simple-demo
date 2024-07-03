package cn.iocoder.yudao.module.infra.api.seataTest;


import cn.iocoder.yudao.framework.common.pojo.CommonResult;
import cn.iocoder.yudao.module.infra.service.seatTest.SeataTestService;
import jakarta.annotation.Resource;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RestController;

import static cn.iocoder.yudao.framework.common.pojo.CommonResult.success;

@RestController // 提供 RESTful API 接口，给 Feign 调用
@Validated
public class SeataTestApiImpl implements SeataTestApi {

    @Resource
    private SeataTestService seataTestService;

    @Override
    public CommonResult<Boolean> saveSeataTest3() {
        seataTestService.saveSeataTest();
        return success(true);
    }
}
