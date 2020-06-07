package ch.hotmilk.howto.ch.hotmilk.howto.orderservice.service.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import ch.hotmilk.howto.ch.hotmilk.howto.orderservice.model.Order;
import ch.hotmilk.howto.ch.hotmilk.howto.orderservice.service.OrderService;

@RestController
public class OrderController {

	@Autowired
	OrderService orderService;
	
	@GetMapping("/{id}")
    public Order getOrderById(@PathVariable int id) {
		return orderService.getOrderById(id);
    }
}
