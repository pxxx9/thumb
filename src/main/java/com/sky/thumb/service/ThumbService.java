package com.sky.thumb.service;

import com.sky.thumb.domain.Thumb;
import com.baomidou.mybatisplus.extension.service.IService;
import com.sky.thumb.model.dto.thumb.DoThumbRequest;
import jakarta.servlet.http.HttpServletRequest;

/**
* @author p
* @description 针对表【thumb】的数据库操作Service
* @createDate 2025-06-20 19:10:59
*/
public interface ThumbService extends IService<Thumb> {
    /**
     * 点赞
     * @param doThumbRequest
     * @param request
     * @return {@link Boolean }
     */
    Boolean doThumb(DoThumbRequest doThumbRequest, HttpServletRequest request);
    /**
     * 取消点赞
     * @param doThumbRequest
     * @param request
     * @return {@link Boolean }
     */
    Boolean undoThumb(DoThumbRequest doThumbRequest, HttpServletRequest request);
    Boolean hasThumb(Long blogId, Long userId);

}
