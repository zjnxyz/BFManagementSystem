package dao;

import java.util.Date;
import java.util.List;

import vo.Expenditure;

public interface ExpenditureDao {
	/*
	 *   增加消费信息，管理员权限
	 */
	public void save(Expenditure expenditure);
	/*
	 * 查询所有的消费信息
	 */
	public List<Expenditure> find(); 
	
	/*
	 * 查询所有消费信息的分页方式
	 */
	public List<Expenditure> find(int start,int length);
	
	/*
	 *  按时间段查询消费信息
	 */
	
	public List<Expenditure> search(Date startTime ,Date endTime);
	
	/*
	 *  按时间段查询消费信息分页方式
	 */
	public List<Expenditure> search(Date startTime ,int start,int length);
	

}
