package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="user33_tbl")
public class User {
	
	@Id
	@Column(name="id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int uid;
	@Column(name="name")
	private String uname;
	@Column(name="pass")
	private String upass;
	@Column(name="salary")
	private double salary;
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getUpass() {
		return upass;
	}
	public void setUpass(String upass) {
		this.upass = upass;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public User(int uid, String uname, String upass, double salary) {
		super();
		this.uid = uid;
		this.uname = uname;
		this.upass = upass;
		this.salary = salary;
	}
	
	public User( String uname, String upass, double salary) {
		super();
		this.uname = uname;
		this.upass = upass;
		this.salary = salary;
	}
	
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "User [uid=" + uid + ", uname=" + uname + ", upass=" + upass + ", salary=" + salary + "]";
	}
	
	

}
