package exercises;

public class Invoice {

	private String partNr;
	private String partDesc;
	private int quantity;
	private double price;
	// double invoiceAmount;

	public Invoice(String partNr, String partDesc, int quantity, double price) {
		this.setPartNr(partNr);// = partNr;
		this.setPartDesc(partDesc);// = partDesc;

		this.setQuantity(quantity);// = quantity;

		this.setPrice(price);// = price;
	}

	public void setPartNr(String partNr) {
		this.partNr = partNr;
	}

	public String getPartNr() {
		return partNr;
	}

	public void setPartDesc(String partDesc) {
		 this.partDesc = partDesc;
	}

	public String getPartDesc() {
		return partDesc;
	}

	public void setQuantity(int quantity) {
		if (quantity < 0) {
			quantity = 0;
		}
			this.quantity=quantity;
		}
	

	public int getQuantity() {

		
		return quantity;
	}

	public void setPrice(double price) {
		if (price < 0) {
			price = 0.0;
		}
		this.price=price;}

	public double getPrice() {
		return price;
	}

	// public void invoiceAmount(double invoiceAmount)
	// {invoiceAmount = (double) price*quantity;}

	public double getInvoiceAmount() {
		return price * (double) quantity;
	}

}
