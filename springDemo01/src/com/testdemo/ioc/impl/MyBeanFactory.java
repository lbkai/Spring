package com.testdemo.ioc.impl;

import org.springframework.stereotype.Component;


public class MyBeanFactory {
	
	public MyBeanFactory() {
        System.out.println("person3����ʵ������");
    }
    // ����Bean�ķ���
    public PersonServiceImpl createBean2() {
        return new PersonServiceImpl();
    }
	
	  // ����Beanʵ���ľ�̬��������
    public static PersonDemoImpl createBean() {
        return new PersonDemoImpl();
    }
}
