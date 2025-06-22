package com.sky.thumb.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.sky.thumb.constant.UserConstant;
import com.sky.thumb.domain.User;
import com.sky.thumb.service.UserService;
import com.sky.thumb.mapper.UserMapper;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Service;

/**
* @author p
* @description 针对表【user】的数据库操作Service实现
* @createDate 2025-06-20 19:11:03
*/
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User>
    implements UserService {
    @Override
    public User getLoginUser(HttpServletRequest request) {
        return (User) request.getSession().getAttribute(UserConstant.LOGIN_USER);
    }

}




