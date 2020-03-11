package com.lslands.service.impl;

/**
 * Created by lslands on 2020/03/02.
 */

import com.lslands.bean.User;
import com.lslands.dao.UserRepository;

import com.lslands.service.UserService;
import com.lslands.util.MD5Utils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;
  /* @Autowired
   private UserMapper userMapper;*/

    @Override
    public User checkUser(String username, String password) {
        User user = userRepository.findByUsernameAndPassword(username, MD5Utils.code(password));
        return user;
    }

   /* @Override
    public User checkUser(String username, String password) {
        User user = userMapper.findByUsernameAndPassword(username, MD5Utils.code(password));
        return user;
    }*/
}
