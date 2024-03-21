package com.edu.mall.coupon.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * ??ɱ???Ʒ????
 *
 * @author yao-hong
 * @email 18213823950@163.com
 * @date 2024-03-04 22:26:07
 */
@Data
@TableName("sms_seckill_sku_relation")
public class SeckillSkuRelationEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * id
     */
    @TableId
    private Long id;
    /**
     * ?id
     */
    private Long promotionId;
    /**
     * ?????id
     */
    private Long promotionSessionId;
    /**
     * ??Ʒid
     */
    private Long skuId;
    /**
     * ??ɱ?۸
     */
    private BigDecimal seckillPrice;
    /**
     * ??ɱ????
     */
    private BigDecimal seckillCount;
    /**
     * ÿ???޹??
     */
    private BigDecimal seckillLimit;
    /**
     * ???
     */
    private Integer seckillSort;

}
