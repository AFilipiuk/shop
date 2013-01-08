package CakeShop.shop.web;

import java.io.Serializable;
import java.util.List;

import javax.enterprise.context.SessionScoped;
import javax.faces.model.ListDataModel;
import javax.inject.Inject;
import javax.inject.Named;

import CakeShop.shop.main.Seller;
import CakeShop.shop.manager.SellerManager;



@SessionScoped
@Named("sellerBean")



public class SellerFormBean implements Serializable {

		private static final long serialVersionUID = 1L;

		private Seller seller = new Seller();
		private ListDataModel<Seller> sellers = new ListDataModel<Seller>();

		@Inject
		private SellerManager sm;

		public Seller getSeller() {
			return seller;
		}

		public void setSeller(Seller seller) {
			this.seller = seller;
		}

		public ListDataModel<Seller> getSellers() {
			return sellers;
		}
		
		public String addSeller() {

			sm.addSeller(seller);

			return "showSellers";
		}

		public String deleteSeller() {
			Seller s = sellers.getRowData();
			sm.deleteSeller(s);

			return "showSellers";
		}
		
		public List<Seller> getAllSeller(){
			return sm.getAllSeller();
		}

	}
	
	

