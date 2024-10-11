package com.example.template.module.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.template.module.domain.dto.auth.LoginByAccountDTO;
import com.example.template.module.domain.dto.auth.RegisterByAccountDTO;
import com.example.template.module.domain.entity.User;
import com.example.template.module.domain.vo.auth.LoginVO;

/**
* @author hzh
* @description 针对表【user(用户表)】的数据库操作Service
* @createDate 2024-10-04 20:52:02
*/
public interface AuthService extends IService<User> {

    void registerByAccount(RegisterByAccountDTO registerByAccountDTO);

    LoginVO loginByAccount(LoginByAccountDTO loginByAccountDTO);
}