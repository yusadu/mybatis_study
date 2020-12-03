package edu.nf.ch02.dao;

import edu.nf.ch02.entity.Student;

/**
 * @author wangl
 * @date 2020/11/6
 */
public interface StuDao {

    /**
     * 添加学生
     * @param student
     */
    void save(Student student);

    /**
     * 添加学生
     * @param student
     */
    void save2(Student student);
}
