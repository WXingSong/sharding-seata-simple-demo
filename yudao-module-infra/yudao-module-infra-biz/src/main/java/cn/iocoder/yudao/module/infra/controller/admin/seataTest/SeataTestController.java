package cn.iocoder.yudao.module.infra.controller.admin.seataTest;

import cn.iocoder.yudao.framework.common.pojo.CommonResult;
import cn.iocoder.yudao.module.infra.service.seatTest.SeataTestService;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/infra/seataTest")
public class SeataTestController {

    @Resource
    private SeataTestService seataTestService;

    @PostMapping("/saveSeataTest3")
    public CommonResult<Boolean> saveSeataTest3() throws Exception {
        seataTestService.saveSeataTest();
        return CommonResult.success(true);
    }

}
