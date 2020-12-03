package edu.nf.ch04.dao;

import edu.nf.ch04.entity.Users;

import java.util.List;

/**
 * @author wangl
 * @date 2020/11/9
 */
public interface UserDao {

    /**
     * 根据id查询用户信息
     * @param uid
     * @return
     */
    Users getUserById(int uid);

    /**
     * 查询用户列表
     * @return
     */
    List<Users> listUser();
}
