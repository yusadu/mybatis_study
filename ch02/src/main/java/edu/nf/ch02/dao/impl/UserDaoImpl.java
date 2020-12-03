package edu.nf.ch02.dao.impl;

import edu.nf.ch02.dao.UserDao;
import edu.nf.ch02.entity.Users;
import edu.nf.ch02.util.MybatisUtils;
import org.apache.ibatis.session.SqlSession;

/**
 * @author wangl
 * @date 2020/11/6
 */
public class UserDaoImpl implements UserDao {

    @Override
    public void save(Users user) {
        try(SqlSession sqlSession = MybatisUtils.getSqlSession(true)){
            sqlSession.getMapper(UserDao.class).save(user);
        }catch(RuntimeException e){
            throw e;
        }
    }
}
