public class display{
	public static void main(String[] argv){
	int Is_Present = 1;
	double empCheck = Math.floor(Math.random() * 10) %2;
		if (empCheck == Is_Present)
			System.out.println("Employee is Present");
		else
			System.out.println("Employee is Abset");
}
}
