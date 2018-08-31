package com.capgemini.day4.domain;

public class Employee {
	private long employeeid;
	private String employeeName;
	private String employeeAddress;
	private double basicSalary;
	private int employeephone;
	
	
	public final  double specialAllowance=250.80;
	public final double hra=1000.50;
	public Employee()
	{
		super();
	}
	public Employee(long id,String Name,String address,int phone)
	{
		this();
		this.employeeid=id;
		this.employeeName=Name;
		this.employeeAddress=address;
		this.employeephone=phone;
	}
	public void caluculateSalary(double basicSalary)
	{
		double salary;
		salary=basicSalary + ( basicSalary * specialAllowance/100) + ( basicSalary * hra/100); 
		System.out.println("Salary of an employee is:"+salary);
	}
	
}
