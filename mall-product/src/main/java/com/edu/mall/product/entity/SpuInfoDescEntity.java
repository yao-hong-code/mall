package com.edu.mall.product.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;

/**
 * spu??Ϣ???
 *
 * @author yao-hong
 * @email 18213823950@163.com
 * @date 2024-03-04 15:47:38
 */
@Data
@TableName("pms_spu_info_desc")
public class SpuInfoDescEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * ??Ʒid
     */
    @TableId
    private Long spuId;
    /**
     * ??Ʒ???
     */
    private String decript;

}
