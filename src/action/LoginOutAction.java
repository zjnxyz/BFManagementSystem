package action;

public class LoginOutAction extends DefaultAction {

	@Override
	public String execute() throws Exception {
		
		if(this.getSession().get("user")!=null){
			this.getSession().clear();
		}
		return SUCCESS;
	}
	
	

}
