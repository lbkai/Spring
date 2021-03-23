package com.testdemo02.annotation.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.testdemo02.annotation.controller.PersonController;

public class AnnotationTest {
	@Test
    public void test() {
        // ����Spring�����ļ�·��
        String xmlPath = "com/testdemo02/annotation/applicationContext.xml";
        // ��ʼ��Spring���������������ļ�������bean����ʵ����
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(xmlPath);
        // ���personActionʵ��
        PersonController personController = (PersonController) applicationContext
                .getBean("personController");
        // ����personAction�е�add()����
        personController.add();
    }
}
