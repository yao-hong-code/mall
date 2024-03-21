package com.edu.mall.member.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * ???ֱ仯??ʷ??¼
 *
 * @author yao-hong
 * @email 18213823950@163.com
 * @date 2024-03-04 22:56:20
 */
@Data
@TableName("ums_integration_change_history")
public class IntegrationChangeHistoryEntity implements Serializable {
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
     * ?仯??ֵ
     */
    private Integer changeCount;
    /**
     * ??ע
     */
    private String note;
    /**
     * ??Դ[0->???1->????Ա?޸?;2->?]
     */
    private Integer sourceTyoe;

}
