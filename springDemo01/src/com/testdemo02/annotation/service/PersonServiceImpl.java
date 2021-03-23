package com.testdemo02.annotation.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.testdemo02.annotation.dao.PersonDao;

/**
 * ����ʹ�� @Service ע�⽫ PersonServiceImpl ���ʶΪ Spring �е� Bean����д���൱�������ļ��� 
 * <bean id="personService"class="com.mengma.annotation.PersonServiceImpl"/> ����д��

	Ȼ��ʹ�� @Resource ע���ע������ personDao �ϣ�Ҳ�ɱ�ע�� personDao �� setPersonDao() �����ϣ���
	���൱�������ļ��� <property name="personDao"ref="personDao"/> ��д����
	����ڸ���� add() �����е��� personDao �е� add() �����������һ�仰��
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
		personDao.add();// ����personDao�е�add()����
        System.out.println("Service���add()����ִ����...");
	}

}
