package service;

import vo.User;

public interface UserService {
	
	public User userLogin(String username);
	public User findById(int id);
	
	/*
	 * 保存用户信息
	 */
    public void addUser(User user);
	
}
