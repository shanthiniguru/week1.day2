package week1.day2;

public class FindGivenNumberIsPrimeNumber {

	public static void main(String[] args) {
		int input = 7;
		boolean flag = false;
		
		for (int i = 2; i <= input/2; i++) {
			if (input % i == 0) {
				flag = true;
				break;
			}
		}
		
		if (flag == true) {
			System.out.println("The Given Number " +input +" is not a Prime Number");
		}
			else {
				System.out.println("The Given Number " +input +" is a Prime Number");	
			}
			
		
	}

}
