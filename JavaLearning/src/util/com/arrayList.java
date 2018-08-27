package util.com;

import java.util.ArrayList;

public class arrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> mylist = new ArrayList<String>();
		
		mylist.add("Check");
		mylist.add("Check");
		mylist.add("Test");
		mylist.add("Car");
		mylist.add("Bus");
		System.out.println("Array Size is "+ mylist.size());
		for (int i = 0; i < mylist.size(); i++) {
		
			System.out.println(mylist.get(i));
		}		
		
		
	}

}
