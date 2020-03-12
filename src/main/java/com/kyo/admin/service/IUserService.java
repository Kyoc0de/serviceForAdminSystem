package com.kyo.admin.service;

import com.kyo.admin.form.LoginForm;
import com.kyo.admin.vo.ResponseVo;

public interface IUserService {

    ResponseVo login(LoginForm loginForm);
}
