package com.edu.mall.member.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * ??Ա?ȼ?
 *
 * @author yao-hong
 * @email 18213823950@163.com
 * @date 2024-03-04 22:56:21
 */
@Data
@TableName("ums_member_level")
public class MemberLevelEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * id
     */
    @TableId
    private Long id;
    /**
     * ?ȼ??
     */
    private String name;
    /**
     * ?ȼ???Ҫ?ĳɳ?ֵ
     */
    private Integer growthPoint;
    /**
     * ?Ƿ?ΪĬ?ϵȼ?[0->???ǣ?1->??]
     */
    private Integer defaultStatus;
    /**
     * ???˷ѱ?׼
     */
    private BigDecimal freeFreightPoint;
    /**
     * ÿ?????ۻ?ȡ?ĳɳ?ֵ
     */
    private Integer commentGrowthPoint;
    /**
     * ?Ƿ?????????Ȩ
     */
    private Integer priviledgeFreeFreight;
    /**
     * ?Ƿ??л?Ա?۸???Ȩ
     */
    private Integer priviledgeMemberPrice;
    /**
     * ?Ƿ?????????Ȩ
     */
    private Integer priviledgeBirthday;
    /**
     * ??ע
     */
    private String note;

}
