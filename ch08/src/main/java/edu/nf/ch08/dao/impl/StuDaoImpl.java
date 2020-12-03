package edu.nf.ch08.dao.impl;

import edu.nf.ch08.dao.StuDao;
import edu.nf.ch08.entity.Student;
import edu.nf.ch08.util.MybatisUtils;
import org.apache.ibatis.session.SqlSession;

/**
 * @author wangl
 * @date 2020/11/11
 */
public class StuDaoImpl implements StuDao {

    @Override
    public Student getStudentById(int id) {
        try(SqlSession sqlSession = MybatisUtils.getSqlSession(true)){
            return sqlSession.getMapper(StuDao.class).getStudentById(id);
        }catch(RuntimeException e){
            throw e;
        }
    }

    @Override
    public Student getStudentById2(int id) {
        try(SqlSession sqlSession = MybatisUtils.getSqlSession(true)){
            return sqlSession.getMapper(StuDao.class).getStudentById2(id);
        }catch(RuntimeException e){
            throw e;
        }
    }
}
