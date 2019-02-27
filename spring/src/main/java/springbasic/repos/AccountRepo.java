package springbasic.repos;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Repository;

@Repository
public class AccountRepo {
	
	@PostConstruct
	public void init(){
		System.out.println("Initialize here...");
	}
	
	public double getBalance(int acc1){
		//db code to get balance
		
		return 34343.34;
	}

}
