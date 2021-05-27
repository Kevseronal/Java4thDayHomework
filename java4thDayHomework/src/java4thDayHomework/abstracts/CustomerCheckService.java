package java4thDayHomework.abstracts;

import java4thDayHomework.entities.Customer;

public interface CustomerCheckService {

	boolean checkIfRealPerson(Customer customer);
	
}