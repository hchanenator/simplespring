/**
 * 
 */
package org.herb.simplespring.example;

import java.io.FileNotFoundException;
import org.herb.simplespring.example.api.FileDataReader;
import org.herb.simplespring.example.api.IReader;
import org.herb.simplespring.example.service.IReaderService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author herb
 *
 */
public class DataReaderClient {
	
	private IReaderService reader = null;
	private ApplicationContext ctx = null;
	
	/**
	 * 
	 */
	public DataReaderClient() {
		ctx = new ClassPathXmlApplicationContext("basic-reader-beans.xml");
		reader = (IReaderService) ctx.getBean("readerService");
	}
	
	private String fetchData() {
	    
	    return reader.fetchData();
	}


	/**
	 * @param args
	 */
	public static void main(String[] args) {
		DataReaderClient client = new DataReaderClient();
		System.out.println("Got data using no spring: " + client.fetchData());
	}

}
