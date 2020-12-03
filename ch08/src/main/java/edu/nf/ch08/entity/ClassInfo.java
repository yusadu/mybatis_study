package edu.nf.ch08.entity;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * @author wangl
 * @date 2020/11/11
 */
@Data
public class ClassInfo {
    private Integer cid;
    private String className;
    //关联学生（一对多）
    private List<Student> students = new ArrayList<>();
}
