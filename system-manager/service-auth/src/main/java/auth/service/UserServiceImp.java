package auth.service;

import auth.entity.User;
import auth.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UserServiceImp implements UserSerive{

    UserMapper userMapper;

    @Autowired
    public  UserServiceImp(UserMapper userMapper){
        this.userMapper = userMapper;
    }


    @Override
    public Boolean login(User user) {
        String pw = userMapper.getUser(user.getUsername());
        if(pw.endsWith(user.getPassword())){//TODO 后续改为MD5放肆
            return true;
        }else{
            return false;
        }

    }

    @Override
    public int addUser(User user) {
        return userMapper.insert(user);
    }

}
