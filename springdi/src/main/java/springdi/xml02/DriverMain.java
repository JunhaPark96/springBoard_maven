package springdi.xml02;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class DriverMain {
	public static void main(String[] args) {
		ApplicationContext ac = new GenericXmlApplicationContext("spring-xml02.xml");
		Car car2 = ac.getBean("car", Car.class);
		car2.printTireBrand();
		System.out.println(car2.toString());
	}
}
