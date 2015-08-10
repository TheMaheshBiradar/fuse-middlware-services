package com.taggy.services.cxfstartup;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/cardService")
public class CardServiceImpl implements CardService{
	
	@GET
	@Path("/status/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	@Override
	public CardResponse checkCardStatus(@PathParam("id") String cardNumber) {
		return null;
	}
}
