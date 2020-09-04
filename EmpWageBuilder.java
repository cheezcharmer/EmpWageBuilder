public class EmpWageBuilder {
	public static void main(String[] args) {
		//Employee Attendance Check
		final int isFullTime = 1;
		final int isPartTime = 2;
		final double randomValue = Math.floor(Math.random()*10)%3;
		final int empWagePerHr=20;
		switch ((int)randomValue) {
			case 0: {
				System.out.println("Employee is Absent");
				break;
			}
			case 1: {
				System.out.println("Employee is Present");
				System.out.println("Employee is Full time");
         			int empHrs = 8;
         			int empWage = empWagePerHr * empHrs;
         			System.out.println("Total Wage is " + empWage);
				break;
			}
			case 2: {
				System.out.println("Employee is Present");
				System.out.println("Employee is Part time");
        			int empHrs = 4;
        			int empWage = empWagePerHr * empHrs;
        			System.out.println("Total Wage is " + empWage);
				break;
			}
		}
	}
}

