package util.com;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class setclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Set<Integer> set = new HashSet<Integer>();
		
		set.add(1);
		set.add(2);
		set.add(2);
		set.add(5);
		set.add(6);
		set.add(10);
		set.add(10);
		
		System.out.println("Set size is  "+set.size());
		System.out.println();
		
		Iterator<Integer> iterate = set.iterator(); 
		int count =0;
		while(iterate.hasNext())
		{
			System.out.println(iterate.next());
			count ++;
		};
		
		System.out.println("Set size is  "+count);
	}
}