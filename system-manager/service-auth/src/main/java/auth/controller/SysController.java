package auth.controller;

import auth.constant.Constants;
import auth.service.RoleServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import util.ResultModel;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RequestMapping("/role")
@RestController
@CrossOrigin
public class SysController {

    RoleServiceImp roleServiceImp;

    @Autowired
    public SysController(RoleServiceImp roleServiceImp){
        this.roleServiceImp = roleServiceImp;
    }

    @RequestMapping("/list")
    public ResultModel roleList(){
        ResultModel rm = roleServiceImp.list();
        rm.setCode(Constants.CODE_SUCCESS);
        rm.setMsg("ojbk");
        System.out.println(rm);
        return rm;
    }
}
