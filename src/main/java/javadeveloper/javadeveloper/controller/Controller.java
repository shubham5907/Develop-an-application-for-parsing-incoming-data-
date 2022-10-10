package javadeveloper.javadeveloper.controller;
import javadeveloper.javadeveloper.model.Order;

import java.io.IOException;
import java.io.InputStream;
import java.text.ParseException;
import java.util.*;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.opencsv.exceptions.CsvException;

import javadeveloper.javadeveloper.csvs.Csvs;

import javadeveloper.javadeveloper.json.Json;
import javadeveloper.javadeveloper.model.Order;

public class Controller {
	

	public String importFromJson(InputStream file) throws JsonParseException, JsonMappingException, IOException, ParseException {
		Json jsonImporter=new Json();
		Order[] ss = jsonImporter.jsonImport(file);
		int line=1;
		
		for (Order cs:ss)
		{
			System.out.println("{"+"id"+":"+Order.id+","+"orderId"+":"+cs.getOrderId()+","+"amount"+":"+cs.getAmount()+","
					  +"comment"+":"+cs.getComment()+","+"filename"+":"+"Orders2.json"+","+"line"+":"+line+","+"result"+":"+"OK"+"}");
					   		Order.id+=1;
					         line+=1;
		}
		return "";
	}
	public String importFromcsv(InputStream file) throws IOException, CsvException {
		Csvs csvImporter=new Csvs();
		List<Order> listOrder= csvImporter.csvImport(file);
		
			int line=1;
			  for (Order cs : listOrder) {
			   		System.out.println("{"+"id"+":"+Order.id+","+"orderId"+":"+cs.getOrderId()+","+"amount"+":"+cs.getAmount()+","
			  +"comment"+":"+cs.getComment()+","+"filename"+":"+"Orders1.csv"+","+"line"+":"+line+","+"result"+":"+"OK"+"}");
			   		Order.id+=1;
			         line+=1;
			     }
		
		
		return "";
	}
	


}
