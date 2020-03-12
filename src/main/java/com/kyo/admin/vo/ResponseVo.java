package com.kyo.admin.vo;

import lombok.Data;

@Data
public class ResponseVo<T> {

    private T data;

    private MetaVo meta;

    public ResponseVo(T data, MetaVo meta) {
        this.data = data;
        this.meta = meta;
    }
}
