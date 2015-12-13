package com.junaid.training.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.junaid.training.spring.producer.StockOrder;
import com.junaid.training.spring.producer.StockSender;

public class SpringJmsExplained {

	public static void main(String[] args) {
		
		ApplicationContext ctx =
		new ClassPathXmlApplicationContext("applicationContext-jms.xml");
		
		StockOrder orderService = (StockOrder) ctx.getBean("stockorder");
		
		//StockSender stockSender = (StockSender) ctx.getBean("stockSender");
		
		
		orderService.sendStockInfo(1, "YAHOO", "YAHOO  Stocks ", 19198700, 560.00, 453.62);
		
		
		
		}
	
}
