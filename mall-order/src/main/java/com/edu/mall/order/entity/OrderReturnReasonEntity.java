package com.edu.mall.order.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * ?˻?ԭ?
 *
 * @author yao-hong
 * @email 18213823950@163.com
 * @date 2024-03-04 23:04:29
 */
@Data
@TableName("oms_order_return_reason")
public class OrderReturnReasonEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * id
     */
    @TableId
    private Long id;
    /**
     * ?˻?ԭ?
     */
    private String name;
    /**
     * ???
     */
    private Integer sort;
    /**
     * ????״̬
     */
    private Integer status;
    /**
     * create_time
     */
    private Date createTime;

}
