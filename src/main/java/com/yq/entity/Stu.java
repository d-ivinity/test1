package com.yq.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Outline:学生类
 * @Author:Y
 * @CreateTime:2020-06-15 10:17:56
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Stu {
    private Integer sid;
    private String sname;
    private Integer sage;

    private Grade grade;

}
