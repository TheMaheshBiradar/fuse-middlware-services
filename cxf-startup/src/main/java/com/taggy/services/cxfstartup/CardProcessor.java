package com.taggy.services.cxfstartup;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;


public class CardProcessor implements Processor{

	@Override
	public void process(Exchange exchange) throws Exception {
		
		String cardNumber =exchange.getIn().getBody(String.class);
		CardResponse cardResponse= new  CardResponse();

		if(null!=cardNumber && !cardNumber.isEmpty() && cardNumber.length()==4){
		
			cardResponse.setUsername("Mahesh Biradar");
			cardResponse.setValidCard(true);
		}
		else{
		
		cardResponse.setUsername("Fake User");
		cardResponse.setValidCard(false);
		
		
		}
		
		exchange.getOut().setBody(cardResponse);
		
	}
	
	
}
