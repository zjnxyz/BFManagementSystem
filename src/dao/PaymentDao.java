package dao;

import java.util.Date;
import java.util.List;

import vo.Payment;



public interface PaymentDao {
	/*
	 *   ���ӽɷ���Ϣ������ԱȨ��
	 */
	public void save(Payment payment);
	/*
	 * ��ѯ���еĽɷ���Ϣ
	 */
	public List<Payment> find(); 
	
	/*
	 * ��ѯ���еĽɷ���Ϣ��ҳ��ʽ
	 */
	public List<Payment> find(int start,int length); 
	
	/*
	 * ���������Ҹ��˵�ȫ���ɷ���Ϣ
	 * 
	 */
	public List<Payment> findName(int uId);
	/*
	 * ��ҳ��ѯʹ��
	 */
	public List<Payment> findName(int uId,int start, int length);
	
	/*
	 *  ��ʱ��β�ѯ�ɷ���Ϣ
	 */
	
	public List<Payment> search(Date startTime ,Date endTime);

}
