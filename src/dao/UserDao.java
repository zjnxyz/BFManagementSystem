package dao;

import vo.User;

public interface UserDao {
	
	public User get(String username);
	public User findById(int id);
	
	/*
	 * �����û�
	 */
	
	public void save(User user);
	
	

}
