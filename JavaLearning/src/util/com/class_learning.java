package util.com;
import samplePkg.*;

import java.util.Scanner;

import com.sun.javafx.scene.paint.GradientUtils.Parser;

public class class_learning {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//reversWithoutReverse();
		//ReverseWithInbuildFN();
		//ternaryOperator();
		//randomenumber();
		//Arrays();
		//TwoDimentionArrays();
		//pyramid();
		//EnhancedLoop();
		
		TestClass t = new TestClass();
		//t.test();
		System.out.println(t.getClass());
		
	}
	
	public static String reversWithoutReverse() { 

		Scanner  scn = new Scanner(System.in);
		
		System.out.println("Enter a String");
		String InputString  = scn.nextLine();
		
		char[] Stringcharter = InputString.toCharArray();
		String rvstring = "";
		
		for (int i = Stringcharter.length - 1; i >= 0; i--) {
			
			rvstring =rvstring + Stringcharter[i];			
		}		
		System.out.println("After String Reverse : "+rvstring);
		
		if (InputString.equals(rvstring)) {
			System.out.println("Given String is Palendrom");
		} else {
			System.out.println("Not Palendrom");
		}
		return null;
	}
	
	
	public static void ReverseWithInbuildFN() {
		
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter a String");
		String inputstr = scn.nextLine();
		
		System.out.println("Before String Reverse : "+ inputstr);
		StringBuilder Strbldr = new StringBuilder(inputstr);
		
		System.out.println("After String Rever with String : "+Strbldr.reverse());

		
	}
	
	public static void ternaryOperator()
	{
/*		
 		* String str = "BustraliaA";
        boolean data = str.length()>=5  ? true : false ;
        System.out.println(data);*/

        /*boolean d= true;
        
        String a = (d==true? "true" : "false");
		
		System.out.println("Output is : " + a);*/
        
        /*int i = 15;
        switch (i){
        case 5: 
        	//System.out.println("i=5");
        	break;
        case 10:
        	//System.out.println("i=10");
        	break;
        default:
        	//System.out.println("i is not equal to 5 or 10");
        }
        
        System.out.println((i==5) ? "i=5":((i==10) ? "i has 10":"i is not equal to 5 or 10"));*/
    
	}
	
	public static int randomenumber()
	{
		int a = (int) (Math.random() * 3);		
		System.out.println(a);		
		return a;				
	}

	public static String Arrays()
	{
		int[] array;
		
		int[] a = new int[6];
		
		a[0]= 1;
		a[1]= 1;
		a[2]= 1;
		a[3]= 1;
		a[4]= 1;
		a[5]= 1;
		/*a[6]= 1;
		a[7]= 1;*/
		
		int[] array1 = {0,1,2,3,4,5};
		System.out.println(a.length);
		System.out.println(array1.length);
		
		
		return null;
	}

	public static String TwoDimentionArrays()
	{
		String[][] str = new String[10][10];
		
	for (int i = 0; i < str.length; i++) 
	{
			for (int j = 0; j < str[i].length; j++) {
				
				int num = (int)(Math.random()*5000);
				
				str[i][j]= String.valueOf(num) ;
			}
	}	
	System.out.println("Array Length "+str.length);
	
	for (int i = 0; i < str.length; i++) 
	{
			for (int j = 0; j < str[i].length; j++) {
				
				System.out.print("ArrayValue " +str[i][j]+"\t");
			}
			System.out.println();
	}		
		return null;
	}
	
	public static void pyramid()
	{		
		for (int outer = 1; outer <=25 ; outer++) 
		{		
			for (int inner = 0; inner < outer ; inner++) 
			{			
				System.out.print("*");
			}	
		System.out.println();
		}				
	}

	public static String EnhancedLoop()
	{
		/*int[] array1 = {0,1,2,3,4,5};
		
		for (int i:array1) 
		{
		System.out.print(i);	
		}*/		
	
		String[][] str = new String[10][10];
		
		for (int i = 0; i < str.length; i++) 
		{
				for (int j = 0; j < str[i].length; j++) {
					
					int num = (int)(Math.random()*100);
					
					str[i][j]= String.valueOf(num) ;
				}
		}	
		for(String[] x : str)
			 {
			 for (String y : x)
			 {
			 System.out.print(y + "\t");
			 }
			 System.out.println();
			 }
		return null;				
	}	
}