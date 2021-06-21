public class display{
	public static void main(String[] argv){
	int days=1;
	int salary=0;
	int EmpWagePerHours=20;
	int EmpWorkingHours=8;
		while (days <= 20)
		{
			salary += EmpWagePerHours*EmpWorkingHours;
			days = days+1;
		}
		System.out.println("Salary Per Month");
		System.out.println(salary);
}
}
