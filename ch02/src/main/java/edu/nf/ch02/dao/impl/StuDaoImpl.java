package edu.nf.ch02.dao.impl;

import edu.nf.ch02.dao.StuDao;
import edu.nf.ch02.entity.Student;
import edu.nf.ch02.util.MybatisUtils;
import org.apache.ibatis.session.SqlSession;

import java.io.IOException;

/**
 * @author wangl
 * @date 2020/11/6
 */
public class StuDaoImpl implements StuDao {

    @Override
    public void save(Student student) {
        try(SqlSession sqlSession = MybatisUtils.getSqlSession(true)){
            sqlSession.getMapper(StuDao.class).save(student);
        }catch(RuntimeException e){
            throw e;
        }
    }

    @Override
    public void save2(Student student) {
        try(SqlSession sqlSession = MybatisUtils.getSqlSession(true)){
            sqlSession.getMapper(StuDao.class).save2(student);
        }catch(RuntimeException e){
            throw e;
        }
    }
}
