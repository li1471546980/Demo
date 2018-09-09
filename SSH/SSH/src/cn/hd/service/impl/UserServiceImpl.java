package cn.hd.service.impl;

import cn.hd.dao.UserDao;
import cn.hd.entity.User;
import cn.hd.service.UserService;

import java.util.List;

public class UserServiceImpl implements UserService {

    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public String login(Integer id, String psd) {
        System.out.println("登录成功");
        return null;
    }

    @Override
    public void add(User user) {
        userDao.add(user);
    }

    @Override
    public void delete(Integer id) {

    }

    @Override
    public void updateUserMoney(Integer from, Integer to, Integer money) {

    }

    @Override
    public void getUserById(Integer id) {
        userDao.getUserById(id);
    }

    @Override
    public List<User> getAll() {
        List<User> list = userDao.getAll();
        return list;
    }
}
