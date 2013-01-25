package service.impl;

import java.util.Date;
import java.util.List;

import dao.PaymentDao;

import service.PaymentService;
import vo.Payment;

public class PaymentServiceImpl implements PaymentService {
	private PaymentDao paymentDao;
	
	

	public PaymentDao getPaymentDao() {
		return paymentDao;
	}

	public void setPaymentDao(PaymentDao paymentDao) {
		this.paymentDao = paymentDao;
	}

	public void addPayment(Payment payment) {
		this.paymentDao.save(payment);

	}

	public List<Payment> findPayment() {
		List<Payment> payments=this.paymentDao.find();
		return payments;
	}

	public List<Payment> searchPayment(Date startTime, Date endTime) {
		List<Payment> payments=this.paymentDao.search(startTime, endTime);
		return payments;
	}

	public List<Payment> findName(int uId) {
		List<Payment> payments=this.paymentDao.findName(uId);
		
		return payments;
	}

	public List<Payment> findName(int uId,int start, int length) {
		List<Payment> payments=this.paymentDao.findName(uId, start, length);
		return payments;
	}

	public List<Payment> findPayment(int start, int length) {
		List<Payment> payments=this.paymentDao.find(start, length);
		return payments;
	}
}
