package com.edu.mall.ware.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * ?ɹ???Ϣ
 *
 * @author yao-hong
 * @email 18213823950@163.com
 * @date 2024-03-04 23:13:00
 */
@Data
@TableName("wms_purchase")
public class PurchaseEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * ?ɹ???id
     */
    @TableId
    private Long id;
    /**
     * ?ɹ???id
     */
    private Long assigneeId;
    /**
     * ?ɹ????
     */
    private String assigneeName;
    /**
     * ??ϵ??ʽ
     */
    private String phone;
    /**
     * ???ȼ?
     */
    private Integer priority;
    /**
     * ״̬
     */
    private Integer status;
    /**
     * ?ֿ?id
     */
    private Long wareId;
    /**
     * ?ܽ
     */
    private BigDecimal amount;
    /**
     * ???????
     */
    private Date createTime;
    /**
     * ???????
     */
    private Date updateTime;

}
