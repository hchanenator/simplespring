/**
 * 
 */
package org.herb.simplespring.example.service;

import org.herb.simplespring.example.api.IReservationReader;
import org.herb.simplespring.example.model.Reservation;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author herb
 *
 */
public class ReservationService implements IReservationService {
	
	@Autowired
	IReservationReader reader;

	/* (non-Javadoc)
	 * @see org.herb.simplespring.example.service.IReservationService#process(org.herb.simplespring.example.model.Reservation)
	 */
	public void reserve(Reservation reservation) {
		reader.saveReservation(reservation);

	}

}
