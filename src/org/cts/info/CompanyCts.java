package org.cts.info;

import org.tcs.info.Company;
import org.tcs.info.EmployeeInformation;

public class CompanyCts {
	
	public void cmpID() {
		System.out.println("Company ID : 456");
	}
	public void cmpName() {
		System.out.println("Company name : CTS");
	}

	public static void main(String[] args) {
		CompanyCts c1 = new CompanyCts();
		c1.cmpID();
		c1.cmpName();
		EmployeeInformation e = new EmployeeInformation();
		e.empID();												//To Method call	
		e.empName();
		e.empDob();
		e.empEmail();
		e.empPH();
		Company c = new Company();
		c.cmpID();
		c.cmpName();
	}
}
