package chapter05;

public class SalaryManager {
	public static void main(String[] args) {
		SalaryManager salary = new SalaryManager();
		System.out.println(salary.getMonthlySalary(20_000_000));
		
	}
	
	public double getMonthlySalary(int yearlySalary) {
		double monthlySalary = yearlySalary / 12.0;
		double incomeTax = calculateTax(monthlySalary);
		double nationalPension = calculateNationalPension(monthlySalary);
		double healthInsurance = calculateHealthInsurance(monthlySalary);
		double totalTax = incomeTax + nationalPension + healthInsurance;
		monthlySalary -= totalTax;
		
		return monthlySalary;
	}
	
	public double calculateTax(double monthSalary) {
		double incomeTax = monthSalary * 0.125;
		System.out.println("근로소득세 : " + incomeTax);
		return incomeTax;
	}
	
	public double calculateNationalPension(double monthSalary) {
		double nationalPension = monthSalary * 0.081;
		System.out.println("국민연금 : " + nationalPension);
		return nationalPension;
	}
	
	public double calculateHealthInsurance(double monthSalary) {
		double healthInsurance = monthSalary * 0.135;
		System.out.println("건강보험료 : " + healthInsurance);
		return healthInsurance;
	}
}
