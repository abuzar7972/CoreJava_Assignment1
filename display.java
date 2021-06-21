public class display{
	public static void main(String[] argv){
	int Is_PartTime_Present = 1;
	int Is_FullTime_Present=2;
	int Is_Absent=0;
	int EmpWagePerHours=20;
	int EmpWorkingHours=0;
	double empCheck = Math.floor(Math.random() * 10) %3;
		if (empCheck == Is_FullTime_Present)
		{
			System.out.println("Employee is Full time Present");
			EmpWorkingHours=8;
		}
		if ( empCheck == Is_PartTime_Present )
		{
			System.out.println("Employee is Part time present");
			EmpWorkingHours=4;
		}
		if ( empCheck == Is_Absent)
		{
			System.out.println("Employee is Absent");
			EmpWorkingHours=0;
		}
		int salary = EmpWagePerHours*EmpWorkingHours;
		System.out.println(salary);
}
}
