package com.javaIntroductPart;

import java.util.LinkedHashSet;
import java.util.Set;

public class CountDuplicatess {

	public static void main(String[] args) {
		   String str="javaprogramming";
		   
		   StringBuffer sb=new StringBuffer();
		   
		   Set<Character> set=new LinkedHashSet<Character>();
		   
		   for(int i=0;i<str.length();i++)
		   {
			   set.add(str.charAt(i));
		   }
          for(Character ch:set)
          {
        	  sb.append(ch);
          }
          
          System.out.println(sb);
	}

}
