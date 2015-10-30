/**
 * 
 */
package org.herb.simplespring.example;

import java.io.FileNotFoundException;
import org.herb.simplespring.example.api.FileDataReader;
import org.herb.simplespring.example.api.IReader;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author herb
 *
 */
public class DataReaderClient {
	
	private IReader reader = null;	
	private ApplicationContext ctx = null;
	
	/**
	 * 
	 */
	public DataReaderClient() {
		ctx = new ClassPathXmlApplicationContext("basic-reader-beans.xml");
	}
	
	private String fetchData() {
	    reader = (IReader) ctx.getBean("reader");
	    return reader.read();
	}


	/**
	 * @param args
	 */
	public static void main(String[] args) {
		DataReaderClient client = new DataReaderClient();
		System.out.println("Got data using no spring: " + client.fetchData());
	}

}
