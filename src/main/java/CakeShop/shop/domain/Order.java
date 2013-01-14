package CakeShop.shop.domain;

import java.util.Date;


import javax.validation.constraints.Past;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class Order {

	private String ordertxt = "";
	private String orderInfo = "max 100 znaków";
	private String client = "max 50 znaków";
	private String address = "max 100 znaków";
	private String zipCode = "XX-XXX";
	private String tel = "min 7 cyfr";
	private String quantity;
	private Date dateOfOrder = new Date();
//	private int price;


	@Size(min = 2, max = 100)
	public String getOrdertxt() {
		return ordertxt;
	}
	public void setOrdertxt(String ordertxt) {
		this.ordertxt = ordertxt;
	}

	@Pattern(regexp = "[0-9]{2}-[0-9]{3}")
	public String getZipCode() {
		return zipCode;
	}
	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	@Size(min = 7)
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}

	@Size(min = 1)
	public String getQuantity() {
		return quantity;
	}
	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}

	@Past
	public Date getDateOfOrder() {
		return dateOfOrder;
	}
	public void setDateOfOrder(Date dateOfOrder) {
		this.dateOfOrder = dateOfOrder;
	}

	//@Size(min = 1)
	//public int getPrice() {
	//	return price;
	//}
	//public void setPrice(int price) {
	//	this.price = price;
	//}
	
	@Size(min = 2, max = 100)
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Size(min = 2, max = 50)
	public String getClient() {
		return client;
	}
	public void setClient(String client) {
		this.client = client;
	}
	
	@Size(min = 2, max = 50)
	public String getOrderInfo() {
		return orderInfo;
	}
	
	public void setOrderInfo(String orderInfo) {
		this.orderInfo = orderInfo;
	}

}