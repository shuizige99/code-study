package com.atguigu.gmall.controller;

import gmall.bean.UserAddress;
import gmall.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

@Controller
public class OrderController {
    @Resource
    OrderService orderService;
    @ResponseBody
    @RequestMapping("/initOrder")
    public List<UserAddress>initOrder(@RequestParam("uid") String uid){
        return orderService.initOrder(uid);
    }
}
