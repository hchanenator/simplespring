/**
 * 
 */
package org.herb.simplespring.example.api;

import org.herb.simplespring.example.model.Reservation;

/**
 * @author herb
 *
 */
public interface IReservationReader {

	public Reservation getReservation(String reservationNumber);
	public void saveReservation(Reservation reservation);
}
