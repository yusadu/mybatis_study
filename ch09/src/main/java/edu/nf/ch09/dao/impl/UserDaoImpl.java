package edu.nf.ch09.dao.impl;

import edu.nf.ch09.dao.UserDao;
import edu.nf.ch09.entity.Users;
import edu.nf.ch09.util.MyBatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

/**
 * @author wangl
 * @date 2020/11/12
 */
public class UserDaoImpl implements UserDao {

    @Override
    public Users getUserById(int uid) {
        try(SqlSession sqlSession = MyBatisUtils.getSqlSession(true)){
            return sqlSession.getMapper(UserDao.class).getUserById(uid);
        }catch(RuntimeException e){
            throw e;
        }
    }

    @Override
    public Users getUserById2(int uid) {
        try(SqlSession sqlSession = MyBatisUtils.getSqlSession(true)){
            return sqlSession.getMapper(UserDao.class).getUserById2(uid);
        }catch(RuntimeException e){
            throw e;
        }
    }

    @Override
    public Users getUserById3(int uid) {
        try(SqlSession sqlSession = MyBatisUtils.getSqlSession(true)){
            return sqlSession.getMapper(UserDao.class).getUserById3(uid);
        }catch(RuntimeException e){
            throw e;
        }
    }

    @Override
    public void save(Users user) {
        try(SqlSession sqlSession = MyBatisUtils.getSqlSession(true)){
            sqlSession.getMapper(UserDao.class).save(user);
        }catch(RuntimeException e){
            throw e;
        }
    }

    @Override
    public void update(Users user) {
        try(SqlSession sqlSession = MyBatisUtils.getSqlSession(true)){
            sqlSession.getMapper(UserDao.class).update(user);
        }catch(RuntimeException e){
            throw e;
        }
    }

    @Override
    public void delete(int id) {
        try(SqlSession sqlSession = MyBatisUtils.getSqlSession(true)){
            sqlSession.getMapper(UserDao.class).delete(id);
        }catch(RuntimeException e){
            throw e;
        }
    }
}
