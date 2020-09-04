public class EmpWageBuilder {
	public static void main(String[] args) {
		//Employee Attendance Check
		final int isFullTime = 1;
		final double randomValue = Math.floor(Math.random()*10)%2;
		if (randomValue == isFullTime){
			System.out.println("Employee is Present");
			//Calculate total wage if Employee is present
			int empWagePerHr=20;
      	int empHrs=8;
      	int empWage = empWagePerHr * empHrs;
      	System.out.println("Total Wage is " + empWage);
		}
		else{
			System.out.println("Employee is absent");
		}
	}
}
