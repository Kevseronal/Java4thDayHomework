package java4thDayHomework.adapters;

import java.rmi.RemoteException;
import java.util.Locale;

import java4thDayHomework.abstracts.CustomerCheckService;
import java4thDayHomework.entities.Customer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements CustomerCheckService{

	@Override
	public boolean checkIfRealPerson(Customer customer) {

		KPSPublicSoapProxy client = new KPSPublicSoapProxy();
		boolean result = true;
		
		try {
			result = client.TCKimlikNoDogrula(Long.parseLong(customer.getNationalityId()), customer.getFirstName().toUpperCase(new Locale("tr")), 
					customer.getLastName().toUpperCase(new Locale("tr")), customer.getDateOfBirth());
		}catch (RemoteException e) {
			
			e.printStackTrace();
		}
		
		return result;
	}

}
