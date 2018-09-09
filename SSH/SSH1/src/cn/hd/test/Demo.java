package cn.hd.test;

import cn.hd.bean.Login;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class Demo {

    @Resource(name = "sessionFactory")
    private SessionFactory sessionFactory;

    public void fun(){
        Session session = sessionFactory.openSession();
        Login login = session.get(Login.class, 1);
        System.out.println(login);
    }
}
