package CakeShop.shop.web;

import java.io.Serializable;
import java.util.Calendar;
import java.util.Date;

import javax.enterprise.context.SessionScoped;
import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.component.UIForm;
import javax.faces.component.UIInput;
import javax.faces.context.FacesContext;
import javax.faces.event.ComponentSystemEvent;
import javax.faces.model.ListDataModel;
import javax.faces.validator.ValidatorException;
import javax.inject.Inject;
import javax.inject.Named;

import CakeShop.shop.domain.Order;
import CakeShop.shop.service.OrderManager;

@SessionScoped
@Named("orderBean")
public class OrderFormBean implements Serializable {

	private static final long serialVersionUID = 1L;

	private Order order = new Order();

	private ListDataModel<Order> orders = new ListDataModel<Order>();

	@Inject
	private OrderManager om;

	public Order getOrder() {
		return order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}

	public ListDataModel<Order> getAllOrders() {
		orders.setWrappedData(om.getAllOrders());
		return orders;
	}

	// Actions
	public String addOrder() {
		om.addOrder(order);
		return "showOrders";
		//return null;
	}

	public String deleteOrder() {
		Order orderToDelete = orders.getRowData();
		om.deleteOrder(orderToDelete);
		return null;
	}

	// Validators

	// Business logic validation
	public void uniqueTel(FacesContext context, UIComponent component,
			Object value) {

		String tel = (String) value;

		for (Order order : om.getAllOrders()) {
			if (order.getTel().equalsIgnoreCase(tel)) {
				FacesMessage message = new FacesMessage(
						"Person with this phone number already exists in database");
				message.setSeverity(FacesMessage.SEVERITY_ERROR);
				throw new ValidatorException(message);
			}
	}
	}

	// Multi field validation with <f:event>
	// Rule: first two digits of PIN must match last two digits of the year of
	// birth
	//public void validatePinDob(ComponentSystemEvent event) {

	//	UIForm form = (UIForm) event.getComponent();
	//	UIInput pin = (UIInput) form.findComponent("pin");
	///	UIInput dob = (UIInput) form.findComponent("dob");

	//	if (pin.getValue() != null && dob.getValue() != null
	//			&& pin.getValue().toString().length() >= 2) {
	//		String twoDigitsOfPin = pin.getValue().toString().substring(0, 2);
	//		Calendar cal = Calendar.getInstance();
	//		cal.setTime(((Date) dob.getValue()));

	//		String lastDigitsOfDob = ((Integer) cal.get(Calendar.YEAR))
		//			.toString().substring(2);

		//	if (!twoDigitsOfPin.equals(lastDigitsOfDob)) {
		//		FacesContext context = FacesContext.getCurrentInstance();
		//		context.addMessage(form.getClientId(), new FacesMessage(
		//				"PIN doesn't match date of birth"));
		//		context.renderResponse();
		//	}
		//}
//	}
}