package com.edu.mall.ware.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * @author yao-hong
 * @email 18213823950@163.com
 * @date 2024-03-04 23:13:00
 */
@Data
@TableName("wms_purchase_detail")
public class PurchaseDetailEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     *
     */
    @TableId
    private Long id;
    /**
     * ?ɹ???id
     */
    private Long purchaseId;
    /**
     * ?ɹ???Ʒid
     */
    private Long skuId;
    /**
     * ?ɹ??
     */
    private Integer skuNum;
    /**
     * ?ɹ??
     */
    private BigDecimal skuPrice;
    /**
     * ?ֿ?id
     */
    private Long wareId;
    /**
     * ״̬[0?½???1?ѷ??䣬2???ڲɹ???3?????ɣ?4?ɹ?ʧ??]
     */
    private Integer status;

}
