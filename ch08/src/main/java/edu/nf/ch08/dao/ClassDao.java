package edu.nf.ch08.dao;

import edu.nf.ch08.entity.ClassInfo;

/**
 * @author wangl
 * @date 2020/11/11
 */
public interface ClassDao {

    /**
     * 根据id查询班级信息
     * @param id
     * @return
     */
    ClassInfo getClassById(int id);
}
