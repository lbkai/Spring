package com.testdemo02.annotation.dao;

import org.springframework.stereotype.Repository;

/**
 * ����ʹ�� @Repository ע�⽫ PersonDaoImpl ���ʶΪ Spring �е� Bean��
 * ��д���൱�������ļ��� <bean id="personDao"class="com.mengma.annotation.PersonDaoImpl"/> ����д��
 * Ȼ���� add() ���������һ�仰��������֤�Ƿ�ɹ������˸÷�����
 * @author li_bk
 *
 */
@Repository("personDao")
public class PersonDaoImpl implements PersonDao {

	@Override
	public void add() {
		// TODO Auto-generated method stub
		System.out.println("Dao���add()����ִ����...");
	}

}
