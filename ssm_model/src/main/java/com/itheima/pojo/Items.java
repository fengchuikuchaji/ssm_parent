package com.itheima.pojo;

import lombok.Data;

import java.util.Date;

/**
 * 包名:com.itheima.pojo
 * @author Leevi
 * 日期2020-09-28  09:18
 */
@Data
public class Items {
    private Integer id;
    private String name;
    private Double price;
    private String pic;
    private Date createtime;
    private String detail;
}
