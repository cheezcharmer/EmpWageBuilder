public class EmpWageBuilder {
	public static void main(String[] args) {
		EmpWageBuilder a = new EmpWageBuilder();
		final int empWagePerHr = 20;
		final int maxWorkingDays = 20;
		int workingDays = 0;
		int empAbsent = 0;
		int partTime = 0;
		int fullTime = 0;
		int totalEmpHours = 0;
		int empHrs = 0;
		int maxWorkingHrs = 100;
		a.empWage(empWagePerHr, maxWorkingDays, workingDays, empAbsent, partTime, fullTime, totalEmpHours, empHrs, maxWorkingHrs);
	}


		
		public void empWage(int empWagePerHr, int maxWorkingDays, int workingDays, int empAbsent, int partTime, int fullTime, int totalEmpHours, int empHrs, int maxWorkingHrs) {

			while (workingDays < maxWorkingDays && totalEmpHours < maxWorkingHrs) {
				workingDays++;
				final double randomValue = Math.floor(Math.random() * 10) % 3;
				switch ((int) randomValue) {
					case 0: {
						empHrs = 0;
						empAbsent++;
						break;
					}
					case 1: {
						empHrs = 8;
						fullTime++;
						break;
					}
					case 2: {
						empHrs = 4;
						partTime++;
						break;
					}
				}
				totalEmpHours = totalEmpHours + empHrs;
			}
			System.out.println("Employee was Present as Full Time for " + fullTime + " Days");
			System.out.println("Employee was Present as Part Time for " + partTime + " Days");
			System.out.println("Employee was Present as absent for " + empAbsent + " Days");
			System.out.println("Employee worked for a total of " + totalEmpHours + " Hours in " + workingDays + " Days");
			int empWage = totalEmpHours * empWagePerHr;
			System.out.println("Total Employee Salary for the month is " + empWage);
		}
	}
