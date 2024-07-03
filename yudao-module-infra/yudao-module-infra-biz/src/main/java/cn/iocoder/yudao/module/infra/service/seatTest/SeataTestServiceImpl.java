package cn.iocoder.yudao.module.infra.service.seatTest;

import cn.iocoder.yudao.module.infra.dal.dataobject.seatTest.SeataTest3;
import cn.iocoder.yudao.module.infra.dal.mysql.seataTest.SeataTest3Mapper;
import io.seata.core.context.RootContext;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class SeataTestServiceImpl implements SeataTestService {

    @Resource
    private SeataTest3Mapper seataTest3Mapper;


    @Override
    public void saveSeataTest() {

        if (RootContext.inGlobalTransaction()) {
            System.out.println("===================RootContext.getXID():" + RootContext.getXID());
            System.out.println("===================RootContext.getBranchType():" + RootContext.getBranchType());
        }


        SeataTest3 data3 = new SeataTest3();
        data3.setSubject("数学");
        data3.setAchievement(90);
        data3.setCreateTime(LocalDateTime.now());
        seataTest3Mapper.insert(data3);

/*        SeataTest3 data4 = new SeataTest3();
        data4.setId(data3.getId());
        data3.setSubject("数学");
        data3.setAchievement(45);
        data3.setCreateTime(LocalDateTime.now());
        seataTest3Mapper.updateById(data4);*/
    }
}
