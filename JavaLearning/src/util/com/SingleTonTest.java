package util.com;

public class SingleTonTest {

	
private static SingleTonTest instance = new SingleTonTest();
	
	
	private SingleTonTest() {
		
		System.out.println("Called SingleTonTest Method");
	}

	public static SingleTonTest getinstance() {
	
	return instance;
		
	}

}