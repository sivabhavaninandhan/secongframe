package com.javaIntroductPart;

public class replaceWhiteSpaces {

	public static void main(String[] args) {
		String ss1="w   e   l   co   me";
		String ss2=ss1.replaceAll("\\s", "");
		System.out.println(ss2);

	}

}
