package com.javaIntroductPart;

public class countingDuplicatesInArray {

	public static void main(String[] args) {
		
		int a[]= {10,20,10,10,20,10,10,40};
		int num=10;
		int count=0;
		
		for(int x:a)
		{
			if(x==num)
			{
				count++;
			}
		}
    System.out.println("the total duplicates are "+count++);
	}

}
