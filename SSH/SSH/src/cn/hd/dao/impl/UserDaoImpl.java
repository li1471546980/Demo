package cn.hd.dao.impl;

import cn.hd.dao.UserDao;
import cn.hd.entity.User;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.lang.Nullable;
import org.springframework.orm.hibernate5.HibernateCallback;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

import java.util.List;

public class UserDaoImpl extends HibernateDaoSupport implements UserDao {

    @Override
    public void add(User user) {
        HibernateTemplate ht = getHibernateTemplate();
        ht.save(user);
    }

    @Override
    public void delete(Integer id) {

    }

    @Override
    public void update(User user) {

    }

    @Override
     public User getUserById(Integer id) {
        User user = getHibernateTemplate().get(User.class, 1);
        user.setName("李超杰");
        return user;
    }

    @Override
    public List<User> getAll() {
      return  this.getHibernateTemplate().execute(new HibernateCallback<List<User>>() {
            @Nullable
            @Override
            public List<User> doInHibernate(Session session) throws HibernateException {
                String hql=" from User";
                Query query = session.createQuery(hql);
                List<User> list = query.list();
                return list;
            }
        });
    }
}
