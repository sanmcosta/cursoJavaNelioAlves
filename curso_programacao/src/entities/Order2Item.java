package entities;

public class Order2Item {

	private Integer quantity;
	private Double price;

	private Product2 product;

	public Order2Item() {

	}

	public Order2Item(Integer quantity, Double price, Product2 product) {
		this.quantity = quantity;
		this.price = price;
		this.product = product;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Product2 getProduct() {
		return product;
	}

	public void setProduct(Product2 product) {
		this.product = product;
	}

	public Double subTotal() {

		return this.quantity * this.price;
	}

	@Override
	public String toString() {
		return product.getName() + ", $" + String.format("%.2f", price) + ", Quantity: " + quantity + ", Subtotal: $"
				+ String.format("%.2f", subTotal());
	}
}
