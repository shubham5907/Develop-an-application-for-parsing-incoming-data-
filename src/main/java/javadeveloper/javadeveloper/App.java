package javadeveloper.javadeveloper;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.text.ParseException;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;


import javadeveloper.javadeveloper.controller.Controller;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.io.ClassPathResource;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.opencsv.exceptions.CsvException;

@SpringBootApplication
public class App  implements CommandLineRunner
{
    public static void main( String[] args ) throws JsonParseException, JsonMappingException, IOException, CsvException, ParseException
    {
    	SpringApplication.run(App.class, args);
    	
		String csv=args[0];
		String json=args[1];
		
            Resource resource = new ClassPathResource(json);
            InputStream file = resource.getInputStream();
            
        	

   Resource resource1 = new ClassPathResource(csv);
            
            InputStream file1 = resource1.getInputStream();
          
            Controller ob=new Controller();

            
            System.out.print(ob.importFromcsv(file1));
            
//            
        

			
 		   System.out.print(ob.importFromJson(file));
            
            
            
            
            
         
            
    
    }

	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		

	}
}


