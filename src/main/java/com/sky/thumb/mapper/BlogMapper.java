package com.sky.thumb.mapper;

import com.sky.thumb.domain.Blog;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.annotations.Select;
import org.springframework.data.repository.query.Param;

import java.util.Map;

/**
* @author p
* @description 针对表【blog】的数据库操作Mapper
* @createDate 2025-06-20 19:10:13
* @Entity generator.domain.Blog
*/
public interface BlogMapper extends BaseMapper<Blog> {
    void batchUpdateThumbCount(@Param("countMap") Map<Long, Long> countMap);

}




