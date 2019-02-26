package springbasic;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import springbasic.services.PaymentService;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:beans.xml")
public class TestTransferService {
	
	@Autowired
	PaymentService paymentService;

	@Test
	public void test() {
		boolean result = paymentService.transferFunds(23, 3434, 3454545);
		assertTrue(result);
		
		
	}

}
