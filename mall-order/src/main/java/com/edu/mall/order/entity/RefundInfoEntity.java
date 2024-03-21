package com.edu.mall.order.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * ?˿???Ϣ
 *
 * @author yao-hong
 * @email 18213823950@163.com
 * @date 2024-03-04 23:04:30
 */
@Data
@TableName("oms_refund_info")
public class RefundInfoEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * id
     */
    @TableId
    private Long id;
    /**
     * ?˿??Ķ???
     */
    private Long orderReturnId;
    /**
     * ?˿??
     */
    private BigDecimal refund;
    /**
     * ?˿????ˮ?
     */
    private String refundSn;
    /**
     * ?˿?״̬
     */
    private Integer refundStatus;
    /**
     * ?˿?????[1-֧??????2-΢?ţ?3-??????4-???
     */
    private Integer refundChannel;
    /**
     *
     */
    private String refundContent;

}
