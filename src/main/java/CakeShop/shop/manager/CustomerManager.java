package CakeShop.shop.manager;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import CakeShop.shop.main.Customer;

public class CustomerManager {

	@PersistenceContext
	EntityManager em;
	
	public void addCustomer(Customer customer){
		em.persist(customer);
	}
	
	public void deleteCustomer(Customer customer){
		Customer c=em.find(Customer.class, customer.getId());
		em.remove(c);
	}
	
	@SuppressWarnings("unchecked")
	public List<Customer> getAllCustomer(){
		return em.createNamedQuery("customer.all").getResultList();
	}

}
	
	
}
