package com.example.mp_xuexi.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.mp_xuexi.entity.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * ClassName: UserMapper
 * Package: com.example.mp_xuexi.mapper
 * Description:
 * @Create 2023/11/26 13:55
 * @Version 1.0
 */


@Mapper
public interface UserMapper extends BaseMapper<User> {
}
