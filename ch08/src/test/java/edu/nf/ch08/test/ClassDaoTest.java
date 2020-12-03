package edu.nf.ch08.test;

import edu.nf.ch08.dao.ClassDao;
import edu.nf.ch08.dao.impl.ClassDaoImpl;
import edu.nf.ch08.entity.ClassInfo;
import org.junit.Test;

/**
 * @author wangl
 * @date 2020/11/11
 */
public class ClassDaoTest {

    @Test
    public void testGetClassById() {
        ClassDao dao = new ClassDaoImpl();
        ClassInfo cla = dao.getClassById(1);
        System.out.println(cla.getClassName());
        cla.getStudents().forEach(s -> System.out.println(s.getStuName()));
    }
}
