package com.edu.mall.coupon.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * ??ҳ?ֲ????
 *
 * @author yao-hong
 * @email 18213823950@163.com
 * @date 2024-03-04 22:26:14
 */
@Data
@TableName("sms_home_adv")
public class HomeAdvEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * id
     */
    @TableId
    private Long id;
    /**
     * ?
     */
    private String name;
    /**
     * ͼƬ??ַ
     */
    private String pic;
    /**
     * ??ʼʱ?
     */
    private Date startTime;
    /**
     * ????ʱ?
     */
    private Date endTime;
    /**
     * ״̬
     */
    private Integer status;
    /**
     * ???
     */
    private Integer clickCount;
    /**
     * ???????????ӵ?ַ
     */
    private String url;
    /**
     * ??ע
     */
    private String note;
    /**
     * ???
     */
    private Integer sort;
    /**
     * ?????
     */
    private Long publisherId;
    /**
     * ?????
     */
    private Long authId;

}
