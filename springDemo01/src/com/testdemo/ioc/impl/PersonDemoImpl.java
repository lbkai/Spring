package com.testdemo.ioc.impl;

import java.io.File;
import java.net.URL;

import com.testdemo.ioc.inter.IPersonDemo;

public class PersonDemoImpl implements IPersonDemo {

	@Override
	public void add() {
		// TODO Auto-generated method stub
		
		File f = new File(this.getClass().getResource("").getPath()+this.getClass().getSimpleName()); 
		System.out.println(f);
		
		URL xmlpath = this.getClass().getClassLoader().getResource("applicationContext.xml"); 
		System.out.println(xmlpath);
		
		System.out.println("testSpringDemo");
	}

}
