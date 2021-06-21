public class display{
	public static void main(String[] argv){
	int Is_Present = 1;
	int EmpWagePerHours=20;
	int EmpWorkingHours=0;
	double empCheck = Math.floor(Math.random() * 10) %2;
		if (empCheck == Is_Present)
		{
			System.out.println("Employee is Present");
			EmpWorkingHours=8;
		}
		else
		{
			System.out.println("Employee is Abset");
			EmpWorkingHours=0;
		}
		int salary = EmpWagePerHours*EmpWorkingHours;
		System.out.println(salary);
}
}
