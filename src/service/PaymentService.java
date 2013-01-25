package service;

import java.util.Date;
import java.util.List;

import vo.Payment;

public interface PaymentService {
	/*
	 * 增加消费信息信息
	 */
	public void addPayment(Payment payment);
	/*
	 * 查询所有的缴费信息
	 */
	public List<Payment> findPayment();
	/*
	 * 查询所有的缴费信息的分页方式
	 */
	public List<Payment> findPayment(int start,int length);
	
	/*
	 * 按姓名查询个人的缴费信息
	 */
	
	public List<Payment> findName(int uId);
	
	/*
	 * 分页查询个人缴费信息
	 */
	
	public List<Payment> findName(int uId,int start, int length);
	
	/*
	 * 按时间段查询缴费信息
	 */
	
    public List<Payment> searchPayment(Date startTime ,Date endTime);
}
