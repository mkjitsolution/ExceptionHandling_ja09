package p2;

public class Inventory {

	private String productName;
	private int stockInHand;
	
	public Inventory() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Inventory(String productName, int stockInHand) {
		super();
		this.productName = productName;
		this.stockInHand = stockInHand;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public int getStockInHand() {
		return stockInHand;
	}
	public void setStockInHand(int stockInHand) {
		this.stockInHand = stockInHand;
	}
	@Override
	public String toString() {
		return "Inventory [productName=" + productName + ", stockInHand=" + stockInHand + "]";
	}
	
	
}
