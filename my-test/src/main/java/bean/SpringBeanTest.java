package bean;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringBeanTest {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring-boy-spring.xml");
		Object hello = context.getBean("SpringBoy");
		System.out.println(hello);
		context.registerShutdownHook();

	}
}
