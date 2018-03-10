package com.imooc.girl;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * @Author: lidg
 * @Date: Creat in 2018/3/10 19:27
 */
@Entity  // 表求这个类对应数据库中的一个表, JPA在启动时会自动创建或是检查它， 在application.yml中配置
public class Girl {
    @Id
    @GeneratedValue
    private Integer id;
    private String cupSize;  // cup_size in table
    private Integer age;

    // must be no-param constructor
    public Girl() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCupSize() {
        return cupSize;
    }

    public void setCupSize(String cupSize) {
        this.cupSize = cupSize;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
