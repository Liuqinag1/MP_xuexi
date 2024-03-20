package com.example.mp_xuexi;

import com.example.mp_xuexi.entity.Song;
import com.example.mp_xuexi.entity.User;
import com.example.mp_xuexi.mapper.SongMapper;
import com.example.mp_xuexi.mapper.UserMapper;
import jakarta.annotation.Resource;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
class MpXuexiApplicationTests {

    @Autowired
    private UserMapper userMapper;


    @Resource
    private SongMapper songMapper;

    @Test
    void contextLoads() {
        List<Song> songList = songMapper.selectList(null);
        songList.forEach(System.out::println);
    }

//    @Test
//    public void testSelect() {
//        // 传递null代表查询全部
//        List<User> userList = userMapper.selectList(null);
//        for (User user : userList) {
//            System.out.println(user);
//        }
//    }

//    @Test
//    public void insert() {
//        User user = new User(100L, "Ken", "0",20);
//        userMapper.insert(user);
//    }


}
