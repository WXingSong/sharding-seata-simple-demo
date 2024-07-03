package cn.iocoder.yudao.module.infra.dal.dataobject.seatTest;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@TableName("seata_test_3")
public class SeataTest3 {

    @TableId
    private Long id;

    private String subject;

    private Integer achievement;

    private LocalDateTime createTime;

    private Long tenant_id;

}
