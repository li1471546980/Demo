package cn.hd.test;

import cn.hd.dao.UserDao;
import cn.hd.entity.User;
import cn.hd.service.UserService;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class Demo1 {
    @Resource(name = "sessionFactory")
    private SessionFactory sessionFactory;
    @Test
    public void fun(){
        Session session = sessionFactory.openSession();
        User user = session.get(User.class,1);
        System.out.println(user);
    }

    @Resource(name = "userDao")
    private UserDao userDao;
    @Test
    public void fun1(){
        User user = userDao.getUserById(1);
        System.out.println(user);
    }
    @Resource(name = "userService")
    private UserService userService;
    @Test
    public void fun2(){
//        User user=new User();
//        user.setName("杨东辉");
//        userService.add(user);
        userService.getUserById(1);

    }
    @Test
    public void fun3(){
        List<User> all = userService.getAll();
        System.out.println(all);
    }
}
