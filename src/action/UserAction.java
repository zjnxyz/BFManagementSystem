package action;

import javax.annotation.Resource;

import service.UserService;
import vo.User;


public class UserAction extends DefaultAction {
	
	
	private UserService userService;
	private String username;
	private String password;
	
	
	

	public String getUsername() {
		return username;
	}



	public void setUsername(String username) {
		this.username = username;
	}



	public String getPassword() {
		return password;
	}



	public void setPassword(String password) {
		this.password = password;
	}




	public UserService getUserService() {
		return userService;
	}




	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	


	@Override
	public String execute() throws Exception {
		User user=this.userService.userLogin(username);
		
		 if(user!=null&&user.getPassword().equals(password)){
	            this.getSession().put("user",user);
	            if(user.getLevel()==1){
	            	 return "main";
	            }else{
	            	return "index";
	            }
	           
	        }else{
	            return "fail";
	        }
	}
	

	

}
