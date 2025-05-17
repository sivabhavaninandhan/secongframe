package com.javaIntroductPart;

public class RemoveWhitespacesInstring {

	public static void main(String[] args) {
		String ss="a   B   SDF    bnm   xzcv";
		String remove=ss.replaceAll("\\s", "");
		
		System.out.println(remove);

	}

}
