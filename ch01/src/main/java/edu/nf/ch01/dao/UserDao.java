package edu.nf.ch01.dao;

import edu.nf.ch01.entity.Users;

import java.util.Map;

/**
 * @author wangl
 * @date 2020/11/5
 */
public interface UserDao {

    /**
     * 添加用户
     * @param user
     */
    void save(Users user);

    /**
     * 添加2
     * @param map
     */
    void save2(Map<String, Object> map);

    /**
     * 更新用户
     * @param user
     */
    void update(Users user);

    /**
     * 更新2
     * @param userName
     * @param uid
     */
    void update2(String userName, int uid);

    /**
     * 删除用户
     * @param uid
     */
    void delete(int uid);
}
