package bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

public class SpringBoy implements BeanNameAware, BeanFactoryAware, InitializingBean, DisposableBean {
	private String name;

	public SpringBoy() {
		System.out.println("constructor");
	}

	private void init(){
		System.out.println("init");
	}

	@Override
	public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
		System.out.println("setBeanFactory");
	}

	public void setName(String name) {
		System.out.println("setName");
		this.name = name;
	}

	@Override
	public void setBeanName(String name) {
		System.out.println("setBeanName");
		this.name = name;
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("destroy");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("afterPropertiesSet");
	}
}
