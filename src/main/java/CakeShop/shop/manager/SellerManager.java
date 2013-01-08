package CakeShop.shop.manager;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import CakeShop.shop.main.Seller;


public class SellerManager {

		@PersistenceContext
		EntityManager em;
		
		public void addSeller(Seller seller){
			em.persist(seller);
		}
		
		public void deleteSeller(Seller seller){
			Seller s=em.find(Seller.class, seller.getId());
			em.remove(s);
		}
		
		@SuppressWarnings("unchecked")
		public List<Seller> getAllSeller(){
			return em.createNamedQuery("seller.all").getResultList();
		}

	}

	

