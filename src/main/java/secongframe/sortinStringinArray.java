package secongframe;

import java.util.Arrays;

public class sortinStringinArray {

	public static void main(String[] args) {
		
		String ss[]= {"zebra","xerox","monkey","nest","cat","ant"};
		System.out.println("before sorting "+Arrays.toString(ss));
		
		Arrays.sort(ss);
     System.out.println("after sorting "+Arrays.toString(ss));
	}

}
