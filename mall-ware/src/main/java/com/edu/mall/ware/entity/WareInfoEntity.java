package com.edu.mall.ware.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;

/**
 * ?ֿ???Ϣ
 *
 * @author yao-hong
 * @email 18213823950@163.com
 * @date 2024-03-04 23:13:00
 */
@Data
@TableName("wms_ware_info")
public class WareInfoEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * id
     */
    @TableId
    private Long id;
    /**
     * ?ֿ??
     */
    private String name;
    /**
     * ?ֿ???ַ
     */
    private String address;
    /**
     * ???????
     */
    private String areacode;

}
