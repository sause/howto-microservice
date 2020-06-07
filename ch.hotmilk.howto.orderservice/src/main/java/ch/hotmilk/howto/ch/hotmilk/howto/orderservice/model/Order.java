package ch.hotmilk.howto.ch.hotmilk.howto.orderservice.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter @NoArgsConstructor
public class Order {
	
	private int id;
    private int customerId;
    private String name;

    public Order(final int id, final int customerId, final String name) {
        this.id = id;
        this.customerId = customerId;
        this.name = name;
    }
}
