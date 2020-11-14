package com.rango.service;

import com.rango.pojo.Dept;

import java.util.List;

public interface DeptService {

    //增加一个部门,这里的Dept类是pom文件导入而来
    boolean addDept(Dept dept);

    //查询部门信息根据id
    Dept queryById(Integer id);

    //查询所有的部门
    List<Dept> queryAll();
}
