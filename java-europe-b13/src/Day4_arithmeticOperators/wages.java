package Day4_arithmeticOperators;

public class wages {

	public static void main(String[] args) {
		
		double regularWage;
		double basePay = 25;
		double regularHours = 40;
		double overTimeWage;
		double overTimePay = 37.5;
		double overTimeHours = 10;
		double totalWage;
		
		regularWage = basePay * regularHours;
		overTimeWage = overTimePay * overTimeHours;
		totalWage = regularWage+overTimeWage;
		System.out.println(totalWage);
		
		
		
		

	}

}
