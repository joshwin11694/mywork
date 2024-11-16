package week1.day2;

import java.util.Iterator;

public class palindrome {

	public static void main(String[] args) {
		int num = 1331;
		int originalnumber=num;
		int reversednumber =0;
		for (; num > 0; num /=10) 
		{
		int digit = num %10;
		reversednumber = reversednumber * 10 + digit;
		
		}
		if(originalnumber == reversednumber)
		{
			System.out.println(originalnumber +" "+"is a palindrome");
		}
		else {
			System.out.println(originalnumber +" "+"is not a palindrome");
		}
	}

}
