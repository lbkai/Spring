package com.testdemo.ioc.impl;

import org.springframework.stereotype.Component;


public class MyBeanFactory {
	
	public MyBeanFactory() {
        System.out.println("person3工厂实例化中");
    }
    // 创建Bean的方法
    public PersonServiceImpl createBean2() {
        return new PersonServiceImpl();
    }
	
	  // 创建Bean实例的静态工厂方法
    public static PersonDemoImpl createBean() {
        return new PersonDemoImpl();
    }
}
