package edu.nf.ch04.dao.impl;

import edu.nf.ch04.dao.UserDao;
import edu.nf.ch04.entity.Users;
import edu.nf.ch04.util.MybatisUtils;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

/**
 * @author wangl
 * @date 2020/11/9
 */
public class UserDaoImpl implements UserDao {

    @Override
    public Users getUserById(int uid) {
        try(SqlSession sqlSession = MybatisUtils.getSqlSession(true)){
            return sqlSession.getMapper(UserDao.class).getUserById(uid);
        }catch(RuntimeException e){
            throw e;
        }
    }

    @Override
    public List<Users> listUser() {
        try(SqlSession sqlSession = MybatisUtils.getSqlSession(true)){
            return sqlSession.getMapper(UserDao.class).listUser();
        }catch(RuntimeException e){
            throw e;
        }
    }
}
