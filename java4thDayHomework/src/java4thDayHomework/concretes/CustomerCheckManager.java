package java4thDayHomework.concretes;

import java4thDayHomework.abstracts.CustomerCheckService;
import java4thDayHomework.entities.Customer;

public class CustomerCheckManager implements CustomerCheckService{

	@Override
	public boolean checkIfRealPerson(Customer customer) {
		
		return true;
	}

}
