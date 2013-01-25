package service;

import java.util.Date;
import java.util.List;

import vo.Payment;

public interface PaymentService {
	/*
	 * ����������Ϣ��Ϣ
	 */
	public void addPayment(Payment payment);
	/*
	 * ��ѯ���еĽɷ���Ϣ
	 */
	public List<Payment> findPayment();
	/*
	 * ��ѯ���еĽɷ���Ϣ�ķ�ҳ��ʽ
	 */
	public List<Payment> findPayment(int start,int length);
	
	/*
	 * ��������ѯ���˵Ľɷ���Ϣ
	 */
	
	public List<Payment> findName(int uId);
	
	/*
	 * ��ҳ��ѯ���˽ɷ���Ϣ
	 */
	
	public List<Payment> findName(int uId,int start, int length);
	
	/*
	 * ��ʱ��β�ѯ�ɷ���Ϣ
	 */
	
    public List<Payment> searchPayment(Date startTime ,Date endTime);
}
