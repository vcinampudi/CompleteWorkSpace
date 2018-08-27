package samplePkg;

public class Hound extends Dog {
 
	public void sniff(){
        System.out.println("From Hound  Cls sniff mtd");
    }
	
	@Override
	public void bark(){
        System.out.println("from Hound Cls bark mtd");
    }
    
}