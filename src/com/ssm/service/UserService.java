package com.ssm.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssm.dao.UserMapper;
import com.ssm.pojo.UserBean;
import com.ssm.service.IUserService;

@Service
public class UserService implements IUserService {
	   @Autowired UserMapper userDao;
	   
       public UserBean getUserById(int id) {
           return userDao.selectUserById(id);
        }
       
}
