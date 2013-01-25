/*
 * �ɷ���Ϣ��action�������Ĺ��ܣ�
 * 1������Ա��ѯ���еĽɷ���Ϣ�������ܵĽɷѽ��
 * 2���ͻ���ѯ�Լ��Ľɷ���Ϣ�������ܵýɷѽ��
 */
package action;

import java.util.Date;
import java.util.List;

import service.PaymentService;
import service.UserService;
import vo.PTime;
import vo.Payment;
import vo.User;

public class PaymentAction extends DefaultAction {
	
	private PaymentService paymentService;
	private UserService userService;
	
	
	
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

	
	@SuppressWarnings("unchecked")
	public String getAllPayment(){
		float paytotle1=0f;
		List<Payment>payments=this.paymentService.findPayment();
		for(Payment payment:payments){
			
			paytotle1+=payment.getCash();
			
		}
		this.getSession().put("getAllPayment", payments);
		this.getSession().put("paytotle1", paytotle1);
		return "getAllPayment";
	}

}
