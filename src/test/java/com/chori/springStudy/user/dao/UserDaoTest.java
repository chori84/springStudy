package com.chori.springStudy.user.dao;

import com.chori.springStudy.user.domain.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({
        "classpath:spring/applicationContext-*.xml",
})
public class UserDaoTest {
    @Autowired
    UserDao userDao;

    @Test
    public void findAllTest() {
        List<User> userList = userDao.findAll();

        assertThat(userList.size(), is(1));

        userList.forEach(user -> {
            System.out.println(user.getName());
            System.out.println(user.getCompany());
            System.out.println(user.getComputer());
        });
    }
}