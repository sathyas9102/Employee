package myproject;

public class Employee1 {
	private int Empid;
	private String Empname;
	
	public Employee1(int Empid,String Empname) {
		super();
		this.Empid=Empid;
		this.Empname=Empname;
	}

	public int getEmpid() {
		return Empid;
	}

	public void setEmpid(int empid) {
		Empid = empid;
	}

	public String getEmpname() {
		return Empname;
	}

	public void setEmpname(String empname) {
		Empname = empname;
	}
	
	

}
