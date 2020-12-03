package edu.nf.ch03.dao;

import edu.nf.ch03.entity.Users;

import java.util.List;
import java.util.Map;

/**
 * @author wangl
 * @date 2020/11/9
 */
public interface UsersDao {

    /**
     * 根据ID查询用户信息
     * @param uid
     * @return
     */
    Users getUserById(int uid);

    /**
     * 根据ID查询用户信息
     * @param uid
     * @return
     */
    Map<String, Object> getUserById2(int uid);

    /**
     * 查询所有用户, 返回List<Users>
     * @return
     */
    List<Users> listUser();

    /**
     * 查询所有用户，返回List<Map<String, Object>>
     */
    List<Map<String, Object>> listUser2();

}
