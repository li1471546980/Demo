package cn.hd.service.impl;

import cn.hd.bean.Login;
import cn.hd.dao.LoginDao;
import cn.hd.service.GetLoginService;
import com.alibaba.fastjson.JSONObject;

public class GetLoginServiceImpl implements GetLoginService {
    private LoginDao loginDao;

    public void setLoginDao(LoginDao loginDao) {
        this.loginDao = loginDao;
    }

    @Override
    public String login(int id) {
        System.out.println("getLoginService.........");
        Login login = loginDao.login(id);
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("data",login);
        return jsonObject.toJSONString();
    }
}
