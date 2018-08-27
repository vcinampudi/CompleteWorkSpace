package samplePkg;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import util.com.*;

public class TestClass 
{		
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

/*		class_learning check= new class_learning();
		
		//class_learning.reversWithoutReverse();	
		System.out.println(check);
		//System.out.println(check.hashCode());
		TestClass tc;*/
		//ifElse();
		//whileloop();
		Properties prop = new Properties();
		
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"\\src\\config\\OR.Properties");
		prop.load(fis);
		
		System.out.println(prop.getProperty("name"));
		System.out.println(System.getProperty("user.dir"));
		System.out.println(System.getProperty("os.arch"));
		System.out.println(System.getProperty("os.name"));
		System.out.println(System.getProperty("os.version"));		
	}
	
 public static void ifElse()
	{
	 
	 int num = (int) (Math.random()*20);
	 
	 if (num <10)
	 
		 System.out.println(num +" : is less than 10");
	 
	 else if(num ==10)
	 
		 System.out.println(num +" : is equal to 10");
	 
	 else
	 
		 System.out.println(num +" : is Greater than 10");
	}

 public static void whileloop()

 {
	 int i = 1;	 
	 while (i<=10) {
		System.out.println(i);
		i++;
	}
 }



}