package comi;

public class Employee {
	long empID, empPhone;
	String empName,empAddress;
	double basicSal;
	static double specialAllowance = 250.80;
	static double Hra = 1000.50;
	Employee(long id, String Name,String Address, long Phone)
	{
		id = empID;
		Name = empName;
		Address = empAddress;
		Phone = empPhone;
	}
	void calcSalary()

	{
		Double sal = basicSal + (basicSal * specialAllowance / 100) + (basicSal * Hra /100  );
	}
}
