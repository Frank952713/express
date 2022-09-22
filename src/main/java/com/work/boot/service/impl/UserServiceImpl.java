package com.work.boot.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.work.boot.dao.UserDao;
import com.work.boot.pojo.User;
import com.work.boot.service.UserService;
import org.springframework.stereotype.Service;

/**
 * Author:WEIR
 * Date:2022/9/18 11:41
 * Description:
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserDao, User> implements UserService {
}
