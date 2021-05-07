package Concrete;

import Abstract.UserCheckService;
import Entities.User;

public class UserCheckManager implements UserCheckService{

	@Override
	public boolean checkIfRealPerson(User user) {
		
		if(user.getIdentityNumber().length()==11)
		{
			return true;
		}
		else {
			
		}
		return false;
	}

}
