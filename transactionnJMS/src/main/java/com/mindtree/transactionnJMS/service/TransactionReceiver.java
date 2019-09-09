package com.mindtree.transactionnJMS.service;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class TransactionReceiver {

	@JmsListener(destination="TransactionQueue")
	public void messageReceiver(String transaction)
	{
		System.out.println(transaction);
		
		System.out.println("received");
	}
}