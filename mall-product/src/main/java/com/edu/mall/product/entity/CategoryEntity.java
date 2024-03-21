package com.edu.mall.product.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableLogic;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * 商品分类
 *
 * @author yao-hong
 * @email 18213823950@163.com
 * @date 2024-03-04 15:47:39
 */
@Data
@TableName("pms_category")
public class CategoryEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * id
     */
    @TableId
    private Long catId;
    /**
     * 名称
     */
    private String name;
    /**
     * 父id
     */
    private Long parentCid;
    /**
     * 等级
     */
    private Integer catLevel;
    /**
     * 展示状态（0-否，1-是）
     */
    @TableLogic(value = "1", delval = "0")
    private Integer showStatus;
    /**
     * 排序
     */
    private Integer sort;
    /**
     * 图标
     */
    private String icon;
    /**
     *
     */
    private String productUnit;
    /**
     *
     */
    private Integer productCount;
    /**
     * 子数据
     */
    @TableField(exist = false)
    private List<CategoryEntity> children;

}
