/**
 * 
 */
package org.herb.simplespring.example.service;

import org.herb.simplespring.example.api.IReader;

/**
 * @author herb
 *
 */
public class FileDataReaderService implements IReaderService {

	private IReader reader = null;
	
	
	
	/**
	 * @param reader
	 */
	public FileDataReaderService(IReader reader) {
		this.reader = reader;
	}



	public String fetchData() {
		return reader.read();
	}

	
}
