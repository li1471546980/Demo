package cn.hd.test;

import cn.hd.entity.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.junit.Test;

public class Demo {

    @Test
    public void fun(){
        Configuration configuration=new Configuration().configure();
        SessionFactory sessionFactory = configuration.buildSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        User user=new User();
        user.setName("李超杰");
        user.setMoney(1000);
        user.setPsd("123123");
        session.save(user);
        transaction.commit();
        session.close();
        sessionFactory.close();
    }
}

