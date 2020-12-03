package edu.nf.ch01.test;

import edu.nf.ch01.dao.UserDao;
import edu.nf.ch01.dao.impl.UserDaoImpl;
import edu.nf.ch01.entity.Users;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

/**
 * @author wangl
 * @date 2020/11/5
 */
public class UserDaoTest {

    @Test
    public void testSave() {
        Users user = new Users();
        user.setUserName("user1");
        UserDao dao = new UserDaoImpl();
        dao.save(user);
    }

    @Test
    public void testSave2(){
        Map<String, Object> map = new HashMap<>();
        //key对应映射配置文件中的#{uname}
        map.put("uname", "zhangsan");
        UserDao dao = new UserDaoImpl();
        dao.save2(map);
    }

    @Test
    public void testUpdate() {
        Users user = new Users();
        user.setUid(1);
        user.setUserName("wangl");
        UserDao dao = new UserDaoImpl();
        dao.update(user);
    }

    @Test
    public void testUpdate2(){
        UserDao dao = new UserDaoImpl();
        dao.update2("aaaaaa", 2);
    }

    @Test
    public void testDelete(){
        UserDao dao = new UserDaoImpl();
        dao.delete(1);
    }
}
