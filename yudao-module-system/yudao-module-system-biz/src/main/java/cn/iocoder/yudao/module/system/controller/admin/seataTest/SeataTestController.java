package cn.iocoder.yudao.module.system.controller.admin.seataTest;

import cn.iocoder.yudao.framework.common.pojo.CommonResult;
import cn.iocoder.yudao.module.system.service.seataTest.SeataTestService;
import jakarta.annotation.Resource;
import jakarta.annotation.security.PermitAll;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/system/seataTest")
@Validated
public class SeataTestController {

    @Resource
    private SeataTestService seataTestService;

    @PermitAll
    @PostMapping("/saveSeataTest")
    public CommonResult<Boolean> saveSeataTest() {
        seataTestService.saveSeataTest();
        return CommonResult.success(true);
    }
}
