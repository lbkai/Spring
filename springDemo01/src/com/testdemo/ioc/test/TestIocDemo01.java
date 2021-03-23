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
	        // ����Spring�����ļ���·��
	        String xmlPath = "applicationContext.xml";
	        String xmlPathString = "F:\\eclipseworkspace\\springDemo01\\src\\applicationContext.xml";
	        // ��ʼ��Spring���������������ļ�
	        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(xmlPath);
	        /*
	         * Spring �ṩ������ IoC �������ֱ�Ϊ BeanFactory �� ApplicationContext
	         */
	        //xmlPathString ����д�����ļ���ȫ·��
	        //BeanFactory applicationContext = new XmlBeanFactory(new FileSystemResource(xmlPathString));
	        
	        //ApplicationContext applicationContext = new ClassPathXmlApplicationContext(xmlPath);
	        
	        //�÷������������ļ���ȫ·��
	       // ApplicationContext applicationContext = new FileSystemXmlApplicationContext(xmlPathString);
	        
	        // ͨ��������ȡpersonDaoʵ��
	        PersonDemoImpl personDao = (PersonDemoImpl) applicationContext.getBean("PersonDemoImpl");
	        // ���� personDao �� add ()����
	        personDao.add();
	    }
	 
	 @Test
	 public void test2() {
	     // ����Spring�����ļ���·��
	     String xmlPath = "applicationContext.xml";
	     // ��ʼ��Spring���������������ļ�
	     ApplicationContext applicationContext = new ClassPathXmlApplicationContext(xmlPath);
	     // ͨ��������ȡpersonServiceʵ��
	     PersonServiceImpl personService = (PersonServiceImpl) applicationContext.getBean("personServiceImpl");
	     // ����personService��addPerson()����
	     personService.addPerson();
	 }
	 
}
