package com.yzm.base.entity.vo;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * <p>
 * 用户信息表
 * </p>
 *
 * @author Yzm
 * @since 2021-04-13
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class UserVo implements Serializable {
    private static final long serialVersionUID = 1L;
    private Integer id;
    private String username;
    private String realName;
    private String password;
    private String gender;
    private String remark;
    private Boolean state;
    private Boolean deleted;
    private LocalDateTime updateDate;
    private LocalDateTime createDate;
    private String createDateUnix;
}
