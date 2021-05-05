

import Abstract.BaseCustomerManager;
import Adapters.MernisServiceAdapter;
import Concrete.StarbucksCustomerManager;
import Entities.Customer;

public class Main {

	public static void main(String[] args) {
		BaseCustomerManager customermanager = new StarbucksCustomerManager(new MernisServiceAdapter());
		customermanager.save(new Customer(1,"Fatma","Uðurlu",1989,"28873139696"));

	}

	

}
