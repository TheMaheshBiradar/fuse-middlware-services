package com.venkat.poc.service.impl;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

import com.venkat.poc.service.BookTicket;
import com.venkat.poc.service.JurneyInfo;
import com.venkat.poc.service.PassengerInfo;
import com.venkat.poc.service.Ticket;
import com.venkat.poc.service.TicketStatus;
import com.venkat.poc.service.delegate.ReservationTicketDeleage;
import com.venkat.poc.service.delegate.ReservationTicketDelegateImpl;

public class BookTicketImpl implements BookTicket {

	
	ReservationTicketDeleage rDelegate;
	
		
	
	/**
	 * 
	 */
	public BookTicketImpl() {
		super();
		rDelegate=new ReservationTicketDelegateImpl();
	}

	/* (non-Javadoc)
	 * @see com.venkat.poc.service.BookTicket#bookTicket(com.venkat.poc.service.PassengerInfo, com.venkat.poc.service.JurneyInfo)
	 */
	@Override
	@WebResult(name = "return", targetNamespace = "")
	@RequestWrapper(localName = "bookTicket", targetNamespace = "http://service.poc.venkat.com/", className = "com.venkat.poc.service.BookTicket_Type")
	@WebMethod(action = "urn:BookTicket")
	@ResponseWrapper(localName = "bookTicketResponse", targetNamespace = "http://service.poc.venkat.com/", className = "com.venkat.poc.service.BookTicketResponse")
	public Ticket bookTicket(
			@WebParam(name = "arg0", targetNamespace = "") PassengerInfo arg0,
			@WebParam(name = "arg1", targetNamespace = "") JurneyInfo arg1) {
		// TODO Auto-generated method stub
		return rDelegate.bookTicket(arg0, arg1);
	}

	/* (non-Javadoc)
	 * @see com.venkat.poc.service.BookTicket#cancelTicket(com.venkat.poc.service.Ticket)
	 */
	@Override
	@WebResult(name = "return", targetNamespace = "")
	@RequestWrapper(localName = "cancelTicket", targetNamespace = "http://service.poc.venkat.com/", className = "com.venkat.poc.service.CancelTicket")
	@WebMethod(action = "urn:CancelTicket")
	@ResponseWrapper(localName = "cancelTicketResponse", targetNamespace = "http://service.poc.venkat.com/", className = "com.venkat.poc.service.CancelTicketResponse")
	public TicketStatus cancelTicket(
			@WebParam(name = "arg0", targetNamespace = "") Ticket arg0) {
		// TODO Auto-generated method stub
		return rDelegate.cancelTicket(arg0);
	}

	
	
}
