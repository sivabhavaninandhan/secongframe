package com.javaIntroductPart;

public class countDifferentLettersDigitInString {

	public static void main(String[] args) {
		
		String str="asdfgh   xcvb   nm1234  54#@$%";
		
		char[] chr=str.toCharArray();
		
		int digit=0;
		int letter=0;
		int spaces=0;
		int others=0;
		
		for(Character cat:chr)
		{
			if(Character.isDigit(cat))
			{
				digit++;
			}
			else if(Character.isLetter(cat))
			{
				letter++;
			}
			else if(Character.isSpaceChar(cat))
			{
				spaces++;
			}
			else
			{
				others++;
			}
		}
     System.out.println("totoa digits "+digit+"total letters "+letter+" total spaces "+spaces+" total others "+others);
	}

}
