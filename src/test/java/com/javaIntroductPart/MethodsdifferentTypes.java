package com.javaIntroductPart;

public class MethodsdifferentTypes {
	
	void method1()
	{
		System.out.println("this is java");
	}
 String method2()
 {
	 return("this automation");
 }
 void method3(String name)
 {
	 System.out.println(" hi this is "+name);
 }
 int method4(int age)
 {
	 return(age);
 }
	public static void main(String[] args) {
		
		MethodsdifferentTypes metobj=new MethodsdifferentTypes();
		metobj.method1();
		System.out.println(metobj.method2());
		metobj.method3("ganga");
		System.out.println(metobj.method4(25));
	}

}
