package javadeveloper.javadeveloper.csvs;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;
import com.opencsv.exceptions.CsvException;

import javadeveloper.javadeveloper.model.Order;

public class Csvs {



	public List<Order> csvImport(InputStream file1) throws IOException, CsvException{

		
		List<Order> listOrder= new ArrayList<>();
		
		 Long OrderId =(long) 0;
		 Double amount=(Double) 0.0;
		 String currency="";
		 String comment="";
		 long  am=(long)0;
		 
		 
		 
		 
		 
		 InputStreamReader streamReader = new InputStreamReader(file1, StandardCharsets.UTF_8);
		 BufferedReader reader = new BufferedReader(streamReader);
		 
		 int kk=0;

		 
		 for (String line; (line = reader.readLine()) != null;) {
			
			 if(kk==0) {
				 kk+=1;
				 continue;
			 }
				
			 String[] arr = line.split(","); 
			 int jj=0;
			 for ( String ss : arr) {
				    
				 if(jj==0) {
					 OrderId = (long) Integer.parseInt(ss);

					 jj+=1;
				 }
						
						
					else if(jj==1) {
						am=(long) Integer.parseInt(ss);
						amount=(double) am;
						
						jj+=1;
					}
						
					else if(jj==2) {
						currency=ss;
						
						jj+=1;
					}
						
					else {
						comment=ss;
						 jj+=1;
					}
						
				}
			 
				listOrder.add(new Order(OrderId,amount,currency,comment));
				OrderId=(long) 0;
				amount=(Double) 0.0;
				currency="";
				comment="";
				kk+=1;
		 }
		 
		 
			

		
		
		
		return listOrder;
		
	}

}
