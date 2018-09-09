package cn.hd.dao.impl;

import cn.hd.bean.Login;
import cn.hd.dao.LoginDao;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.lang.Nullable;
import org.springframework.orm.hibernate5.HibernateCallback;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import sun.rmi.runtime.Log;

import javax.annotation.Resource;
import java.io.Serializable;


public class LoginDaoImpl extends HibernateDaoSupport implements LoginDao {


    @Override
    public Login login(int id) {

        System.out.println("loginDAO.......");
//        Configuration cf=new Configuration().configure();
//        SessionFactory sessionFactory = cf.buildSessionFactory();
//        Session session = sessionFactory.openSession();
//        Transaction transaction = session.beginTransaction();
//        String hql="from Login where id=?";
//        Query query = session.createQuery(hql);
//        query.setParameter(0,id);
//        Login login = (Login) query.uniqueResult();
//        transaction.commit();
//        session.close();
//        sessionFactory.close();
//        return login;
     return  this.getHibernateTemplate().execute(new HibernateCallback<Login>() {

            @Nullable
            @Override
            public Login doInHibernate(Session session) throws HibernateException {
                String hql="from Login where id=?";
                Query query = session.createQuery(hql);
                query.setParameter(0,id);
                Login login = (Login) query.uniqueResult();
                System.out.println(login);
                return login;
            }
        });
    }
}
