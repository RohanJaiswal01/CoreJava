package java8;

import java.util.Arrays;

public class ParelalSort {
	
	public static void main(String[] args) {
		
		int[] arr = {5,6,8,2,14,3,57,85,23};
		Arrays.parallelSort(arr);
		
		for(int a:arr) {
			System.out.println(a);
		}
	}

}
