package service;

import vo.User;

public interface UserService {
	
	public User userLogin(String username);
	public User findById(int id);
	
	/*
	 * �����û���Ϣ
	 */
    public void addUser(User user);
	
}
