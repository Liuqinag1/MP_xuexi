package com.example.mp_xuexi.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.mp_xuexi.entity.Song;
import org.apache.ibatis.annotations.Mapper;

/**
 * ClassName: SongMapper
 * Package: com.example.mp_xuexi.mapper
 * Description:
 * @Create 2023/11/26 14:31
 * @Version 1.0
 */

@Mapper
public interface SongMapper extends BaseMapper<Song> {
}