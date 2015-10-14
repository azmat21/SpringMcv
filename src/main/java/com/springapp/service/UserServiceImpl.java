package com.springapp.service;

import com.springapp.base.BaseDao;
import com.springapp.entity.User;
import org.springframework.stereotype.Service;

/**
 * Created by otkurbiz on 10/14/15.
 */

@Service
public class UserServiceImpl extends BaseDao<User,Integer> implements UserService{

}
