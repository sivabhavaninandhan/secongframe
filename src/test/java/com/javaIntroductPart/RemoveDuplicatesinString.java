package com.javaIntroductPart;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicatesinString {

	public static void main(String[] args) {
		String str="javaprogramm";
		
		StringBuffer sb=new StringBuffer();
		
		Set<Character> set=new  LinkedHashSet<Character>();
		
		for(int i=0;i<str.length();i++)
		{
			set.add(str.charAt(i));
		}
       for(Character chr:set)
       {
    	   sb.append(chr);
       }
       
       System.out.println(sb);
	}

}
