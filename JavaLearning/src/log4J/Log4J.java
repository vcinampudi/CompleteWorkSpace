package log4J;

import org.apache.log4j.*;

public class Log4J {

	final public static Logger log = Logger.getLogger(Log4J.class.getName());
	
	public static void main(String[] args) {

		BasicConfigurator.configure();
		PropertyConfigurator.configure("log4j.properties");
		Logger.getLogger("check");
		
	}
}