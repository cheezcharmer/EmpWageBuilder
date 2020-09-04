public class EmpWageBuilder {
	public static void main(String[] args) {
	//Employee Attendance Check
	final int isFullTime = 1;
	final int isPartTime = 2;
	final double randomValue = Math.floor(Math.random()*10)%3;
	if (randomValue == isFullTime || randomValue == isPartTime ){
		System.out.println("Employee is Present");
		//Calculate total wage if Employee is present
		int empWagePerHr=20;
		if ( randomValue == isFullTime ){
		//Calculate Wage for Full Time Employee
			System.out.println("Employee is Full time");
      			int empHrs = 8;
			int empWage = empWagePerHr * empHrs;
         		System.out.println("Total Wage is " + empWage);
		}
		else if ( randomValue == isPartTime ){
			//Calculate wage for part time employee
			System.out.println("Employee is Part time");
			int empHrs = 4;
			int empWage = empWagePerHr * empHrs;
         		System.out.println("Total Wage is " + empWage);
		}
	}
	else{
		System.out.println("Employee is absent");
	}
	}
}
