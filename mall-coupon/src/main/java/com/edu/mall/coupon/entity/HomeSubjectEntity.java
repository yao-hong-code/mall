package com.edu.mall.coupon.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;

/**
 * ??ҳר??????jd??ҳ?????ܶ?ר?⣬ÿ??ר???????µ?ҳ?棬չʾר????Ʒ??Ϣ??
 *
 * @author yao-hong
 * @email 18213823950@163.com
 * @date 2024-03-04 22:26:14
 */
@Data
@TableName("sms_home_subject")
public class HomeSubjectEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * id
     */
    @TableId
    private Long id;
    /**
     * ר???
     */
    private String name;
    /**
     * ר?????
     */
    private String title;
    /**
     * ר?⸱???
     */
    private String subTitle;
    /**
     * ??ʾ״̬
     */
    private Integer status;
    /**
     * ???????
     */
    private String url;
    /**
     * ???
     */
    private Integer sort;
    /**
     * ר??ͼƬ??ַ
     */
    private String img;

}
