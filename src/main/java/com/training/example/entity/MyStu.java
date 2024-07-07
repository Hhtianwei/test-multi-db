package com.training.example.entity;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@Entity(name = "my_stu")//这里的名字就是 数据库表里的名字，
public class MyStu {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Integer id;

    private String name;//这些不用加@Column，则使用默认的配置， 字符串 255， 数据库字段名与java字段名一样。
    private LocalDateTime createTime;

}