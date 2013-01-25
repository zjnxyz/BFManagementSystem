package action;

import java.util.Date;

import service.PaymentService;
import service.UserService;
import vo.Payment;
import vo.User;

public class SavePaymentAction extends DefaultAction {
	
	private PaymentService paymentService;
	private UserService userService;
	private Date paymentDate;
	private float paymentCash;
	private int uId;
	public PaymentService getPaymentService() {
		return paymentService;
	}
	public void setPaymentService(PaymentService paymentService) {
		this.paymentService = paymentService;
	}
	public UserService getUserService() {
		return userService;
	}
	public void setUserService(UserService userService) {
		this.userService = userService;
	}
	public Date getPaymentDate() {
		return paymentDate;
	}
	public void setPaymentDate(Date paymentDate) {
		this.paymentDate = paymentDate;
	}
	public float getPaymentCash() {
		return paymentCash;
	}
	public void setPaymentCash(float paymentCash) {
		this.paymentCash = paymentCash;
	}
	public int getuId() {
		return uId;
	}
	public void setuId(int uId) {
		this.uId = uId;
	}
	@Override
	public String execute() throws Exception {
		User user=(User)this.userService.findById(getuId());
		Payment payment=new Payment();
		payment.setCash(getPaymentCash());
		payment.setPaymentDate(getPaymentDate());
		payment.setUser(user);
		this.paymentService.addPayment(payment);
		return "success";
	}
	
	


}
