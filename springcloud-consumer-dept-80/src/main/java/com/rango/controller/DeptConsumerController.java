package com.rango.controller;

import com.rango.pojo.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
public class DeptConsumerController {

    //已经放入到springIOC中 注入 赋值
    @Autowired
    private RestTemplate restTemplate; //提供多种边界访问远程http服务方法

    //设置常量 服务端前缀
    private static final String REST_URL_PREFIX = "http://localhost:8001";

    //http://localhost:8001/dept/list 要去这个地址 获取服务

    @RequestMapping("/consumer/dept/add")
    public boolean add(Dept dept) {
        return restTemplate.postForObject(REST_URL_PREFIX+"/dept/add",dept,Boolean.class);
    }

    @RequestMapping("/consumer/dept/list")
    public List<Dept> queryAll() {
        return restTemplate.getForObject(REST_URL_PREFIX+"/dept/list",List.class);
    }

    @RequestMapping("/consumer/dept/get/{id}")
    public Dept getDept(@PathVariable("id") Integer id) {
        return restTemplate.getForObject(REST_URL_PREFIX+"/dept/get/"+id,Dept.class);
    }




}
