package org.tcs.info;

public class Company {
	
	public void cmpID() {
		System.out.println("Company ID : 123");
	}
	public void cmpName() {
		System.out.println("Company name : TCS");
	}
	private void cmpSoftware() {
		System.out.println("Company Software : Eclipse");
	}
	private void cmpAdd() {
		System.out.println("Company Add : Chennai");
	}
//<<<<<<< HEAD
//	
//=======
//	
//	
//>>>>>>> 43fafeab32c26613a41225eef9d064af269c9b1c
	public static void main(String[] args) {
		
		Company c = new Company();
		EmployeeInformation e = new EmployeeInformation();
		c.cmpID();
		c.cmpName();
		c.cmpSoftware();
		c.cmpAdd();
//<<<<<<< HEAD
//		
//=======
//		
//>>>>>>> 43fafeab32c26613a41225eef9d064af269c9b1c
		e.empID();												//To Method call	
		e.empName();
		e.empDob();
		e.empEmail();
		e.empPH();
	}
}
