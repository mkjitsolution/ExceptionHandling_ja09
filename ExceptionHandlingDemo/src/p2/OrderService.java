package p2;

public class OrderService {

	Inventory inventory;
	
	public OrderService(Inventory inventory) {
		super();
		this.inventory = inventory;
	}

	public boolean placeOrder(int orderValue)throws OrderOutofStockException
	{
		int unitsInHand = inventory.getStockInHand();
		boolean status = false;
		
		if(orderValue > unitsInHand)
		{
			status = false;
			throw new OrderOutofStockException(orderValue);
		}
		else
		{
			status = true;
			inventory.setStockInHand(unitsInHand - orderValue);
		}
		
		return status;
		
		
	}
}
