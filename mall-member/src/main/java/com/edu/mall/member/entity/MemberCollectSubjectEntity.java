package com.edu.mall.member.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;

/**
 * ??Ա?ղص?ר???
 *
 * @author yao-hong
 * @email 18213823950@163.com
 * @date 2024-03-04 22:56:21
 */
@Data
@TableName("ums_member_collect_subject")
public class MemberCollectSubjectEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * id
     */
    @TableId
    private Long id;
    /**
     * subject_id
     */
    private Long subjectId;
    /**
     * subject_name
     */
    private String subjectName;
    /**
     * subject_img
     */
    private String subjectImg;
    /**
     * ?url
     */
    private String subjectUrll;

}
