package com.venkat.poc.service.impl;

import java.util.Random;

import com.venkat.poc.service.BookTicket_Type;
import com.venkat.poc.service.JurneyInfo;
import com.venkat.poc.service.PassengerInfo;
import com.venkat.poc.service.Ticket;
import com.venkat.poc.service.TicketStatus;

public class BookTicketImplProcess {
	
	public Ticket bookTicketProcess(BookTicket_Type type){
		PassengerInfo pInfo=type.getArg0();
		JurneyInfo jInfo=type.getArg1();
		System.out.println("passengerName: "+pInfo.getPassengerName());
		System.out.println(" Journey From: "+jInfo.getFrom()+" To: "+jInfo.getTo());
		Ticket ticket=new Ticket();
		ticket.setBerth("confirm");
		ticket.setPassengerName(pInfo.getPassengerName());
		ticket.setSeatNumber(new Random().nextInt(215));
		return ticket;
	}

	public TicketStatus cancelTicketProcess(Ticket type){
		TicketStatus s=new TicketStatus();
		s.setPassengerName(type.getPassengerName());
		s.setTiketStatus(false);
		s.setTrainNumber(String.valueOf(type.getTrainNumber()));
		
		return s;
	}

}
