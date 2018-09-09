package cn.hd.dao;

import cn.hd.entity.User;

import java.util.List;

public interface UserDao {
    void add(User user);
    void delete(Integer id);
    void update(User user);
    User getUserById(Integer id);
    List<User> getAll();
}
