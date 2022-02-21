package week1.day2;

import net.bytebuddy.asm.Advice.OffsetMapping.Target.ForArray;

public class FindIntersectionOfAnArray {

	public static void main(String[] args) {
		int[] fir = {3,2,11,4,6,7};	
		int[] sec = {1,2,8,4,9,7};
		System.out.println("The intersection of an array: ");
		for (int i = 0; i < fir.length; i++) {
				for (int j = 0; j < sec.length; j++) {
					if (fir[i] == sec[j]) {
						System.out.println(fir[i]);
						
					}
				}
			
		}

	}

}
