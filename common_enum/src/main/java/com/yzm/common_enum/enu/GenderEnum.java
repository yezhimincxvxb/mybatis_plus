package com.yzm.common_enum.enu;

import com.baomidou.mybatisplus.annotation.EnumValue;
import com.fasterxml.jackson.annotation.JsonValue;
import lombok.Getter;

@Getter
public enum GenderEnum {

    MAN(1, "男"),
    WOMAN(0, "女");

    GenderEnum(int gender, String genderStr) {
        this.gender = gender;
        this.genderStr = genderStr;
    }

    /**
     * 标记数据库存的值
     */
    @EnumValue
    private int gender;
    @JsonValue
    private String genderStr;

    @Override
    public String toString() {
        return this.genderStr;
    }
}
