package com.kyo.admin.vo;

import lombok.Data;

@Data
public class UserVo {

    private Long id;

    private Long rid;

    private String username;

    private String mobile;

    private String email;

    private String token;

}
