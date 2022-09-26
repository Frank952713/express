package com.work.boot.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.work.boot.mapper.CourierMapper;
import com.work.boot.mapper.UserMapper;
import com.work.boot.pojo.Courier;
import com.work.boot.pojo.User;
import com.work.boot.service.CourierService;
import com.work.boot.service.UserService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Author:WEIR
 * Date:2022/9/18 11:41
 * Description:
 */
@Service
@Transactional
public class CourierServiceImpl extends ServiceImpl<CourierMapper, Courier> implements CourierService {
}
