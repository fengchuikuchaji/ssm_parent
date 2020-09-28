package com.itheima.service;

import com.itheima.pojo.Items;

import java.util.List;

/**
 * 包名:com.itheima.service
 *
 * @author Leevi
 * 日期2020-09-28  09:54
 */
public interface ItemsService {
    List<Items> findAll();
    int save(Items items);
}
