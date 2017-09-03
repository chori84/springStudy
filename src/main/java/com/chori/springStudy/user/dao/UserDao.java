package com.chori.springStudy.user.dao;

import com.chori.springStudy.user.domain.User;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by chori on 2017. 7. 2..
 */
@Repository
public class UserDao {
    @Autowired
    SqlSession sqlSession;

    public List<User> findAll() {
        return sqlSession.selectList("mapper.com.chori.springStudy.userMapper.findAll");
    }
}
