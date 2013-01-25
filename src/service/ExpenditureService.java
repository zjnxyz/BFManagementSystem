package service;

import java.util.Date;
import java.util.List;

import vo.Expenditure;


public interface ExpenditureService {
	
	/*
	 * 增加消费信息信息
	 */
	public void addExpenditure(Expenditure expenditure);
	/*
	 * 查询所有的消费信息
	 */
	public List<Expenditure> findExpenditure();
	
	/*
	 * 查询所有消费信息的分页方式
	 */
	
	public List<Expenditure> findExpenditure(int start,int length);
	
	/*
	 * 按时间段查询消费信息
	 */
	
    public List<Expenditure> searchExpenditure(Date startTime ,Date endTime);
    
    /*
     * 按时间查询消费信息分页方式
     */
    
    public List<Expenditure> searchExpenditure(Date startTime ,int start,int length);

}
