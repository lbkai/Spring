package com.testdemo.ioc.test;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

import com.testdemo.ioc.impl.PersonDemoImpl;
import com.testdemo.ioc.impl.PersonServiceImpl;

public class TestIocDemo01 {
	 @Test
	    public void testl() {
	        // 定义Spring配置文件的路径
	        String xmlPath = "applicationContext.xml";
	        String xmlPathString = "F:\\eclipseworkspace\\springDemo01\\src\\applicationContext.xml";
	        // 初始化Spring容器，加载配置文件
	        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(xmlPath);
	        /*
	         * Spring 提供了两种 IoC 容器，分别为 BeanFactory 和 ApplicationContext
	         */
	        //xmlPathString 必须写配置文件的全路径
	        //BeanFactory applicationContext = new XmlBeanFactory(new FileSystemResource(xmlPathString));
	        
	        //ApplicationContext applicationContext = new ClassPathXmlApplicationContext(xmlPath);
	        
	        //该方法须是配置文件的全路径
	       // ApplicationContext applicationContext = new FileSystemXmlApplicationContext(xmlPathString);
	        
	        // 通过容器获取personDao实例
	        PersonDemoImpl personDao = (PersonDemoImpl) applicationContext.getBean("PersonDemoImpl");
	        // 调用 personDao 的 add ()方法
	        personDao.add();
	    }
	 
	 @Test
	 public void test2() {
	     // 定义Spring配置文件的路径
	     String xmlPath = "applicationContext.xml";
	     // 初始化Spring容器，加载配置文件
	     ApplicationContext applicationContext = new ClassPathXmlApplicationContext(xmlPath);
	     // 通过容器获取personService实例
	     PersonServiceImpl personService = (PersonServiceImpl) applicationContext.getBean("personServiceImpl");
	     // 调用personService的addPerson()方法
	     personService.addPerson();
	 }
	 
}
