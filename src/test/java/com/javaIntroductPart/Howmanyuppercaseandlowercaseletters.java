package com.javaIntroductPart;

public class Howmanyuppercaseandlowercaseletters {

	public static void main(String[] args) {
		
		String ss="WelcomeTo SeleNIUM automation";
		
		String lower="";
		String upper="";
		for(int i=0;i<ss.length();i++)
		{
		char chst=ss.charAt(i);
		if(chst>=64 && chst<=90)
		{
			lower=lower+chst;
		}
		else
		{
			upper=upper+chst;
		}
		}

		System.out.println(lower);
		System.out.println(upper);
	}

}
