package samplePkg;
import java.util.Scanner;
public class ClassB extends ClassA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*ClassA a = new ClassA();
		
		a.msg();*/
		
		//ClassB b = new ClassB();
		
	//	b.msg();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Data");
		
		String input = sc.nextLine();
		/*long nm = Integer.parseInt(input);*/
		
		System.out.println(input.getClass().getName());
		
		/*try {
			
			int given_input = Integer.parseInt(input);
			
			System.out.println(input.getClass().getName());
			
			if ( (int) input ==  ) {
				
			} else {

			}
			
		} catch (Exception e) {
			// TODO: handle exception
		}*/
		

		
		/*for (int x = 2; x <= 10; x++ )
		{
		if (x % 2 != 0) //continue;
		System.out.println("Even numbers " + x);
		}*/

	}
	
	void msg() {System.out.println("Message Calling from Class B"+"\r"+"Test");}

}
