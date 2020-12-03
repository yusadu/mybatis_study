package edu.nf.ch07.test;

import edu.nf.ch07.dao.UserDao;
import edu.nf.ch07.dao.impl.UserDaoImpl;
import edu.nf.ch07.entity.Users;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * @author wangl
 * @date 2020/11/11
 */
public class UserDaoTest {

    @Test
    public void testAddBatch(){
        List<Users> list = new ArrayList<>();
        Users u1 = new Users("user6", 21, "13890907654");
        Users u2 = new Users("user7", 22, "13587679899");
        list.add(u1);
        list.add(u2);
        UserDao dao = new UserDaoImpl();
        dao.addBatch(list);
    }

    @Test
    public void testDelBatch(){
        int[] ids = {6, 7};
        UserDao dao = new UserDaoImpl();
        dao.delBatch(ids);
    }
}
