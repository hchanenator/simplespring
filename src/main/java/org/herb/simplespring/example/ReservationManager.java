/**
 * 
 */
package org.herb.simplespring.example;

import org.herb.simplespring.example.model.Reservation;
import org.herb.simplespring.example.service.ReservationService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author herb
 *
 */
public class ReservationManager {
	
	@Autowired
	private ReservationService reservationService = null;
	
	public void process(Reservation reservation) {
		reservationService.reserve(reservation);
	}

}
