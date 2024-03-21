package com.edu.mall.product.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;

/**
 * ??Ʒ???ۻظ???ϵ
 *
 * @author yao-hong
 * @email 18213823950@163.com
 * @date 2024-03-04 15:47:40
 */
@Data
@TableName("pms_comment_replay")
public class CommentReplayEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * id
     */
    @TableId
    private Long id;
    /**
     * ????id
     */
    private Long commentId;
    /**
     * ?ظ?id
     */
    private Long replyId;

}
