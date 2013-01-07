package CakeShop.shop.web;

import java.io.Serializable;
import java.util.List;

import javax.enterprise.context.SessionScoped;
import javax.faces.model.ListDataModel;
import javax.inject.Inject;
import javax.inject.Named;


import CakeShop.shop.main.Customer;
import CakeShop.shop.manager.CustomerManager;

@SessionScoped
@Named("customerBean")
public class CustomerFormBean implements Serializable {

		private static final long serialVersionUID = 1L;

		private Customer customer = new Customer();
		private ListDataModel<Customer> customers = new ListDataModel<Customer>();

		@Inject
		private CustomerManager cm;

		public Customer getCustomer() {
			return customer;
		}

		public void setCustomer(Customer customer) {
			this.customer = customer;
		}

		public ListDataModel<Customer> getCustomers() {
			return customers;
		}
		
		public String addCustomer() {

			cm.addCustomer(customer);

			return "showCustomers";
		}

		public String deleteCustomer() {
			Customer c = customers.getRowData();
			cm.deleteCustomer(c);

			return "showCustomers";
		}
		
		public List<Customer> getAllCustomer(){
			return cm.getAllCustomer();
		}
		
	
	
}
