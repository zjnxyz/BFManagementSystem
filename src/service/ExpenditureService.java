package service;

import java.util.Date;
import java.util.List;

import vo.Expenditure;


public interface ExpenditureService {
	
	/*
	 * ����������Ϣ��Ϣ
	 */
	public void addExpenditure(Expenditure expenditure);
	/*
	 * ��ѯ���е�������Ϣ
	 */
	public List<Expenditure> findExpenditure();
	
	/*
	 * ��ѯ����������Ϣ�ķ�ҳ��ʽ
	 */
	
	public List<Expenditure> findExpenditure(int start,int length);
	
	/*
	 * ��ʱ��β�ѯ������Ϣ
	 */
	
    public List<Expenditure> searchExpenditure(Date startTime ,Date endTime);
    
    /*
     * ��ʱ���ѯ������Ϣ��ҳ��ʽ
     */
    
    public List<Expenditure> searchExpenditure(Date startTime ,int start,int length);

}
