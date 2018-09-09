package cn.hd.service;

import cn.hd.entity.User;

import java.util.List;

public interface UserService {
    String login(Integer id,String psd);
    void add(User user);
    void delete(Integer id);
    void updateUserMoney(Integer from,Integer to,Integer money);
    void getUserById(Integer id);
    List<User> getAll();
}
