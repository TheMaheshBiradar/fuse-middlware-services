package com.venkat.poc.service.delegate;

import com.venkat.poc.service.JurneyInfo;
import com.venkat.poc.service.PassengerInfo;
import com.venkat.poc.service.Ticket;
import com.venkat.poc.service.TicketStatus;



public interface ReservationTicketDeleage {

	Ticket bookTicket(PassengerInfo pInfo,JurneyInfo jInfo);
	TicketStatus cancelTicket(Ticket ticket);
}
