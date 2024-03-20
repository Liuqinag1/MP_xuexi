package com.example.mp_xuexi.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


/**
 * ClassName: User
 * Package: com.example.mp_xuexi.domain.po
 * Description:
 * @Create 2023/11/25 16:37
 * @Version 1.0
 */


@AllArgsConstructor
@NoArgsConstructor
@Data
public class User {
    private Long id;
    private String name;
    private String sex;
    private Integer age;
    private String birthday;

    public User(long l, String ken, String number, int i) {
    }
}
