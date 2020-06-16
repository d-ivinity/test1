package com.yq.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @Outline:
 * @Author:Y
 * @CreateTime:2020-06-15 20:34:22
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Course {
    private Integer cid;
    private String cname;
    private List<Stu> stuList;
}
