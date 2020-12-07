package auth.controller;


import auth.entity.User;
import auth.service.UserServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RequestMapping("/user")
@RestController
@CrossOrigin
public class LoginController {

    UserServiceImp userServiceImp;

    @Autowired
    public  LoginController(UserServiceImp userServiceImp){
        this.userServiceImp = userServiceImp;
    }

    @RequestMapping("token")
    public String token(){
        System.out.println("getToken");
        return "success";
    }

    @RequestMapping("/login")
    public Map valid(@RequestBody User userInfo){


        Boolean login = userServiceImp.login(userInfo);
        HashMap<String, Object> response = new HashMap<>();
        HashMap<String, Object> responseData = new HashMap<>();

        if(login){
            response.put("code",20000);
            response.put("msg","登录成功");
            responseData.put("token",1);
            response.put("data",responseData);
        }else{
            response.put("code",50000);
            response.put("msg","密码不正确!");
        }
        return response;


    }
    @RequestMapping("/info")
    public Map userInfo(@RequestParam String token){
        System.out.println("userInfo");
        HashMap<String, Object> responseInfo = new HashMap<>();
        HashMap<String, Object> responseData = new HashMap<>();
        responseData.put("roles","admin");
        responseData.put("name","Super admin");
        responseData.put("avatar","https://wpimg.wallstcn.com/f778738c-e4f8-4870-b634-56703b4acafe.gif");
        responseInfo.put("code",20000);
        responseInfo.put("msg","登录成功");
        responseInfo.put("data",responseData);
        return responseInfo;
    }

    @RequestMapping("/logout")
    public Map loginOut(){
        System.out.println("userInfo");
        HashMap<String, Object> responseInfo = new HashMap<>();
        responseInfo.put("msg","退出成功");
        responseInfo.put("code",20000);
        return responseInfo;
    }
}
