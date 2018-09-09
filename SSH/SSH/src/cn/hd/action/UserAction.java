package cn.hd.action;

import cn.hd.service.UserService;
import com.opensymphony.xwork2.ActionSupport;

public class UserAction extends ActionSupport {
    private UserService userService;

    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    public String login(){
        userService.login(1,"123");
        return SUCCESS;
    }

}
