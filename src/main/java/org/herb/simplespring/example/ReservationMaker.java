/**
 * 
 */
package org.herb.simplespring.example;

import org.herb.simplespring.example.model.Reservation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author herb
 *
 */
public class ReservationMaker {
	@Autowired
	private ReservationManager reservationManager = null;
	private ApplicationContext ctx = null;
	
	public ReservationMaker() {
		ctx = new ClassPathXmlApplicationContext("reservations-beans.xml");
		reservationManager = (ReservationManager) ctx.getBean("reservationManager");
	}
	
	private void makeReservation() {
		Reservation reservation = new Reservation();
		reservation.setId(1L);
		reservation.setReservationNumber("AH081");
		reservationManager.process(reservation);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ReservationMaker reservationMaker = new ReservationMaker();
		reservationMaker.makeReservation();

	}

}
