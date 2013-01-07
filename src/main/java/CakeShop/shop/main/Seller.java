package CakeShop.shop.main;
import java.util.ArrayList;
import java.util.List;


import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.validation.constraints.Size;

@Entity
@NamedQueries({ 
	@NamedQuery(name = "seller.all", query = "Select s from Seller s")
})
public class Seller {
	
		@Id
		@GeneratedValue(strategy = GenerationType.AUTO)
		private int id;
		@Size(min=2, max =20)
		private String name;
		@Size(min=2, max =20)
		private String surname;
		@Size(min=2, max =20)
		private String position;
		@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
		private List<Customer> listCustomers;
		
		
		
		public Seller() {
		}


		public Seller(String name, String surname, String position) {
			this.name=name;
			this.surname=surname;
			this.position=position;
			this.listCustomers = new ArrayList<Customer>();
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

		public String getPosition() {
			return position;
		}

		public void setPosition(String position) {
			this.position = position;
		}



		public List<Customer> getListCustomers() {
			return listCustomers;
		}



		public void setListCustomers(List<Customer> listCustomers) {
			this.listCustomers = listCustomers;
		}



	}
}
