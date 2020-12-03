package edu.nf.ch05.test;

import edu.nf.ch05.dao.UserDao;
import edu.nf.ch05.dao.impl.UserDaoImpl;
import edu.nf.ch05.entity.Users;
import org.junit.Test;

import java.util.List;

/**
 * @author wangl
 * @date 2020/11/10
 */
public class UserDaoTest {

    @Test
    public void testCount(){
        UserDao dao = new UserDaoImpl();
        int count = dao.count();
        System.out.println(count);
    }

    @Test
    public void testLike(){
        UserDao dao = new UserDaoImpl();
        List<Users> list = dao.like("z");
        list.forEach(user -> System.out.println(user.getUserName()));
    }
}
