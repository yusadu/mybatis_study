package edu.nf.ch08.dao.impl;

import edu.nf.ch08.dao.ClassDao;
import edu.nf.ch08.entity.ClassInfo;
import edu.nf.ch08.util.MybatisUtils;
import org.apache.ibatis.session.SqlSession;

/**
 * @author wangl
 * @date 2020/11/11
 */
public class ClassDaoImpl implements ClassDao {

    @Override
    public ClassInfo getClassById(int id) {
        try(SqlSession sqlSession = MybatisUtils.getSqlSession(true)){
            return sqlSession.getMapper(ClassDao.class).getClassById(id);
        }catch(RuntimeException e){
            throw e;
        }
    }
}
