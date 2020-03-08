package com.kyo.admin.vo;

import lombok.Data;

@Data
public class ResponseVo<T> {

    private MetaVo meta;

    private T data;
}
