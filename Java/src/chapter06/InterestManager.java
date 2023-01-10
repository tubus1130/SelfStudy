package chapter06;

public class InterestManager {
	public static void main(String[] args) {
		InterestManager man = new InterestManager();
		long sum = 0;
		for(int i=1; i<=365; i++) {
			sum += 1_000_000;
			sum = (long) man.calculateAmount(i, sum);
			System.out.println(i + "일째 예금액 : " + sum);
			if(i % 10 == 0) {
			}
		}
	}
	
	public double getInterestRate(int day) {
		double rate = 0;
		if(day >= 365) {
			rate = 0.056;
		}else if(day >= 181) {
			rate = 0.02;
		}else if(day >= 91) {
			rate = 0.01;
		}else if(day >= 1) {
			rate = 0.005;
		}
		
		return rate;
	}
	
	public double calculateAmount(int day, long amount) {
		double rate = getInterestRate(day);
		double interest = amount + (amount * rate);
		return interest;
	}
}
