package com.work.boot.pojo.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Author:WEIR
 * Date:2022/9/26 14:10
 * Description:供登录、注册使用的表单类
 */
@Data
@AllArgsConstructor
public class SignForm {

    private String name;
    private String password;
    private String phone;
    private int userType;
}
