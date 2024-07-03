package cn.iocoder.yudao.module.system.dal.dataobject.seataTest;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.time.LocalDateTime;

@TableName("seata_test_1")
@Data
public class SeataTest1 {

    /**
     * 自增主键
     */
    @TableId
    private Long id;

    private String name;

    private Integer age;

    private LocalDateTime createTime;

    private Long tenant_id;
}
