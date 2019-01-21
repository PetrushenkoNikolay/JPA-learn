package entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Employee {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int eid;
	private String ename;
	private double easalary;
	private String deg;
	
	public Employee() {
	}

	public Employee(int eid, String ename, double easalary, String deg) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.easalary = easalary;
		this.deg = deg;
	}
	
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public double getEasalary() {
		return easalary;
	}
	public void setEasalary(double easalary) {
		this.easalary = easalary;
	}
	public String getDeg() {
		return deg;
	}
	public void setDeg(String deg) {
		this.deg = deg;
	}
	@Override
	public String toString() {
		return "Employee: name="+this.ename+" salary="+this.easalary+" deg "+this.deg;
	}
	
}
