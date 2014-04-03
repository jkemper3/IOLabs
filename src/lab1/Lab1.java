

package lab1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author jkemper3
 */
public class Lab1 {
    public static void main(String[] args) {
        File data = new File("src/lab1.txt");              
	  		
	
        BufferedReader in = null;
        List<String> fileContents = new ArrayList<String>();
       
        try {
	   in = new BufferedReader(new FileReader(data));
	   String line = in.readLine();
	   while(line != null){
               fileContents.add(line);
             
		  line = in.readLine();  // strips out any carriage return chars
	     String s = fileContents.get(1);
		  System.out.println();
           }
        } catch(IOException ioe) {
            System.out.println("Houston, we have a problem! reading this file");
        } finally {
            try {
                in.close();
            } catch(Exception e) {
                
            }
        }
        
   
    } 
} 

    
