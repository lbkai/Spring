package com.testdemo02.annotation.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;

import com.testdemo02.annotation.service.PersonService;

/**
 * ����ʹ�� @Controller ע���ע PersonController �࣬��д���൱���������ļ��б�д 
 * <bean id="personController"class="com.testdemo02.annotation.controller.PersonAction"/>��
 * Ȼ��ʹ���� @Resource ע���ע�� personService �ϣ����൱���������ļ��ڱ�д 
 * <property name="personService"ref="personService"/>��
 * ������� add() �����е����� personService �е� add() �����������һ�仰��
 * @author li_bk
 *
 */

@Controller("personController")
public class PersonController {
	 @Resource(name = "personService")
	    private PersonService personService;
	 
	    public PersonService getPersonService() {
	        return personService;
	    }
	    
	    
	    
	    public void setPersonService(PersonService personService) {
			this.personService = personService;
		}



		public void add() {
	        personService.add(); // ����personService�е�add()����
	        System.out.println("Controller���add()����ִ����...");
	    }
}
