
package com.junaid.training.spring.producer;

import javax.jms.JMSException;
import javax.jms.MapMessage;
import javax.jms.Message;
import javax.jms.Session;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.core.MessageCreator;

import com.bov.dto.Stock;

public class StockSender {

	
	public StockSender() {
		super();
		// TODO Auto-generated constructor stub
	}




	
    public JmsTemplate jmsTemplate;
	
	
	public void setJmsTemplate(JmsTemplate jmsTemplate) {
		this.jmsTemplate = jmsTemplate;
	}




	public void sendStockInfo(final Stock stockinfo){
	
		 jmsTemplate.send(new MessageCreator() {
		 
		   public Message createMessage(Session session) throws JMSException {
		 
		   Message message = session.createObjectMessage(stockinfo);
		 
		   return message;
		   }
		  });
	 System.out.println("Information sent - for Stock Name: "+ stockinfo.getStockName());
	
	}
	
/**
		public void sendStockInfo(final Stock stockinfo){
	        jmsTemplate.send(
	        new MessageCreator() {
	          public Message createMessage(Session session) throws JMSException {
	               MapMessage mapMessage = session.createMapMessage();
	               mapMessage.setInt("stockId", stockinfo.getStockId());
	               mapMessage.setString("stockName", stockinfo.getStockName());
	               mapMessage.setString("stockDescription", stockinfo.getStockDescription());
	               mapMessage.setDouble("startingprice", stockinfo.getStartingPrice());
	               mapMessage.setDouble("endingprice", stockinfo.getEndingPrice());
	               mapMessage.setInt("StockQuantity", stockinfo.getStockQuantity());
	               return mapMessage;
	          }
	        }
	        );
	        System.out.println("Information sent - for Stock Name: "+ stockinfo.getStockName());
	        
		}
	
		**/
		
		
		
		
		
	}
	
	


