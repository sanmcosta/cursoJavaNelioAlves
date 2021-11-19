package entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import entities.enums.OrderStatus;

public class Order2 {

	private static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	private final String quebraLinha = "\n";

	private Date moment;
	private OrderStatus status;

	private Client client;
	private List<Order2Item> items = new ArrayList<>();

	public Order2(Date moment, OrderStatus status, Client client) {
		this.moment = moment;
		this.status = status;
		this.client = client;
	}

	public Date getMoment() {
		return moment;
	}

	public void setMoment(Date moment) {
		this.moment = moment;
	}

	public OrderStatus getStatus() {
		return status;
	}

	public void setStatus(OrderStatus status) {
		this.status = status;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public List<Order2Item> getItems() {
		return items;
	}

	public void addItem(Order2Item item) {
		items.add(item);
	}

	public void removeItem(Order2Item item) {
		items.remove(item);
	}

	public Double total() {
		Double sum = 0.0;
		for (Order2Item item : items) {
			sum += item.subTotal();
		}
		return sum;
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Order moment: " + sdf.format(moment) + quebraLinha);
		sb.append("Order status: " + status + quebraLinha);
		sb.append(client + quebraLinha);
		sb.append("Order items: " + quebraLinha);
		for (Order2Item item : items) {
			sb.append(item + quebraLinha);
		}
		sb.append("Total price: $");
		sb.append(String.format("%.2f", total()));
		return sb.toString();

	}
}
