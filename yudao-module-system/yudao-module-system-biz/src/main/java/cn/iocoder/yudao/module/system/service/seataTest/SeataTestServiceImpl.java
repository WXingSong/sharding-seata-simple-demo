package cn.iocoder.yudao.module.system.service.seataTest;


import cn.iocoder.yudao.framework.common.exception.enums.GlobalErrorCodeConstants;
import cn.iocoder.yudao.module.infra.api.seataTest.SeataTestApi;
import cn.iocoder.yudao.module.system.dal.dataobject.seataTest.SeataTest1;
import cn.iocoder.yudao.module.system.dal.dataobject.seataTest.SeataTest2;
import cn.iocoder.yudao.module.system.dal.mysql.seataTest.SeataTest2Mapper;
import cn.iocoder.yudao.module.system.dal.mysql.seataTest.SeataTset1Mapper;
import io.seata.core.context.RootContext;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.sql.DataSource;
import java.time.LocalDateTime;

import static cn.iocoder.yudao.framework.common.exception.util.ServiceExceptionUtil.exception;

@Service
public class SeataTestServiceImpl implements SeataTestService {

    @Resource
    private SeataTset1Mapper seataTset1Mapper;

    @Resource
    private SeataTest2Mapper seataTest2Mapper;

    @Resource
    private SeataTestApi seataTestApi;

    @Resource
    private DataSource dataSource;

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void saveSeataTest() {
        SeataTest1 data1 = new SeataTest1();
        data1.setName("张三");
        data1.setAge(13);
        data1.setCreateTime(LocalDateTime.now());

        SeataTest2 data2 = new SeataTest2();
        data2.setAdress("广东省东莞市");
        data2.setClassName("三年级二班");
        data2.setCreateTime(LocalDateTime.now());

        System.out.println("========================" + RootContext.getXID());

        seataTset1Mapper.insert(data1);

        seataTestApi.saveSeataTest3();

//        seataTest2Mapper.insert(data2);

       /* if (result.isError()) {
            TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
        }*/
        throw exception(GlobalErrorCodeConstants.INTERNAL_SERVER_ERROR);

    }
}
