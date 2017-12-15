package com.samplehibtest.boot;

import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.samplehibtest.init.HibernateSessionfactoryInit;
import com.samplehibtest.models.Departments;

public class Appboot {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SessionFactory sf = HibernateSessionfactoryInit.getsessionfactory();
		Session sess = sf.openSession();
		Query qu = sess.createQuery("from Departments");
		List<Departments> dep = (List<Departments>)qu.getResultList();
		dep.stream().forEach(printobjects::printdepartment);
		sess.close();
		sf.close();
	}
	
	
}

class printobjects
{
	static void printdepartment(Departments dep)
	{
		System.out.println("dep no:"+dep.getDept_no()+"...name:"+dep.getDept_name());
	}
}