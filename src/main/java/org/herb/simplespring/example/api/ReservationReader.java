/**
 * 
 */
package org.herb.simplespring.example.api;

import org.herb.simplespring.example.model.Reservation;

/**
 * @author herb
 *
 */
public class ReservationReader implements IReservationReader {

	/* Fake it until you make it!
	 * @see org.herb.simplespring.example.api.IReservationReader#getReservation(java.lang.String)
	 */
	public Reservation getReservation(String reservationNumber) {
		Reservation reservation = new Reservation();
		reservation.setId(1l);
		reservation.setReservationNumber(reservationNumber);
		return reservation;
	}

	/* (non-Javadoc)
	 * @see org.herb.simplespring.example.api.IReservationReader#saveReservation(org.herb.simplespring.example.model.Reservation)
	 */
	public void saveReservation(Reservation reservation) {
		System.out.println(reservation.getReservationNumber() + " saved.");		
	}
	
	

}
