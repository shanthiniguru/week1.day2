package week1.day2;

public class FindSumOfDigitsOfGivenNumber {

	public static void main(String[] args) {
		int digit = 0;
		int number = 12345;
		int num = number;
		int sum = 0;
		while (number > 0) {
			digit = number % 10;
			System.out.println(digit);
			sum = sum + digit;
			number = number / 10;
			System.out.println(number);
						
		}
		System.out.println("The sum of the digit " +num +" is " +sum);
	}

}
