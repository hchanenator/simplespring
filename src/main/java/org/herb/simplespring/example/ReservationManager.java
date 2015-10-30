/**
 * 
 */
package org.herb.simplespring.example;

import org.herb.simplespring.example.model.Reservation;
import org.herb.simplespring.example.service.ReservationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author herb
 *
 */
@Component
public class ReservationManager {
	
	@Autowired
	private ReservationService reservationService = null;
	
	public void process(Reservation reservation) {
		reservationService.reserve(reservation);
	}

}
