package util.com;

import java.util.Hashtable;
import java.util.Iterator;

public class hashTablecls {

	public static void main(String[] args) {

		Hashtable<String, Integer> ht = new Hashtable<String, Integer>();

		ht.put("Test 1", 2);
		ht.put("Test 2", 2);
		ht.put("Test 3", 3);
		ht.put("Test 4", 4);
		ht.put("Test 5", 5);
		ht.put("Test 6", 6);
		ht.put("Test 7", 7);
		
		System.out.println("Hash Table Size before a key remove "+ht.size());
		ht.remove("Test 6");
		System.out.println(ht.containsKey("Test 6")?" Test 6 key present in has table ": "No Test 6 key present in has table");
		
		
		System.out.println("Hash Table Size after a key removed "+ht.size());
	}

}
