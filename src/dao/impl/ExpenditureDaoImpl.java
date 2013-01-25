package dao.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.hibernate.Session;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import vo.Expenditure;

import dao.ExpenditureDao;

public class ExpenditureDaoImpl extends HibernateDaoSupport implements
		ExpenditureDao {

	public List<Expenditure> find() {
		String HQL1="from Expenditure e ";
		List<Expenditure> expenditures=this.getHibernateTemplate().find(HQL1);
		return expenditures;
	}

	public void save(Expenditure expenditure) {
		this.getHibernateTemplate().save(expenditure);

	}

	public List<Expenditure> search(Date startTime, Date endTime) {
		String HQL2="from Expenditure e where e.cashDate > ? and e.cashDate< ?";
		String HQL4="from Expenditure e where e.cashDate > ? ";
		String HQL5="from Expenditure e where e.cashDate > ' "+startTime+"'";
		List<Date> times= new ArrayList<Date>();
		times.add(startTime);
		times.add(endTime);
		System.out.println(HQL4);
		List<Expenditure> expenditures=this.getHibernateTemplate().find(HQL4,startTime);
		return expenditures;
	}
	
	  public List get(String HQL,int start, int length) {
	        Session session = getSession();
	        List list = session.createQuery(HQL).setFirstResult(start).setMaxResults(length).list();
	        this.releaseSession(session);
	        return list;
	    }

	@SuppressWarnings("unchecked")
	public List<Expenditure> search(Date startTime, int start, int length) {
		    Session session = getSession();
		    String HQL4="from Expenditure e where e.cashDate > ? ";
		    List<Expenditure> expenditures = session.createQuery(HQL4).setFirstResult(start).setMaxResults(length).setDate(0,startTime).list();
	        this.releaseSession(session);
		    return expenditures;
	}

	public List<Expenditure> find(int start, int length) {
		    Session session = getSession();
		    String HQL6="from Expenditure e ";
		    List<Expenditure> expenditures = session.createQuery(HQL6).setFirstResult(start).setMaxResults(length).list();
	        this.releaseSession(session);
		    return expenditures;
	}

}
