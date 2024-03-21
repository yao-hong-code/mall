package com.edu.mall.product.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;

/**
 * sku????????&ֵ
 *
 * @author yao-hong
 * @email 18213823950@163.com
 * @date 2024-03-04 15:47:33
 */
@Data
@TableName("pms_sku_sale_attr_value")
public class SkuSaleAttrValueEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * id
     */
    @TableId
    private Long id;
    /**
     * sku_id
     */
    private Long skuId;
    /**
     * attr_id
     */
    private Long attrId;
    /**
     * ?????????
     */
    private String attrName;
    /**
     * ????????ֵ
     */
    private String attrValue;
    /**
     * ˳?
     */
    private Integer attrSort;

}
