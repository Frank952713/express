package com.work.boot.pojo.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Author:WEIR
 * Date:2022/9/26 14:10
 * Description:
 */
@Data
@AllArgsConstructor
public class SignForm {

    private String name;
    private String password;
    private String phone;

}
