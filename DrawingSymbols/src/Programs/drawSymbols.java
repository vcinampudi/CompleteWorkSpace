package Programs;
// https://www.sitesbay.com/java-program/java-palindrome-number
public class drawSymbols {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		
		int i,j,k;
		for(i=1; i<=5; i++)
		{
			for(j=4; j>=i; j--) {
					System.out.print(" ");
			 }
				for(k=1; k<=(2*i-1); k++) {
					System.out.print("*");
				}
		System.out.println("");
		}
		
		
		 for(i=5;i>=1;i--)
		 {
			 for(j=5;j>i;j--)
			 {
			 System.out.print(" ");
			 }
			 for(k=1;k<(i*2);k++)
			 {
			 System.out.print("*");
			 }
		 System.out.println();
		 }
		 
		 
		 for (int i=1; i<10; i += 2)
			{
			    for (int j=0; j<i; j++)
			    {
			        System.out.print("*");
			    }
			    System.out.println("");
			}
	}

}
