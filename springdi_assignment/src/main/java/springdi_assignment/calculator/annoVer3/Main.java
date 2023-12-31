package springdi_assignment.calculator.annoVer3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
	public static void main(String[] args) {
		ApplicationContext ac= new AnnotationConfigApplicationContext(springdi_assignment.calculator.annoVer3.Config.class);
		MyCalculator calc = ac.getBean("myCalculator", MyCalculator.class);
		
		calc.setFirstNum(10);
		calc.setSecondNum(5);
		System.out.println(calc.toString());
		calc.printResult();
	}
}
