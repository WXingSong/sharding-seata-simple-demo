package cn.iocoder.yudao.module.system.dal.dataobject.seataTest;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.time.LocalDateTime;

@TableName("seata_test_2")
@Data
public class SeataTest2 {

    @TableId
    private Long id;

    private String className;

    private String adress;

    private LocalDateTime createTime;

    private Long tenant_id;

}
