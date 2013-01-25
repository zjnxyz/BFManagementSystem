package action;

import java.util.List;

import service.PaymentService;
import service.UserService;
import vo.Payment;

public class FindNamePaymentAction extends DefaultPageAction {
	
	private PaymentService paymentService;
	private int uId;
	
	
	public PaymentService getPaymentService() {
		return paymentService;
	}


	public void setPaymentService(PaymentService paymentService) {
		this.paymentService = paymentService;
	}

	public int getuId() {
		return uId;
	}


	public void setuId(int uId) {
		this.uId = uId;
	}


	@Override
	public String execute() throws Exception {
	  float pTotal=0f;
	  List<Payment> payments=this.paymentService.findName(getuId());
	  for(Payment p:payments){
		  pTotal+=p.getCash();
	  }
	  this.setCount(payments.size());
	  this.processOrder();
	  List<Payment> paymentPage=this.paymentService.findName(uId, this.getStart(), this.getPageLength());
	  this.getSession().put("findNamePayment", payments);
	  this.getSession().put("findNamePaymentPage", paymentPage);
	  this.getSession().put("pTotal", pTotal);
		  return SUCCESS;
	
	   
	}
	
	

}
