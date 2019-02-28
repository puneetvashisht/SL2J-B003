package springbasic;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.stereotype.Component;

//@Component
public class MyBeanFactoryPostProcessor implements BeanFactoryPostProcessor {

	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
		String beanNames[] = beanFactory.getBeanDefinitionNames();
		
		System.out.println("After bean.xml loading...");
		for(String name: beanNames){
			System.out.println(name);
		}
	}

}
