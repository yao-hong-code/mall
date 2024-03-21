package com.edu.mall.product.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;

/**
 * spuͼƬ
 *
 * @author yao-hong
 * @email 18213823950@163.com
 * @date 2024-03-04 15:47:34
 */
@Data
@TableName("pms_spu_images")
public class SpuImagesEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * id
     */
    @TableId
    private Long id;
    /**
     * spu_id
     */
    private Long spuId;
    /**
     * ͼƬ?
     */
    private String imgName;
    /**
     * ͼƬ??ַ
     */
    private String imgUrl;
    /**
     * ˳?
     */
    private Integer imgSort;
    /**
     * ?Ƿ?Ĭ??ͼ
     */
    private Integer defaultImg;

}
