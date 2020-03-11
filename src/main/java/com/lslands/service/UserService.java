package com.lslands.service;

/**
 * Created by lslands on 2020/03/02.
 */

import com.lslands.bean.User;

public interface UserService {

    User checkUser(String username,String password);
}
