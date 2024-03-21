package com.edu.mall.coupon.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * ?Ż?ȯ??ȡ??ʷ??¼
 *
 * @author yao-hong
 * @email 18213823950@163.com
 * @date 2024-03-04 22:26:08
 */
@Data
@TableName("sms_coupon_history")
public class CouponHistoryEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * id
     */
    @TableId
    private Long id;
    /**
     * ?Ż?ȯid
     */
    private Long couponId;
    /**
     * ??Աid
     */
    private Long memberId;
    /**
     * ??Ա?
     */
    private String memberNickName;
    /**
     * ??ȡ??ʽ[0->??̨???ͣ?1->??????ȡ]
     */
    private Integer getType;
    /**
     * ????ʱ?
     */
    private Date createTime;
    /**
     * ʹ??״̬[0->δʹ?ã?1->??ʹ?ã?2->?ѹ???]
     */
    private Integer useType;
    /**
     * ʹ??ʱ?
     */
    private Date useTime;
    /**
     * ????id
     */
    private Long orderId;
    /**
     * ?????
     */
    private Long orderSn;

}
