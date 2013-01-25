package service.impl;

import dao.UserDao;
import service.UserService;
import vo.User;

public class UserServiceImpl implements UserService {
	private UserDao userDao;
	
	

	public UserDao getUserDao() {
		return userDao;
	}



	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}



	public User userLogin(String username) {
		User user=this.userDao.get(username);
		return user;
	}



	public User findById(int id) {
		User user=this.userDao.findById(id);
		return user;
	}


	/*
	 * (non-Javadoc)
	 * @see service.UserService#addUser(vo.User)
	 */

	public void addUser(User user) {
		this.userDao.save(user);
		
	}

}
