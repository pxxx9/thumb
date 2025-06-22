package com.sky.thumb.service;

import com.sky.thumb.domain.Blog;
import com.baomidou.mybatisplus.extension.service.IService;
import com.sky.thumb.model.vo.BlogVO;
import jakarta.servlet.http.HttpServletRequest;

import java.util.List;

/**
* @author p
* @description 针对表【blog】的数据库操作Service
* @createDate 2025-06-20 19:10:13
*/
public interface BlogService extends IService<Blog> {
    public BlogVO getBlogVOById(long blogId, HttpServletRequest request);
    List<BlogVO> getBlogVOList(List<Blog> blogList, HttpServletRequest request);

}


