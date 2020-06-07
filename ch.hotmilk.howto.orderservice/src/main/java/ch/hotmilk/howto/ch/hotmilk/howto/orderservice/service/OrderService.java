package ch.hotmilk.howto.ch.hotmilk.howto.orderservice.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Component;

import ch.hotmilk.howto.ch.hotmilk.howto.orderservice.model.Order;

@Component
public class OrderService {

	private List<Order> orders;
	public OrderService() {
		this.orders = Arrays.asList(
	            new Order(1, 1, "Product A"),
	            new Order(2, 1, "Product B"),
	            new Order(3, 2, "Product C"),
	            new Order(4, 1, "Product D"),
	            new Order(5, 2, "Product E"));
	}
	
	public List<Order> getAllOrders(){
		return orders;
	}
	
	public Order getOrderById(Integer orderId) {
		return orders.stream()
                .filter(order -> order.getId() == orderId)
                .findFirst()
                .orElseThrow(IllegalArgumentException::new);
	}
	
}
