package dao.impl;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import vo.User;

import dao.UserDao;

public class UserDaoImpl extends HibernateDaoSupport implements UserDao {

	public User get(String username) {
	  String HQL1="from User u where u.username=?";
     User user=(User) this.getHibernateTemplate().find(HQL1,  username).get(0);
     return user;
	}

	public User findById(int id) {
		User user=(User) this.getHibernateTemplate().get(User.class, id);
		return user;
	}

	/*
	 * (non-Javadoc)
	 * @see dao.UserDao#save(vo.User)
	 */
	public void save(User user) {
	
		this.getHibernateTemplate().save(user);		
	}

}
