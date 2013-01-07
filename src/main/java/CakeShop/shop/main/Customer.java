package CakeShop.shop.main;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.validation.constraints.Size;


	@Entity
	@NamedQueries({ 
		@NamedQuery(name = "customer.all", query = "Select c from Customer c")
	})
public class Customer {

		@Id
		@GeneratedValue(strategy = GenerationType.AUTO)
		private int id;
		@Size(min=2, max =20)
		private String name;
		@Size(min=2, max =20)
		private String surname;
		

		public Customer() {
		}



		public Customer(String name, String surname) {
			this.name = name;
			this.surname = surname;
		
		}



		public int getId() {
			return id;
		}



		public void setId(int id) {
			this.id = id;
		}



		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getSurname() {
			return surname;
		}

		public void setSurname(String surname) {
			this.surname = surname;
		}

		

	}

	

