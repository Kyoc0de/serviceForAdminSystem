package com.kyo.admin.controller;

import com.kyo.admin.form.LoginForm;
import com.kyo.admin.vo.MetaVo;
import com.kyo.admin.vo.ResponseVo;
import com.kyo.admin.vo.UserVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@Slf4j
@CrossOrigin
@RestController
@RequestMapping("/api/private/v1")
public class LoginController {

    @PostMapping("/login")
    public ResponseVo login(@Valid @RequestBody LoginForm loginForm){
        log.info(loginForm.toString());

        if(loginForm.getUsername()!="admin" || loginForm.getPassword()!="123456"){
            ResponseVo<Object> response = new ResponseVo<>();
            MetaVo meta = new MetaVo();
            UserVo user = new UserVo();

            meta.setMsg("登录成功");
            meta.setStatus(200);

            user.setId(500);
            user.setRid(0);
            user.setUsername("admin");
            user.setMobile("123");
            user.setEmail("123@qq.com");
            user.setToken("BearereyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1aWQiOjUwMCwicmlkIjowLCJpYXQiOjE1MTI1NDQyOTksImV4cCI6MTUxMjYzMDY5OX0.eGrsrvwHm-tPsO9r_pxHIQ5i5L1kX9RX444uwnRGaIM");

            response.setData(user);
            response.setMeta(meta);
            return response;
        }

        ResponseVo<Object> response = new ResponseVo<>();
        MetaVo meta = new MetaVo();
        UserVo user = new UserVo();

        meta.setMsg("登录成功");
        meta.setStatus(200);

        user.setId(500);
        user.setRid(0);
        user.setUsername("admin");
        user.setMobile("123");
        user.setEmail("123@qq.com");
        user.setToken("BearereyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1aWQiOjUwMCwicmlkIjowLCJpYXQiOjE1MTI1NDQyOTksImV4cCI6MTUxMjYzMDY5OX0.eGrsrvwHm-tPsO9r_pxHIQ5i5L1kX9RX444uwnRGaIM");

        response.setData(user);
        response.setMeta(meta);
        return response;
    }
}
