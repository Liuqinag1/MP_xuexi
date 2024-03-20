package com.example.mp_xuexi.entity;

import lombok.Data;

/**
 * ClassName: Song
 * Package: com.example.mp_xuexi.entity
 * Description:
 * @Create 2023/11/26 14:28
 * @Version 1.0
 */

@Data
public class Song {
    private String id;
    private String createUser;
    private String createTime;
    private String name;
    private String author;
    private String duration;
    private String lyric;
}
