package com.liping.bean;

import org.springframework.beans.factory.annotation.Value;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Person {

    @Value("eso")
    private String name;

    //SpEl
    //@Value("#{18+5}")
    //读取配置文件中的key和value
    @Value("${person.age}")
    private Integer age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Perosn{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public Person(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public Person() {
    }

    /**
     * 以下两个注解属于java注解的规范
     */
    //对象创建并赋值后调用
    @PostConstruct
    public void initPerson(){
        System.out.println("@PostConstruct..");
    }

    //容器移除对象之前调用
    @PreDestroy
    public void destroyPerson(){
        System.out.println("@PreDestroy...");
    }

}
