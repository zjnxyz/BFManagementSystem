/*
 * ���ѹ���action:
 * �����������������ԱȨ��
 * ��ѯȫ��������Ϣ���������ѵ��ܽ��
 * ��ʱ��β�ѯ������Ϣ��������ʱ��ε���������Ϣ
 * 
 * 
 */

package action;


import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import com.opensymphony.xwork2.ActionContext;

import service.ExpenditureService;
import service.PaymentService;
import service.UserService;
import vo.Expenditure;
import vo.PTime;
import vo.Payment;
import vo.User;

public class ExcpenditureAction extends DefaultPageAction {
	
	private Expenditure expenditure;
	private Payment payment;
	private ExpenditureService expenditureService;
	private PaymentService paymentService;
	private UserService userService;
	private PTime pTime;
	
	public UserService getUserService() {
		return userService;
	}
	public void setUserService(UserService userService) {
		this.userService = userService;
	}
	public ExpenditureService getExpenditureService() {
		return expenditureService;
	}
	public void setExpenditureService(ExpenditureService expenditureService) {
		this.expenditureService = expenditureService;
	}
	
	public Expenditure getExpenditure() {
		return expenditure;
	}
	public void setExpenditure(Expenditure expenditure) {
		this.expenditure = expenditure;
	}


	
	public PTime getpTime() {
		return pTime;
	}
	public void setpTime(PTime pTime) {
		this.pTime = pTime;
	}

	public Payment getPayment() {
		return payment;
	}
	public void setPayment(Payment payment) {
		this.payment = payment;
	}
	public PaymentService getPaymentService() {
		return paymentService;
	}
	public void setPaymentService(PaymentService paymentService) {
		this.paymentService = paymentService;
	}
	@SuppressWarnings("unchecked")
	/*
	 *  �ڲ�ѯ�ܵ�������Ϣ��ҳ������ʾ�ܵ�������Ϣ�ͽɷ���Ϣ
	 */
	public String getAllExpenditure(){
		float expenditureTotle1=0f;
		float expenditureTotle3=0f;
		/*
		 * ������Ϣ���ܽ��
		 */
		List<Expenditure>expenditures=this.expenditureService.findExpenditure();
		for(Expenditure expenditure:expenditures){
			expenditureTotle1+=expenditure.getCash();
		}
		
		this.setCount(expenditures.size());
		this.processOrder();
		List<Expenditure> expenditurePage = this.expenditureService.findExpenditure(getStart(), getPageLength());
		
		/*
		 * �ɷ���Ϣ���ܽ��
		 */
		List<Payment> payments=this.paymentService.findPayment();
		
		for(Payment payment:payments){
			expenditureTotle3+=payment.getCash();
		}
		
		this.setCount(payments.size());
		this.processOrder();
		List<Payment> paymentPage=this.paymentService.findPayment(getStart(), getPageLength());
		this.getSession().put("getAllExpenditure", expenditures);
		this.getSession().put("getAllExpenditurePage", expenditurePage);
		this.getSession().put("expenditureTotle1", expenditureTotle1);
		this.getSession().put("expenditureTotle3", expenditureTotle3);
		this.getSession().put("payments", payments);
		this.getSession().put("getAllPaymentPage", paymentPage);
		
		User user=(User) this.getSession().get("user");
		if(user.getLevel()==1){
			return "getAll1Expenditure";
		}else{
		   return "getAll2Expenditure";
		}
	}
	/*
	 * �����µ�������Ϣ
	 */
	public String saveExpenditure(){
		System.out.println("�������ˡ�������");
		this.expenditureService.addExpenditure(expenditure);
		
		return "saveExpenditure";
	}
	
	
	@SuppressWarnings("unchecked")
	public String searchExpenditure(){
		
		System.out.println("���ڰ�ʱ���ѯ");
		System.out.println(pTime.getStartTime());
		float expenditureTotle2=0f;
		List<Expenditure> expenditures=this.expenditureService.searchExpenditure(pTime.getStartTime(), pTime.getEndTime());
		for(Expenditure expenditure:expenditures){
			expenditureTotle2+=expenditure.getCash();
		}
		
		this.setCount(expenditures.size());
		this.processOrder();
		List<Expenditure> expenditurePage = this.expenditureService.searchExpenditure(pTime.getStartTime(), this.getStart(), this.getPageLength());
		
		
		User user=(User) this.getSession().get("user");
		
		this.getSession().put("searchExpenditure", expenditures);
		this.getSession().put("searchExpenditurePage", expenditurePage);
		this.getSession().put("expenditureTotle2", expenditureTotle2);
		if(user.getLevel()==1){
			
			return "search2Expenditure";
			
		}else{
			
			return "search1Expenditure";
		}
		
	}
	
	
	@SuppressWarnings("unchecked")
	public String addBuy(){
		TreeMap userSearch=new TreeMap();
		userSearch.put("1", "Ҷ���");
		userSearch.put("2", "�޽���");
		userSearch.put("3", "����");
		userSearch.put("4", "�콭�");
		userSearch.put("5", "��Ϊ��");
		userSearch.put("6", "�޳�Ⱥ");
		this.getSession().put("userSearch", userSearch);
		return "addBuy";
	}
	
	

}
