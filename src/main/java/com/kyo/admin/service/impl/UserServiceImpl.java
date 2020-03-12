package com.kyo.admin.service.impl;

import com.kyo.admin.form.LoginForm;
import com.kyo.admin.po.User;
import com.kyo.admin.repository.UserRepository;
import com.kyo.admin.service.IUserService;
import com.kyo.admin.vo.MetaVo;
import com.kyo.admin.vo.ResponseVo;
import com.kyo.admin.vo.UserVo;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.DigestUtils;

import java.nio.charset.StandardCharsets;
import java.util.UUID;

@Service
public class UserServiceImpl implements IUserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public ResponseVo login(LoginForm loginForm) {
        User user = userRepository.findUserByUsername(loginForm.getUsername());
        if(user == null){
            //用户名不存在
        }

        if(!user.getPassword().equals(DigestUtils.md5DigestAsHex(loginForm.getPassword().getBytes(StandardCharsets.UTF_8)))){
            //密码不正确
        }

        String token = UUID.randomUUID()+"";

        //生成返回data对象
        UserVo userVo = new UserVo();
        BeanUtils.copyProperties(user,userVo);
        userVo.setToken(token);

        MetaVo metaVo = new MetaVo("登录成功",200);

        return new ResponseVo(userVo,metaVo);


    }
}
