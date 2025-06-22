package com.sky.thumb.mapper;

import jakarta.annotation.Resource;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;


import java.util.HashMap;
import java.util.Map;

@SpringBootTest
class BlogMapperTest {
    @Resource
    private BlogMapper blogMapper;
    @Test
    void test1() {
        Map<Long, Long> blogThumbCountMap = new HashMap<>();
        blogThumbCountMap.put(1L, 1L);
        blogMapper.batchUpdateThumbCount(blogThumbCountMap);
    }
}