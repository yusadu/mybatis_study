package edu.nf.ch04.test;

import edu.nf.ch04.dao.UserDao;
import edu.nf.ch04.dao.impl.UserDaoImpl;
import edu.nf.ch04.entity.Users;
import org.junit.Test;

import java.util.List;

/**
 * @author wangl
 * @date 2020/11/9
 */
public class UserDaoTest {

    @Test
    public void testGetUserById() {
        UserDao dao = new UserDaoImpl();
        Users user = dao.getUserById(3);
        System.out.println(user.getUserName());
    }

    @Test
    public void testListUser() {
        UserDao dao = new UserDaoImpl();
        List<Users> list = dao.listUser();
        list.forEach(user -> System.out.println(user.getUserName()));
    }
}
