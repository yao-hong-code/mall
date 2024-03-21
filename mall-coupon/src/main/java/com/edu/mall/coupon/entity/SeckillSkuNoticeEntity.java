package com.edu.mall.coupon.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * ??ɱ??Ʒ֪ͨ???
 *
 * @author yao-hong
 * @email 18213823950@163.com
 * @date 2024-03-04 22:26:07
 */
@Data
@TableName("sms_seckill_sku_notice")
public class SeckillSkuNoticeEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * id
     */
    @TableId
    private Long id;
    /**
     * member_id
     */
    private Long memberId;
    /**
     * sku_id
     */
    private Long skuId;
    /**
     * ?????id
     */
    private Long sessionId;
    /**
     * ????ʱ?
     */
    private Date subcribeTime;
    /**
     * ????ʱ?
     */
    private Date sendTime;
    /**
     * ֪ͨ??ʽ[0-???ţ?1-?ʼ
     */
    private Integer noticeType;

}
