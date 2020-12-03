package edu.nf.ch06.dao;

import edu.nf.ch06.entity.Users;

import java.util.List;

/**
 * @author wangl
 * @date 2020/11/10
 */
public interface UserDao {

    /**
     * 动态条件查询（动态拼接条件）
     * @param user
     * @return
     */
    List<Users> listUser(Users user);

    /**
     * 动态条件查询（条件多选一）
     * @param user
     * @return
     */
    List<Users> listUser2(Users user);

    /**
     * 动态条件范围查询
     * @param uids
     * @return
     */
    List<Users> listUser3(Integer[] uids);

    /**
     * 动态更新字段
     * @param user
     */
    void update(Users user);
}
