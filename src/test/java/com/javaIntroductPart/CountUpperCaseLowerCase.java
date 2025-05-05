package com.javaIntroductPart;

public class CountUpperCaseLowerCase {

	public static void main(String[] args) {
		 String st="WeLComeToJavaToWorLD";
		 
		 int upper=0;
		 int lower=0;
		 for(int i=0;i<st.length();i++)
		 {
			 char sh=st.charAt(i);
			 if(sh>=64 && sh<=90)
			 {
				 upper++;
			 }
			 else
			 {
				 lower++;
			 }
		 }
       System.out.println("upper letters are "+upper+"   "+"lower letters are  "+lower);
	}

}
