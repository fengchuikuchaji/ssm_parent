package com.itheima.dao;

import com.itheima.pojo.Items;

import java.util.List;

/**
 * 包名:com.itheima.dao
 *
 * @author Leevi
 * 日期2020-09-28  09:40
 */
public interface ItemsDao {
    /***
     * 查询所有
     * @return
     */
    List<Items> findAll();

    /***
     * 保存操作
     * @param items
     * @return
     */
    int save(Items items);

    int deleteById(int id);
}
