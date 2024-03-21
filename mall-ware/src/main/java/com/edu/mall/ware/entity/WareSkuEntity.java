package com.edu.mall.ware.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;

/**
 * ??Ʒ???
 *
 * @author yao-hong
 * @email 18213823950@163.com
 * @date 2024-03-04 23:13:01
 */
@Data
@TableName("wms_ware_sku")
public class WareSkuEntity implements Serializable {
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
     * ?ֿ?id
     */
    private Long wareId;
    /**
     * ?????
     */
    private Integer stock;
    /**
     * sku_name
     */
    private String skuName;
    /**
     * ???????
     */
    private Integer stockLocked;

}
