package edu.nf.ch06.dao.impl;

import edu.nf.ch06.dao.UserDao;
import edu.nf.ch06.entity.Users;
import edu.nf.ch06.util.MybatisUtils;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

/**
 * @author wangl
 * @date 2020/11/10
 */
public class UserDaoImpl implements UserDao {

    @Override
    public List<Users> listUser(Users user) {
        try(SqlSession sqlSession = MybatisUtils.getSqlSession(true)){
            return sqlSession.getMapper(UserDao.class).listUser(user);
        }catch(RuntimeException e){
            throw e;
        }
    }

    @Override
    public List<Users> listUser2(Users user) {
        try(SqlSession sqlSession = MybatisUtils.getSqlSession(true)){
            return sqlSession.getMapper(UserDao.class).listUser2(user);
        }catch(RuntimeException e){
            throw e;
        }
    }

    @Override
    public List<Users> listUser3(Integer[] uids) {
        try(SqlSession sqlSession = MybatisUtils.getSqlSession(true)){
            return sqlSession.getMapper(UserDao.class).listUser3(uids);
        }catch(RuntimeException e){
            throw e;
        }
    }

    @Override
    public void update(Users user) {
        try(SqlSession sqlSession = MybatisUtils.getSqlSession(true)){
            sqlSession.getMapper(UserDao.class).update(user);
        }catch(RuntimeException e){
            throw e;
        }
    }
}
