package com.edu.mall.member.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * 会员登录记录
 *
 * @author yao-hong
 */
@Data
@TableName("ums_member_login_log")
public class MemberLoginLogEntity implements Serializable {
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
     * 创建时间
     */
    private Date createTime;
    /**
     * ip
     */
    private String ip;
    /**
     * city
     */
    private String city;
    /**
     * 登录类型[1-web，2-app]
     */
    private Integer loginType;

}
