package com.edu.mall.member.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * ??Ա
 *
 * @author yao-hong
 * @email 18213823950@163.com
 * @date 2024-03-04 22:56:21
 */
@Data
@TableName("ums_member")
public class MemberEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * id
     */
    @TableId
    private Long id;
    /**
     * ??Ա?ȼ?id
     */
    private Long levelId;
    /**
     * ?û??
     */
    private String username;
    /**
     * ???
     */
    private String password;
    /**
     * ?ǳ
     */
    private String nickname;
    /**
     * ?ֻ????
     */
    private String mobile;
    /**
     * ???
     */
    private String email;
    /**
     * ͷ?
     */
    private String header;
    /**
     * ?Ա
     */
    private Integer gender;
    /**
     * ?
     */
    private Date birth;
    /**
     * ???ڳ??
     */
    private String city;
    /**
     * ְҵ
     */
    private String job;
    /**
     * ????ǩ?
     */
    private String sign;
    /**
     * ?û???Դ
     */
    private Integer sourceType;
    /**
     * ?
     */
    private Integer integration;
    /**
     * ?ɳ?ֵ
     */
    private Integer growth;
    /**
     * ????״̬
     */
    private Integer status;
    /**
     * ע??ʱ?
     */
    private Date createTime;

}
