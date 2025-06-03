package com.javaIntroductPart;

public class CountDifferentCharactersInGivenString {

	public static void main(String[] args) {
		
		String str="asd  fgh  ert  12345 @#$%";
		
		int digit=0;
		
		int letter=0;
		
		int spaces=0;
		
		int others=0;
		
		char[] chrs=str.toCharArray();
		
		for(Character cars:chrs)
		{
			if(Character.isDigit(cars))
			{
				digit++;
			}
			else if(Character.isLetter(cars))
			{
				letter++;
			}
			else if(Character.isSpace(cars))
			{
				spaces++;
			}
			else
			{
				others++;
			}
	}
		
		System.out.println("total digitd "+digit+"  total letters "+letter+"    total spaces "+spaces+"  total others "+others);

}
}