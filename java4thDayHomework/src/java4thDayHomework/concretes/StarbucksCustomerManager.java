package java4thDayHomework.concretes;

import java4thDayHomework.abstracts.BaseCustomerManager;
import java4thDayHomework.abstracts.CustomerCheckService;
import java4thDayHomework.entities.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager{

	private CustomerCheckService customerCheckService;
	
	public StarbucksCustomerManager(CustomerCheckService customerCheckService) {
		this.customerCheckService = customerCheckService;
	}
	
	@Override
	public void save(Customer customer) {
		
		if(customerCheckService.checkIfRealPerson(customer)) {
			super.save(customer);
		}else {
			System.out.println("Not a valid person.");
		}
	}

}
