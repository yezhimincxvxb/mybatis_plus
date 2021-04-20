package com.yzm.optimistic_lock.entity;

import java.math.BigDecimal;

import com.baomidou.mybatisplus.annotation.*;

import java.time.LocalDateTime;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 商品表
 * </p>
 *
 * @author Yzm
 * @since 2021-04-19
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("goods")
public class Goods implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 商品名
     */
    @TableField("name")
    private String name;

    /**
     * 商品价格
     */
    @TableField("price")
    private BigDecimal price;

    /**
     * 库存
     */
    @TableField("left_num")
    private Integer leftNum;

    /**
     * 版本
     */
    @TableField("version")
    @Version
    private Integer version;

    /**
     * 更新时间
     */
    @TableField("update_date")
    private LocalDateTime updateDate;

    /**
     * 创建时间
     */
    @TableField("create_date")
    private LocalDateTime createDate;


}
