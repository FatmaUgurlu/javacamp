package Adapters;

import Abstract.UserCheckService;
import Entities.User;

public class MernisServiceAdapter implements UserCheckService{

	@Override
	public boolean checkIfRealPerson(User user) {
		
		return true;
	}

}
