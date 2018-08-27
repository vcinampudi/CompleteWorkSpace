package fileHandling;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class txtFileHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	    String inputfilePath = "G:/Venkaiah/Personal/Learning/Selenium Projects WorkSpace/Practice Files/Append Text To A File.txt"; 
		
        FileWriter fileWriter = null;
         
        BufferedWriter bufferedWriter = null;
         
        PrintWriter printWriter = null;
         
        try
        {
            //Opening a file in append mode using FileWriter
             
            fileWriter = new FileWriter(inputfilePath, true);
             
            //Wrapping FileWriter object in BufferedWriter
             
            bufferedWriter = new BufferedWriter(fileWriter);
             
            //Wrapping BufferedWriter object in PrintWriter
             
            printWriter = new PrintWriter(bufferedWriter);
             
            //Bringing cursor to next line
             
            printWriter.println();
             
            //Writing text to file
             
            printWriter.println("Venkatesh : 789546");
             
            printWriter.println("Daniel : 874566");
             
            printWriter.println("Shankar : 789546");
             
            System.out.println("Done");
        } 
        catch (IOException e)
        {
            e.printStackTrace();
        }
        finally
        {
            //Closing the resources
             
            try
            {
                printWriter.close();
                bufferedWriter.close();
                fileWriter.close();
            }
            catch (IOException e)
            {
                e.printStackTrace();
            }
        }			
	}
}