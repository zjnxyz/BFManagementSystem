package vo;

import java.io.Serializable;
import java.util.Date;

public class Expenditure implements Serializable{
	
	private int id;
	private float cash;  // ���ѽ��
	private Date cashDate;  //��������
	private String matter; //��������
	private User user;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public float getCash() {
		return cash;
	}
	public void setCash(float cash) {
		this.cash = cash;
	}
	public Date getCashDate() {
		return cashDate;
	}
	public void setCashDate(Date cashDate) {
		this.cashDate = cashDate;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public String getMatter() {
		return matter;
	}
	public void setMatter(String matter) {
		this.matter = matter;
	}
	
	
	
	

}
