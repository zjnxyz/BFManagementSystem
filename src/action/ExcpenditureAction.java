/*
 * 消费功能action:
 * 增加消费情况，管理员权限
 * 查询全部消费信息，包含消费的总金额
 * 按时间段查询消费信息，包含该时间段的总消费信息
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
	 *  在查询总的消费信息的页面上显示总得消费信息和缴费信息
	 */
	public String getAllExpenditure(){
		float expenditureTotle1=0f;
		float expenditureTotle3=0f;
		/*
		 * 消费信息和总金额
		 */
		List<Expenditure>expenditures=this.expenditureService.findExpenditure();
		for(Expenditure expenditure:expenditures){
			expenditureTotle1+=expenditure.getCash();
		}
		
		this.setCount(expenditures.size());
		this.processOrder();
		List<Expenditure> expenditurePage = this.expenditureService.findExpenditure(getStart(), getPageLength());
		
		/*
		 * 缴费信息和总金额
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
	 * 保存新的消费信息
	 */
	public String saveExpenditure(){
		System.out.println("到这里了。。。。");
		this.expenditureService.addExpenditure(expenditure);
		
		return "saveExpenditure";
	}
	
	
	@SuppressWarnings("unchecked")
	public String searchExpenditure(){
		
		System.out.println("我在按时间查询");
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
		userSearch.put("1", "叶汇丰");
		userSearch.put("2", "邹接明");
		userSearch.put("3", "黎奉兵");
		userSearch.put("4", "朱江楠");
		userSearch.put("5", "邱为民");
		userSearch.put("6", "罗超群");
		this.getSession().put("userSearch", userSearch);
		return "addBuy";
	}
	
	

}
