package dao;

import java.util.Date;
import java.util.List;

import vo.Payment;



public interface PaymentDao {
	/*
	 *   增加缴费信息，管理员权限
	 */
	public void save(Payment payment);
	/*
	 * 查询所有的缴费信息
	 */
	public List<Payment> find(); 
	
	/*
	 * 查询所有的缴费信息分页方式
	 */
	public List<Payment> find(int start,int length); 
	
	/*
	 * 按姓名查找个人的全部缴费信息
	 * 
	 */
	public List<Payment> findName(int uId);
	/*
	 * 分页查询使用
	 */
	public List<Payment> findName(int uId,int start, int length);
	
	/*
	 *  按时间段查询缴费信息
	 */
	
	public List<Payment> search(Date startTime ,Date endTime);

}
