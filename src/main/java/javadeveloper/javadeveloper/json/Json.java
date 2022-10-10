package javadeveloper.javadeveloper.json;
import org.springframework.web.bind.annotation.RequestMapping;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import javadeveloper.javadeveloper.model.Order;

public class Json {

	
	
	
	public Order [] jsonImport(InputStream file) throws JsonParseException, JsonMappingException, IOException{
	
	ObjectMapper mapper = new ObjectMapper();
	
	




	

	Order [] clientes = mapper.readValue(file, Order[].class);

	return clientes;

   

	
	}
	

}
