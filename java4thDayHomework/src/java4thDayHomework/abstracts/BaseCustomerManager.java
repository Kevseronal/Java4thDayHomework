package java4thDayHomework.abstracts;

import java4thDayHomework.entities.Customer;

public abstract class BaseCustomerManager implements CustomerService{

	@Override
	public void save(Customer customer) {
		System.out.println("Saved to database : " + customer.getFirstName());
	}
}
