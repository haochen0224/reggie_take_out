package com.itheima.reggie.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.itheima.reggie.entity.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * @Author Hao Chen
 * @Create 2022/7/15 14:22
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {
}
