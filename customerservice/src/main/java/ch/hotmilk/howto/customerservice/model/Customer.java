package ch.hotmilk.howto.customerservice.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter @NoArgsConstructor
public class Customer {

	private Integer id;
	private String surname;
	private String lastname;
	
	 public Customer(Integer id, String surname, String lastname) {
		 this.id = id;
		 this.lastname = lastname;
		 this.surname = surname;
	}
}
