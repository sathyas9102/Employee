package myproject;

public class main1 extends Employee1{
	
	public main1(int Empid,String Empname) {
		super(Empid,Empname);
	}
	
	public static void main(String[]args) {
		manager m1=new manager(101,"sathya","IT");
		
		m1.display();
		
		Technician t1=new Technician (102,"priya","JAVA");
		t1.display();
	}

}
