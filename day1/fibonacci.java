package week1.day1;

public class fibonacci {

	public static void main(String[] args) {
		
		int n =7;
		int firstvalue = 0 , secondvalue = 1;
		System.out.println("Fibonacci series:" + n + "terms:");
		for (int i = 0; i <= n; i++) 
		{
		System.out.println(firstvalue +" ");
		int newvalue = firstvalue + secondvalue;
		firstvalue = secondvalue;
		secondvalue = newvalue;
		}
		
		

	}

}
