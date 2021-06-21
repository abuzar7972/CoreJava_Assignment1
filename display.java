public class display{
	public static void main(String[] argv){
	int Is_PartTime_Present = 1;
	int Is_FullTime_Present=2;
	int Is_Absent=0;
	int EmpWagePerHours=20;
	int EmpWorkingHours=0;
	double i = Math.floor(Math.random() * 10) %3;
	int empCheck = (int) i;
		switch (empCheck)
		{
		case 1:
			System.out.println("Employee is Full time Present");
			EmpWorkingHours=8;
				break;
		case 2:
			System.out.println("Employee is Part time present");
			EmpWorkingHours=4;
				break;
		case 0:
			System.out.println("Employee is Absent");
			EmpWorkingHours=0;
				break;
		}
		int salary = EmpWagePerHours*EmpWorkingHours*20;
		System.out.println("Salary Per Month");
		System.out.println(salary);
}
}
