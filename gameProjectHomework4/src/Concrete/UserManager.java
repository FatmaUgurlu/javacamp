package Concrete;

import Abstract.UserCheckService;
import Abstract.UserService;
import Entities.User;

public class UserManager implements UserService{
	
	UserCheckService userCheckService;
	
	public  UserManager(UserCheckService userCheckService) {
		super();
		this.userCheckService = userCheckService;
		
	}

	@Override
	public void add(User user) {
		
		if(this.userCheckService.checkIfRealPerson(user)) {
		System.out.println( user.getFirstName() + " " + user.getLastName() + " " + "kullanýcý bilgileri baþarý ile eklendi" );
		
	    }
		else {
	    	System.out.println("Kullanýcý bilgileri hatalý girilmiþtir.Tekrar deneyiniz.");
	    	
	    }
	}

	@Override
	public void delete(User user) {
		System.out.println("kullanýcý bilgileri silindi: " + user.getFirstName() + " " + user.getLastName());
		
	}

	@Override
	public void update(User user) {
		System.out.println("kullanýcý bilgileri güncellendi: " + user.getFirstName() + " " + user.getLastName());
		
	}
	

	
}
