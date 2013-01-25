package vo;

import java.util.HashSet;
import java.util.Set;

public class User {
	
	private int id;
	private String username;
	private String password;
	private int level;
	private Set<Payment> payments=new HashSet<Payment>();
	private Set<Expenditure> expenditures=new HashSet<Expenditure>();
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = level;
	}
	public Set<Payment> getPayments() {
		return payments;
	}
	public void setPayments(Set<Payment> payments) {
		this.payments = payments;
	}
	public Set<Expenditure> getExpenditures() {
		return expenditures;
	}
	public void setExpenditures(Set<Expenditure> expenditures) {
		this.expenditures = expenditures;
	}
	
	

}
