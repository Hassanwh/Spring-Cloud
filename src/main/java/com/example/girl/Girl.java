package com.example.girl;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * @author:    wh
 * @since:     5.0
 * //自动创建表  类名 变量名 一一对应
 */
@Entity
public class Girl implements Serializable {

    @Id
    @GeneratedValue
    /**
     * @Id
     * @GeneratedValue  自增注解
     */
    private Integer id;

    private String cupSize;

    private Integer age;

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
