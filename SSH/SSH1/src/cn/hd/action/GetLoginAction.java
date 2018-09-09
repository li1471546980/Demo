package cn.hd.action;

import cn.hd.bean.Login;
import cn.hd.service.GetLoginService;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;


public class GetLoginAction extends ActionSupport{
private GetLoginService getLoginService;
private String result;
private Login login;

    public Login getLogin() {
        return login;
    }

    public void setLogin(Login login) {
        this.login = login;
    }

    public void setGetLoginService(GetLoginService getLoginService) {
        this.getLoginService = getLoginService;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public String login(){
        System.out.println("loginAction.......");
        result= getLoginService.login(login.getId());
        return SUCCESS;
    }

}
