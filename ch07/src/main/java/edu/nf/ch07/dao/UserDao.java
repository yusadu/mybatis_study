package edu.nf.ch07.dao;

import edu.nf.ch07.entity.Users;

import java.util.List;

/**
 * @author wangl
 * @date 2020/11/11
 */
public interface UserDao {

    /**
     * 批量添加用户
     * @param user
     */
    void addBatch(List<Users> users);

    /**
     * 批量删除
     * @param ids
     */
    void delBatch(int[] ids);
}
