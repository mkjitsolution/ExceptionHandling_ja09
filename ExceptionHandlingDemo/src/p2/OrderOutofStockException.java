package p2;

import java.util.Arrays;

public class OrderOutofStockException extends Exception{

	int unitsOrdered;
	public OrderOutofStockException(int unitOrdered) {
		this.unitsOrdered = unitOrdered;
	}

	
	public String toString()
	{
		return "OrderOutofStockException :- "+unitsOrdered;
	}
	

}
