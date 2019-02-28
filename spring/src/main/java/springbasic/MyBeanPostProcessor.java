package springbasic;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

import springbasic.repos.AccountRepo;

//@Component
public class MyBeanPostProcessor implements BeanPostProcessor{

	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException{
		
		if(beanName.equals("accountRepo")){
			System.out.println("Creating a cache in accountRepo");
			AccountRepo repo = (AccountRepo) bean;
			System.out.println(repo);
		}
		
		return bean;
		
	}
}
