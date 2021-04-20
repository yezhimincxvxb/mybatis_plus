package com.yzm.safety_protection.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableLogic;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 用户信息表
 * </p>
 *
 * @author Yzm
 * @since 2021-04-16
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("user")
public class User implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 用户名
     */
    @TableField("username")
    private String username;

    /**
     * 真实姓名
     */
    @TableField("real_name")
    private String realName;

    /**
     * 登录密码
     */
    @TableField("password")
    private String password;

    /**
     * 性别[0-女，1-男]
     */
    @TableField("gender")
    private String gender;

    /**
     * 备注
     */
    @TableField("remark")
    private String remark;

    /**
     * 状态[0-冻结，1-正常]
     */
    @TableField("state")
    private Boolean state;

    /**
     * 删除状态[0-未删除，1-已删除]
     */
    @TableField("deleted")
    @TableLogic
    private Boolean deleted;

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

    /**
     * 创建时间戳
     */
    @TableField("create_date_unix")
    private String createDateUnix;


}
