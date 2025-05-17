package com.javaIntroductPart;

import java.util.Arrays;

public class sortingArray {

	public static void main(String[] args) {
		 int a[]= {80,90,50,30,40,20,10};
		 System.out.println("beforesorting"+Arrays.toString(a));
		 Arrays.sort(a);
         System.out.println("Aftersorting"+Arrays.toString(a));
	}

}
