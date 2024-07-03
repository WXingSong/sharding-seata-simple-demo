package cn.iocoder.yudao.module.infra.api.seataTest;

import cn.iocoder.yudao.framework.common.pojo.CommonResult;
import cn.iocoder.yudao.module.infra.enums.ApiConstants;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;

@FeignClient(name = ApiConstants.NAME) // TODO 芋艿：fallbackFactory =
public interface SeataTestApi {

    String PREFIX = ApiConstants.PREFIX + "/api-seataTest";

    @PostMapping(PREFIX + "/saveSeataTest3")
    CommonResult<Boolean> saveSeataTest3();

}
