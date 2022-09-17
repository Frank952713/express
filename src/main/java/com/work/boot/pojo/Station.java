package com.work.boot.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Author:WEIR
 * Date:2022/9/17 14:47
 * Description:
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Station {
    private int id;
    private String name;
    private String phone;
    private String password;
}
