package com.kyo.admin.controller;

import com.kyo.admin.form.LoginForm;
import com.kyo.admin.service.IUserService;
import com.kyo.admin.vo.MetaVo;
import com.kyo.admin.vo.ResponseVo;
import com.kyo.admin.vo.UserVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@Slf4j
@CrossOrigin
@RestController
@RequestMapping("/api/private/v1")
public class LoginController {

    @Autowired
    private IUserService userService;

    @PostMapping("/login")
    public ResponseVo login(@Valid @RequestBody LoginForm loginForm) {
        log.info(loginForm.toString());
        return userService.login(loginForm);
    }
}
