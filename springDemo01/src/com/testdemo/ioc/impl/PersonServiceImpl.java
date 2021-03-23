package com.testdemo.ioc.impl;

import com.testdemo.ioc.inter.IPersonDemo;
import com.testdemo.ioc.inter.IPersonService;

public class PersonServiceImpl implements IPersonService{
	
	private IPersonDemo ipersonDemo;
		

	public void setIpersonDemo(IPersonDemo ipersonDemo) {
		this.ipersonDemo = ipersonDemo;
	}


	@Override
	public void addPerson() {
		
		System.out.println("test");
		// TODO Auto-generated method stub
		ipersonDemo.add(); // ����PersonDao�е�add()����
        System.out.println("addPerson()ִ����...");
	}

}
