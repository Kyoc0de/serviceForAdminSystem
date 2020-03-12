package com.kyo.admin.vo;

import lombok.Data;

@Data
public class MetaVo {

    private String msg;

    private Integer status;

    public MetaVo(String msg, Integer status) {
        this.msg = msg;
        this.status = status;
    }

    public static MetaVo success(){
        return new MetaVo("登录成功",200);
    }
}
