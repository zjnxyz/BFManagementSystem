package dao.impl;

import java.util.Date;
import java.util.List;

import org.hibernate.Session;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;


import vo.Payment;

import dao.PaymentDao;

public class PaymentDaoImpl extends HibernateDaoSupport implements PaymentDao {

	public List<Payment> find() {
		String HQL1="from Payment p";
		List<Payment> Payments=this.getHibernateTemplate().find(HQL1);
		return Payments;
	}
	

	public void save(Payment payment) {
		this.getHibernateTemplate().save(payment);

	}

	public List<Payment> search(Date startTime, Date endTime) {
		String HQL2="from Payment p where p.paymentDate between "+startTime+" and "+endTime;
		List<Payment> payments=this.getHibernateTemplate().find(HQL2);
		return payments;
	}

	@SuppressWarnings("unchecked")
	public List<Payment> findName(int uId) {
		String HQL3="from Payment p where p.user.id=?";
		List<Payment> payments=this.getHibernateTemplate().find(HQL3,uId);
		return payments;
		
	}
	
	@SuppressWarnings("unchecked")
	public List<Payment> findName(int uId,int start, int length) {
		 String HQL3="from Payment p where p.user.id= "+uId; 
		 System.out.println("fen ye"+HQL3);
		 Session session = getSession();
		 List<Payment> payments = session.createQuery(HQL3).setFirstResult(start).setMaxResults(length).list();
	     this.releaseSession(session);
		return payments;
		
	}


	@SuppressWarnings("unchecked")
	public List<Payment> find(int start, int length) {
		String HQL3="from Payment p  "; 
		 System.out.println("fen ye"+HQL3);
		 Session session = getSession();
		 List<Payment> payments = session.createQuery(HQL3).setFirstResult(start).setMaxResults(length).list();
	     this.releaseSession(session);
		return payments;
		
	}

}
