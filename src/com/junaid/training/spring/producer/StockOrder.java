/**
Feb 1, 2013
SpringJmsExplained
Junaid Pasha
Common Services 
American Airlines
**/
package com.junaid.training.spring.producer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bov.dto.Stock;

@Service("stockorder")
public class StockOrder {
	
	
	public  StockSender stocksender;
	
	
	
	
	
	
	

	public void setStocksender(StockSender stocksender) {
		this.stocksender = stocksender;
	}


	public void setOrderSender(StockSender stocksender){
	        this.stocksender = stocksender;
	    }
	
	
	  public void sendStockInfo(int stockId, String stockName, String stockDescription,
				int stockQuantity, double startingPrice,double endPrice)
	    {
	        Stock stock = new Stock(stockId, stockName, stockDescription,
	    			stockQuantity, startingPrice, endPrice
	    			);
	       
	        stocksender.sendStockInfo(stock);
	    }
	}
	
	
	


