/**
 * 
 */
package org.herb.simplespring.example;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * @author herb
 *
 */
public class VanillaFileReader {
	
	private StringBuilder builder = null;
	private Scanner scanner = null;
	
	/**
	 * @throws FileNotFoundException 
	 * 
	 */
	public VanillaFileReader(String fileName) throws FileNotFoundException {
		scanner = new Scanner(new File(fileName));
		builder = new StringBuilder();
	}
	
	public String read() {
		while (scanner.hasNext()) {
			builder.append(scanner.next());
			builder.append(", ");
		}
		
		return builder.substring(0, builder.length()-2);
	}
	
	

}
