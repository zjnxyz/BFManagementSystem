package service.impl;

import java.util.Date;
import java.util.List;

import dao.ExpenditureDao;

import service.ExpenditureService;
import vo.Expenditure;


public class ExpenditureServiceImpl implements ExpenditureService {
	
	private ExpenditureDao expenditureDao;
	
	

	public ExpenditureDao getExpenditureDao() {
		return expenditureDao;
	}

	public void setExpenditureDao(ExpenditureDao expenditureDao) {
		this.expenditureDao = expenditureDao;
	}

	public void addExpenditure(Expenditure expenditure) {
		this.expenditureDao.save(expenditure);
		
	}

	public List<Expenditure> findExpenditure() {
		List<Expenditure> expenditures=this.expenditureDao.find();
		return expenditures;
	}

	public List<Expenditure> searchExpenditure(Date startTime, Date endTime) {
		List<Expenditure> expenditures=this.expenditureDao.search(startTime, endTime);
		return expenditures;
	}

	public List<Expenditure> searchExpenditure(Date startTime, int start,
			int length) {
		List<Expenditure> expenditures = this.expenditureDao.search(startTime, start, length);
		return expenditures;
	}

	public List<Expenditure> findExpenditure(int start, int length) {
		List<Expenditure> expenditures = this.expenditureDao.find(start, length);
		return expenditures;
	}



}
