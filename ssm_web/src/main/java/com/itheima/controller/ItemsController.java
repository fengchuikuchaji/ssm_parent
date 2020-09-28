package com.itheima.controller;

import com.itheima.pojo.Items;
import com.itheima.service.ItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * 包名:com.itheima.controller
 * @author Leevi
 * 日期2020-09-28  10:11
 */
@Controller
@RequestMapping("/items")
public class ItemsController {
    @Autowired
    private ItemsService itemsService;

    /**
     * 查询所有
     * @return
     */
    @RequestMapping(value = "/findAll")
    public String findAll(Model model){
        //集合查询
        List<Items> items = itemsService.findAll();
        //存入回显:将查询到的数据存储到request域对象中
        model.addAttribute("items",items);

        //挑战到"/WEB-INF/pages/items.jsp"
        return "items";
    }

    /***
     * 事务测试
     * 增加商品
     * @return
     */
    @RequestMapping(value = "/save")
    public String save(Items items){
        int acount =  itemsService.save(items);

        //重新查询所有: 重定向跳转到"/items/findAll"
        return "redirect:/items/findAll";
    }
}
