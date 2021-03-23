package com.testdemo02.annotation.dao;

import org.springframework.stereotype.Repository;

/**
 * 首先使用 @Repository 注解将 PersonDaoImpl 类标识为 Spring 中的 Bean，
 * 其写法相当于配置文件中 <bean id="personDao"class="com.mengma.annotation.PersonDaoImpl"/> 的书写。
 * 然后在 add() 方法中输出一句话，用于验证是否成功调用了该方法。
 * @author li_bk
 *
 */
@Repository("personDao")
public class PersonDaoImpl implements PersonDao {

	@Override
	public void add() {
		// TODO Auto-generated method stub
		System.out.println("Dao层的add()方法执行了...");
	}

}
