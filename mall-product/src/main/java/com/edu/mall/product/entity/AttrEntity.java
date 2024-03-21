package com.edu.mall.product.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;

/**
 * 属性
 *
 * @author yao-hong
 * @email 18213823950@163.com
 * @date 2024-03-04 15:47:39
 */
@Data
@TableName("pms_attr")
public class AttrEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 属性id
     */
    @TableId
    private Long attrId;
    /**
     * 属性名
     */
    private String attrName;
    /**
     * 搜索类型【0-，1-】
     */
    private Integer searchType;
    /**
     * 图标
     */
    private String icon;
    /**
     * ??ѡֵ?б?[?ö??ŷָ
     */
    private String valueSelect;
    /**
     * 属性类型
     */
    private Integer attrType;
    /**
     * ????״̬[0 - ???ã?1 - ????]
     */
    private Long enable;
    /**
     * ???????
     */
    private Long catelogId;
    /**
     * 展示描述
     */
    private Integer showDesc;

}
