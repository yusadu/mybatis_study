package edu.nf.ch02.test;

import edu.nf.ch02.dao.StuDao;
import edu.nf.ch02.dao.impl.StuDaoImpl;
import edu.nf.ch02.entity.Student;
import edu.nf.ch02.entity.Users;
import edu.nf.ch02.util.UUIDUtils;
import org.junit.Test;

/**
 * @author wangl
 * @date 2020/11/6
 */
public class StuDaoTest {

    @Test
    public void testSave() {
        Student stu = new Student();
        stu.setStuName("user2");
        StuDao dao = new StuDaoImpl();
        dao.save(stu);
        System.out.println(stu.getStuId());
        System.out.println(stu.getStuName());
    }

    @Test
    public void testSave2(){
        Student stu = new Student();
        //在程序中生成uuid
        stu.setStuId(UUIDUtils.createUUID());
        stu.setStuName("user3");
        StuDao dao = new StuDaoImpl();
        dao.save2(stu);
    }
}
