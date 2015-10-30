/**
 * 
 */
package org.herb.simplespring.example;

import java.io.FileNotFoundException;
import java.io.FileReader;

/**
 * @author herb
 *
 */
public class VanillaDataReaderClient {
	
	private VanillaFileReader fileReader = null;	
	private String fileName = "c:/temp/somedata.txt";
	
	/**
	 * 
	 */
	public VanillaDataReaderClient() {
		try {
			fileReader = new VanillaFileReader(fileName);
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
		VanillaDataReaderClient client = new VanillaDataReaderClient();
		System.out.println("Got data using no spring: " + client.fetchData());
	}

}
