package springbasic.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import springbasic.repos.AccountRepo;

@Component
public class PaymentService {
	
	
	AccountRepo accountRepo;
	
	

	public AccountRepo getAccountRepo() {
		return accountRepo;
	}


	@Autowired
	public void setAccountRepo(AccountRepo accountRepo) {
		this.accountRepo = accountRepo;
	}



	public boolean transferFunds(int acc1, int acc2, double amount){
		
		
		
		
		System.out.println(acc1);
		System.out.println(acc2);
		System.out.println(amount);
		
		
		return true;
	}
	
}
