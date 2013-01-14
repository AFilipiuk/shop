package CakeShop.shop.service;

import java.util.ArrayList;
import java.util.List;

import javax.enterprise.context.ApplicationScoped;

import CakeShop.shop.domain.Order;

@ApplicationScoped
public class OrderManager {
	private List<Order> db = new ArrayList<Order>();

	public void addOrder(Order order) {
		Order newOrder = new Order();

		newOrder.setOrdertxt(order.getOrdertxt());
		newOrder.setOrderInfo(order.getOrderInfo());
		newOrder.setZipCode(order.getZipCode());
		newOrder.setTel(order.getTel());
		newOrder.setDateOfOrder(order.getDateOfOrder());
//		newOrder.setPrice(order.getPrice());
		newOrder.setQuantity(order.getQuantity());
		newOrder.setAddress(order.getAddress());
		newOrder.setClient(order.getClient());
		db.add(newOrder);
	}

	// Removes the order with given phone number
	public void deleteOrder(Order order) {
		Order orderToRemove = null;
		for (Order o : db) {
			if (order.getTel().equals(o.getTel())) {
				orderToRemove = o;
				break;
			}
		}
		if (orderToRemove != null)
			db.remove(orderToRemove);
	}

	public List<Order> getAllOrders() {
		return db;
	}
}