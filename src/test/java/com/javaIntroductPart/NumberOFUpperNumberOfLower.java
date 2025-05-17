package com.javaIntroductPart;

public class NumberOFUpperNumberOfLower {

	public static void main(String[] args) {
		
		String st="AUtomationIsBESTTestingToolInJava";
		int upper=0;
		int lower=0;
		
		for(int i=0;i<st.length();i++)
		{
			char ch=st.charAt(i);
			if(ch>=68 && ch<=90)
			{
				upper++;
			}
			else
			{
				lower++;
			}
		}
     System.out.println("no.off upper  "+upper+"   no.off lower  "+lower);
	}

}
