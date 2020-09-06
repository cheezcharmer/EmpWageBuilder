import java.util.*;

interface empWageCalculator {
		int empWage(int empWagePerHr, int maxWorkingDays, int workingDays, int empAbsent, int partTime, int fullTime, int totalEmpHours, int empHrs, int maxWorkingHrs, String company);
	}

	public class EmpWageBuilder implements empWageCalculator {

		public static void main(String[] args) {

			EmpWageBuilder a = new EmpWageBuilder();

			int workingDays = 0;

			int empAbsent = 0;
			int partTime = 0;
			int fullTime = 0;

			int totalEmpHours = 0;
			int empHrs = 0;

			List<Integer> wages = new ArrayList<>();

			String company1 = "Microsoft";
			String company2 = "Tesla";
			String company3 = "SpaceX";
			//Storing all wages in array
			wages.add(0, a.empWage(20, 26, workingDays, empAbsent, partTime, fullTime, totalEmpHours, empHrs, 100, company1));
			wages.add(1, a.empWage(30, 24, workingDays, empAbsent, partTime, fullTime, totalEmpHours, empHrs, 150, company2));
			wages.add(2, a.empWage(25, 28, workingDays, empAbsent, partTime, fullTime, totalEmpHours, empHrs, 200, company3));
			//Printing all stored wages
			System.out.println("Total Wages for month for " + company1 + " are " + wages.get(0));
			System.out.println("Total Wages for month for " + company2 + " are " + wages.get(1));
			System.out.println("Total Wages for month for " + company3 + " are " + wages.get(2));
		}


		@Override
		public int empWage(int empWagePerHr, int maxWorkingDays, int workingDays, int empAbsent, int partTime, int fullTime, int totalEmpHours, int empHrs, int maxWorkingHrs, String company) {
			//Calculating work hours until maximum work days and hours are reached
			while (workingDays < maxWorkingDays && totalEmpHours < maxWorkingHrs) {
				workingDays++;
				final double randomValue = Math.floor(Math.random() * 10) % 3;
				switch ((int) randomValue) {
					//if employee is absent
					case 0: {
						empHrs = 0;
						empAbsent++;
						break;
					}
					//if employee is present and full time
					case 1: {
						empHrs = 8;
						fullTime++;
						break;
					}
					//if employee is present and part time
					case 2: {
						empHrs = 4;
						partTime++;
						break;
					}
				}
				//calculating total hours given by the employee
				totalEmpHours = totalEmpHours + empHrs;
			}

			System.out.println("Employee data for " + company);
			System.out.println("Employee was Present as Full Time for " + fullTime + " Days");

			System.out.println("Employee was Present as Part Time for " + partTime + " Days");

			System.out.println("Employee was absent for " + empAbsent + " Days");

			System.out.println("Employee worked for a total of " + totalEmpHours + " Hours in " + workingDays + " Days");
			// Calculating total wage of employee
			int empWage = totalEmpHours * empWagePerHr;
			System.out.println("Total Employee Salary for the month is " + empWage);

			System.out.println();
			return (empWage);
		}
	}

