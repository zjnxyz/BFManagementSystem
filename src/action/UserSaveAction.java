package action;

import service.UserService;
import vo.User;

public class UserSaveAction extends DefaultAction {
	
	private UserService userService;
	private User user;
	public UserService getUserService() {
		return userService;
	}
	public void setUserService(UserService userService) {
		this.userService = userService;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	@Override
	public String execute() throws Exception {
		this.userService.addUser(user);
		return SUCCESS;
	}
	
	

}
