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
public class Courier {
    private int id;
    private Station station;
    private String name;
    private String phone;
    private String password;
    private String income;
}
