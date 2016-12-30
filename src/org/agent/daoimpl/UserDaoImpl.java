package org.agent.daoimpl;

import org.agent.dao.UserDao;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

@Repository()
public class UserDaoImpl implements UserDao{
	

	private SessionFactory sessionFactory;
	
	
}
