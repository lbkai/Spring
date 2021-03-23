package com.testdemo02.annotation.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;

import com.testdemo02.annotation.service.PersonService;

/**
 * 首先使用 @Controller 注解标注 PersonController 类，其写法相当于在配置文件中编写 
 * <bean id="personController"class="com.testdemo02.annotation.controller.PersonAction"/>。
 * 然后使用了 @Resource 注解标注在 personService 上，这相当于在配置文件内编写 
 * <property name="personService"ref="personService"/>。
 * 最后在其 add() 方法中调用了 personService 中的 add() 方法，并输出一句话。
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
	        personService.add(); // 调用personService中的add()方法
	        System.out.println("Controller层的add()方法执行了...");
	    }
}
