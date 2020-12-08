package auth.service;

import auth.entity.Role;
import auth.mapper.RoleMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import util.ResultModel;

@Service
public class RoleServiceImp implements RoleService{

    RoleMapper roleMapper;

    @Autowired
    public RoleServiceImp(RoleMapper roleMapper){
        this.roleMapper = roleMapper;
    }

    @Override
    public ResultModel list() {
        ResultModel resultModel = new ResultModel();
        resultModel.setData(roleMapper.list());
        return resultModel;
    }
}
