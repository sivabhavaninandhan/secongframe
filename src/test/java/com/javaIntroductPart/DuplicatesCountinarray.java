package com.javaIntroductPart;

public class DuplicatesCountinarray {

	public static void main(String[] args) {
		
		int a[]={10,20,20,10,30,40,10,20};
		
		int dup=10;
		int count=0;
		
	 for(int x:a)
	 {
		 if(x==dup)
		 {
			 count++;
		 }
	 }
System.out.println(count);
	}

}
