package com.javaIntroductPart;

public class CountDiffererentCharsDigitsinString {

	public static void main(String[] args) {
		
		String str="a sdg 234 5jh n@#";
		
		char[] cr=str.toCharArray();
		
		int digit=0;
		
		int letter=0;
		
		int spaces=0;
		
		int other=0;
		
		for(Character charts:cr)
		{
			if(Character.isDigit(charts))
			{
				digit++;
			}
			else if(Character.isLetter(charts))
			{
				letter++;
			}
			else if(Character.isSpaceChar(charts))
			{
			spaces++;
			}
		    else
		    {
		    	other++;
		    }
		   
			}
		System.out.println("total letters "+letter+"      total digits "+digit+"     total spaces "+spaces+"    total others are "+other);
		}

	}


