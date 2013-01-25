package dao;

import java.util.Date;
import java.util.List;

import vo.Expenditure;

public interface ExpenditureDao {
	/*
	 *   ����������Ϣ������ԱȨ��
	 */
	public void save(Expenditure expenditure);
	/*
	 * ��ѯ���е�������Ϣ
	 */
	public List<Expenditure> find(); 
	
	/*
	 * ��ѯ����������Ϣ�ķ�ҳ��ʽ
	 */
	public List<Expenditure> find(int start,int length);
	
	/*
	 *  ��ʱ��β�ѯ������Ϣ
	 */
	
	public List<Expenditure> search(Date startTime ,Date endTime);
	
	/*
	 *  ��ʱ��β�ѯ������Ϣ��ҳ��ʽ
	 */
	public List<Expenditure> search(Date startTime ,int start,int length);
	

}
