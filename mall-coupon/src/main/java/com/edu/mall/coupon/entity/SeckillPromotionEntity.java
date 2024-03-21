package com.edu.mall.coupon.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * ??ɱ?
 *
 * @author yao-hong
 * @email 18213823950@163.com
 * @date 2024-03-04 22:26:07
 */
@Data
@TableName("sms_seckill_promotion")
public class SeckillPromotionEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * id
     */
    @TableId
    private Long id;
    /**
     * ????
     */
    private String title;
    /**
     * ??ʼ???
     */
    private Date startTime;
    /**
     * ???????
     */
    private Date endTime;
    /**
     * ??????״̬
     */
    private Integer status;
    /**
     * ????ʱ?
     */
    private Date createTime;
    /**
     * ?????
     */
    private Long userId;

}
