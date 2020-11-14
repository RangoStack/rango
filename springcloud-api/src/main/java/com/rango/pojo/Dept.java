package com.rango.pojo;

import java.io.Serializable;

//序列化
public class Dept implements Serializable {

    private Integer id;
    private Integer deptno;
    private String dname;

    //标明 这个数据存在在哪个数据库 一般一个微服务对应一个数据库
    //同一个信息可能存在不同的数据库中
    private String db_source;

    public Dept() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getDeptno() {
        return deptno;
    }

    public void setDeptno(Integer deptno) {
        this.deptno = deptno;
    }

    public String getDname() {
        return dname;
    }

    public void setDname(String dname) {
        this.dname = dname;
    }

    public String getDb_source() {
        return db_source;
    }

    public void setDb_source(String db_source) {
        this.db_source = db_source;
    }

    @Override
    public String toString() {
        return "Dept{" +
                "id=" + id +
                ", deptno=" + deptno +
                ", dname='" + dname + '\'' +
                ", db_source='" + db_source + '\'' +
                '}';
    }
}
