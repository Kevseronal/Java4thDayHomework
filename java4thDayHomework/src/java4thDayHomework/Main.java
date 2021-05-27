package java4thDayHomework;

import java4thDayHomework.abstracts.BaseCustomerManager;
import java4thDayHomework.adapters.MernisServiceAdapter;
import java4thDayHomework.concretes.StarbucksCustomerManager;
import java4thDayHomework.entities.Customer;

public class Main {

	public static void main(String[] args) {
		
		BaseCustomerManager baseCustomerManager = new StarbucksCustomerManager(new MernisServiceAdapter());
		baseCustomerManager.save(new Customer(5, "Kevser", "Önal", 2001, "1232437843"));

	}

}
