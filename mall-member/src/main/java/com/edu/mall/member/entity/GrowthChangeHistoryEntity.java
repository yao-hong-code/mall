package com.edu.mall.member.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * ?ɳ?ֵ?仯??ʷ??¼
 *
 * @author yao-hong
 * @email 18213823950@163.com
 * @date 2024-03-04 22:56:20
 */
@Data
@TableName("ums_growth_change_history")
public class GrowthChangeHistoryEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * id
     */
    @TableId
    private Long id;
    /**
     * member_id
     */
    private Long memberId;
    /**
     * create_time
     */
    private Date createTime;
    /**
     * ?ı???ֵ?????????
     */
    private Integer changeCount;
    /**
     * ??ע
     */
    private String note;
    /**
     * ??????Դ[0-???1-????Ա?޸?]
     */
    private Integer sourceType;

}
