package week1.day2;



public class findmissingnumbers {			

	private static final boolean Found = false;

	public static void main(String[] args) {
		int [] a = {1,4,3,2,6,5,7};
		int range= a.length+1;
		int missingnumber= -1;
		
		for (int i = 1; i <= range; i++) 
		{
			boolean Found = true;
		for (int j = 0; j < a.length; j++) {
			if(a[j]==i)
			{
				Found=false;
				break;
			}
		}
				if(Found)	
				{
					missingnumber = i;
				break;
	}

}
		System.out.println("The missing number is:"+"" + missingnumber);
}
}
