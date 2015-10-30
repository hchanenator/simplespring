/**
 * 
 */
package org.herb.simplespring.example;

import org.herb.simplespring.example.model.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author herb
 *
 */
public class PersonClient {
	
	private ApplicationContext ctx = null;
	private Person person = null;
	
	public PersonClient() {
		ctx = new ClassPathXmlApplicationContext("fundamentals-beans.xml");
		person = (Person) ctx.getBean("person");
	}
	
	private String getPersonDetails() {
		return person.getDetails();
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		PersonClient client = new PersonClient();
		System.out.println(client.getPersonDetails());

	}

}
