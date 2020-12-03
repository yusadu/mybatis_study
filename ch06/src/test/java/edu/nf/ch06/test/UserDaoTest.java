package edu.nf.ch06.test;

import edu.nf.ch06.dao.UserDao;
import edu.nf.ch06.dao.impl.UserDaoImpl;
import edu.nf.ch06.entity.Users;
import org.junit.Test;

import java.util.List;

/**
 * @author wangl
 * @date 2020/11/10
 */
public class UserDaoTest {

    @Test
    public void testListUser() {
        //创建Users实例，封装页面提交的参数
        Users user = new Users();
        user.setUserName("user1");
        user.setAge(21);
        UserDao dao = new UserDaoImpl();
        List<Users> list = dao.listUser(user);
        list.forEach(u -> System.out.println(u.getUserName()));
    }

    @Test
    public void testListUser2() {
        //创建Users实例，封装页面提交的参数
        Users user = new Users();
        user.setUserName("user1");
        user.setAge(21);
        UserDao dao = new UserDaoImpl();
        List<Users> list = dao.listUser2(user);
        list.forEach(u -> System.out.println(u.getUserName()));
    }

    @Test
    public void testListUser3(){
        Integer[] uids = {1, 2, 3, 4};
        UserDao dao = new UserDaoImpl();
        List<Users> list = dao.listUser3(uids);
        list.forEach(user -> System.out.println(user.getUserName()));
    }

    @Test
    public void testUpdate(){
        Users user = new Users();
        user.setUid(1);
        user.setAge(11);
        user.setTel("1000000001");

        UserDao dao = new UserDaoImpl();
        dao.update(user);
    }
}
