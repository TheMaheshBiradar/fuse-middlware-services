package com.venkat.poc.service.delegate;



import java.util.Random;

import com.venkat.poc.service.BookTicket;
import com.venkat.poc.service.JurneyInfo;
import com.venkat.poc.service.PassengerInfo;
import com.venkat.poc.service.Ticket;
import com.venkat.poc.service.TicketStatus;

public class ReservationTicketDelegateImpl implements ReservationTicketDeleage {

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.venkat.poc.client.delegate.ReservationTicketDeleage#bookTicket(com
	 * .venkat.poc.client.vo.PassengerInfo, com.venkat.poc.client.vo.JurneyInfo)
	 */

	private BookTicket port;

	/**
	 * @param port
	 *            the port to set
	 */
	public void setPort(BookTicket port) {
		this.port = port;
	}

	public ReservationTicketDelegateImpl() {
		super();

	}

	public Ticket bookTicket(PassengerInfo pInfo,JurneyInfo jInfo) {

		// It has to call the mappers to convert VO to DTO(Binding classes).
		// It has to get the Port Instance form Service locator.
		// It has to call the appropriate web service method.
		// It will get the results form Provider in the form of DTO(binding
		// class).
		// It has to call the mapper to convert DTO to Vo .
		// Finally it will sends the VO to Controller

		// But now it is not our primary thing, that is the reason I'm directly
		// implementing

		// It has to convert PassengerInfo to
				// PassengerInfoBo(........persistent form)

				// And get TicketBo and convert Ticket...(that means DTO)

				// And handle the Exceptions
					
				Ticket ticket=new Ticket();
				ticket.setBerth("confirm");
				ticket.setCharge(new Random().nextInt(400));
				ticket.setPassengerName(pInfo.getPassengerName());
				ticket.setSeatNumber(new Random().nextInt(100));
				ticket.setTrainNumber(1242);
				System.out.println("Ticket  Generated in Service: "+ticket);
				return ticket;

		
	}

	@Override
	public TicketStatus cancelTicket(Ticket ticket) {
		// It has to convert PassengerInfo to
				// PassengerInfoBo(........persistent form)

				// And get TicketBo and convert Ticket...(that means DTO)

				// And handle the Exceptions
		TicketStatus ts=new TicketStatus();
		ts.setPassengerName(ticket.getPassengerName());
		ts.setTiketStatus(false);
		ts.setTrainNumber(ticket.getTrainNumber()+"");
		
		System.out.println("Ticket Status Generated in Service: "+ts);
		
		return ts;
	}

}
