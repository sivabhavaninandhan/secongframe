package com.javaIntroductPart;

public class CounthowmanyAlphabets {

	public static void main(String[] args) {
		
		String ss="Welcome TO Selenium Atomation Testing";
		String upper=" ";
		String lower=" ";
		
		for(int i=0;i<ss.length();i++)
		{
			char ch=ss.charAt(i);
			if(ch>=68 && ch<=90)
			{
				upper=upper+ch;
			}
			else
			{
				lower=lower+ch;
			}
		}
		System.out.println("upper cahrs "+upper+"    lower  "+lower);

	}

}
