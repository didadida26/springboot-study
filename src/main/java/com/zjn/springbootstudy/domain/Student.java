package com.zjn.springbootstudy.domain;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Data
@Component
@ConfigurationProperties(prefix = "student")
public class Student {
    /**
     * 学生姓名
     */
    private String username;
    /**
     * 学生年龄
     */
    private Integer age;
    /**
     * 手机号码
     */
    private String tel;
    /**
     * 个人爱好
     */
    private String[] likes;

}
