package week1.day2;
import java.util.Arrays;
public class FindSecondHighestValueFromGivenArray {

	public static void main(String[] args) {
		int[] values = {10,20,30,70,50,90,40};
		Arrays.sort(values);
		int indexofSecondHighest = values.length-2;
		System.out.println(values[indexofSecondHighest]);

	}

}
