package com.testdemo02.annotation.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.testdemo02.annotation.dao.PersonDao;

/**
 * 首先使用 @Service 注解将 PersonServiceImpl 类标识为 Spring 中的 Bean，其写法相当于配置文件中 
 * <bean id="personService"class="com.mengma.annotation.PersonServiceImpl"/> 的书写。

	然后使用 @Resource 注解标注在属性 personDao 上（也可标注在 personDao 的 setPersonDao() 方法上），
	这相当于配置文件中 <property name="personDao"ref="personDao"/> 的写法。
	最后在该类的 add() 方法中调用 personDao 中的 add() 方法，并输出一句话。
 * @author li_bk
 *
 */
@Service("personService")
public class PersonServiceImpl implements PersonService {

	 @Resource(name = "personDao")
	    private PersonDao personDao;
	    public PersonDao getPersonDao() {
	        return personDao;
	    }
	    
	    
	//@Resource(name = "personDao")
	public void setPersonDao(PersonDao personDao) {
			this.personDao = personDao;
		}



	@Override
	public void add() {
		// TODO Auto-generated method stub
		personDao.add();// 调用personDao中的add()方法
        System.out.println("Service层的add()方法执行了...");
	}

}
