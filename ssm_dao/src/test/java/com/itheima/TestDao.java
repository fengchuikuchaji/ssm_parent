package com.itheima;

import com.itheima.dao.ItemsDao;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * 包名:com.itheima
 *
 * @author Leevi
 * 日期2020-09-28  09:47
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring-mybatis.xml")
public class TestDao {
    @Autowired
    private ItemsDao itemsDao;

    @Test
    public void testFindAll(){
        System.out.println(itemsDao.findAll());
    }
}
