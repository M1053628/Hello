package com.mindtree.transactionnJMS.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mindtree.transactionnJMS.entity.Transaction;



@RestController
public class TransactionController {
@Autowired
private JmsTemplate jmsTemplate;
@PostMapping("/send")
public void send(@RequestBody Transaction transaction)
{
	System.out.println("Sending a transaction");
	jmsTemplate.convertAndSend("TransactionQueue",transaction.toString());
}
}