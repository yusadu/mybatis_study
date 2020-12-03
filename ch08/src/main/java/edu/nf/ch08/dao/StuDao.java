package edu.nf.ch08.dao;

import edu.nf.ch08.entity.Student;

/**
 * @author wangl
 * @date 2020/11/11
 */
public interface StuDao {

    /**
     * 根据id获取学生信息
     * @param id
     * @return
     */
    Student getStudentById(int id);

    /**
     * 根据id查询学生信息
     * @param id
     * @return
     */
    Student getStudentById2(int id);
}
