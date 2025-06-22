package com.sky.thumb.service;

import com.sky.thumb.domain.User;
import com.baomidou.mybatisplus.extension.service.IService;
import jakarta.servlet.http.HttpServletRequest;

/**
* @author p
* @description 针对表【user】的数据库操作Service
* @createDate 2025-06-20 19:11:03
*/
public interface UserService extends IService<User> {
    public User getLoginUser(HttpServletRequest request);
}
