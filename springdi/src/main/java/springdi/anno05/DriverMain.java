package springdi.anno05;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DriverMain {
	public static void main(String[] args) {
		ApplicationContext ac= new AnnotationConfigApplicationContext(springdi.anno05.Config.class);
		Car c = ac.getBean("car", Car.class);
		c.printTireBrand();
	}

}
