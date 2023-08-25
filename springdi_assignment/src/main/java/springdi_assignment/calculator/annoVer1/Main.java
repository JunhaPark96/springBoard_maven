package springdi_assignment.calculator.annoVer1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		ApplicationContext ac= new GenericXmlApplicationContext("calc2.xml");
		MyCalculator calc = ac.getBean("calc", MyCalculator.class);
		
		calc.setFirstNum(10);
		calc.setSecondNum(5);
		System.out.println(calc.toString());
		calc.printResult();
	}
}
