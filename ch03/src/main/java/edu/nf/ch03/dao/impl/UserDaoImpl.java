package edu.nf.ch03.dao.impl;

import edu.nf.ch03.dao.UsersDao;
import edu.nf.ch03.entity.Users;
import edu.nf.ch03.util.MyBatisUtils;
import org.apache.ibatis.session.SqlSession;

import java.util.List;
import java.util.Map;

/**
 * @author wangl
 * @date 2020/11/9
 */
public class UserDaoImpl implements UsersDao {

    @Override
    public Users getUserById(int uid) {
        try(SqlSession sqlSession = MyBatisUtils.getSqlSession(true)){
            return sqlSession.getMapper(UsersDao.class).getUserById(uid);
        }catch(RuntimeException e) {
            throw e;
        }
    }

    @Override
    public Map<String, Object> getUserById2(int uid) {
        try(SqlSession sqlSession = MyBatisUtils.getSqlSession(true)){
            return sqlSession.getMapper(UsersDao.class).getUserById2(uid);
        }catch(RuntimeException e) {
            throw e;
        }
    }

    @Override
    public List<Users> listUser() {
        try(SqlSession sqlSession = MyBatisUtils.getSqlSession(true)){
            return sqlSession.getMapper(UsersDao.class).listUser();
        }catch(RuntimeException e) {
            throw e;
        }
    }

    @Override
    public List<Map<String, Object>> listUser2() {
        try(SqlSession sqlSession = MyBatisUtils.getSqlSession(true)){
            return sqlSession.getMapper(UsersDao.class).listUser2();
        }catch(RuntimeException e) {
            throw e;
        }
    }
}
