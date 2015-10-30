/**
 * 
 */
package org.herb.simplespring.example;

import java.io.FileNotFoundException;
import org.herb.simplespring.example.api.FileDataReader;
import org.herb.simplespring.example.api.IReader;

/**
 * @author herb
 *
 */
public class DataReaderClient {
	
	private IReader fileReader = null;	
	private String fileName = "c:/temp/somedata.txt";
	
	/**
	 * 
	 */
	public DataReaderClient() {
		try {
			fileReader = new FileDataReader(fileName);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("Exception: " + e.getMessage());
		}
	}
	
	private String fetchData() {
	    return fileReader.read();
	}


	/**
	 * @param args
	 */
	public static void main(String[] args) {
		DataReaderClient client = new DataReaderClient();
		System.out.println("Got data using no spring: " + client.fetchData());
	}

}
