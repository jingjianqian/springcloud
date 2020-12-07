package auth.service;

import auth.entity.User;

public interface UserSerive {


    Boolean login(User user);

    int addUser(User user);
}
