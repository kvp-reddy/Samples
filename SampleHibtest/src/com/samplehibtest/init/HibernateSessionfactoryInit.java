package com.samplehibtest.init;

import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class HibernateSessionfactoryInit {
	
	private static SessionFactory sf;
	
	public static SessionFactory getsessionfactory()
	{
		if(sf==null)
		{
			StandardServiceRegistry reg = new   StandardServiceRegistryBuilder()
												.configure("file:/home/vp/eclipse-workspace/SampleHibtest/dist/hibernate.cfg.xml")
												.build();
		
			sf = new MetadataSources(reg).buildMetadata().buildSessionFactory();
			
		
		}
		return sf;
	}

}
