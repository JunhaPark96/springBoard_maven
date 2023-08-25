package springdi_assignment.calculator.xmlver;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext ac= new GenericXmlApplicationContext("calc1.xml");
		MyCalculator calc = ac.getBean("calc", MyCalculator.class);
		System.out.println(calc.toString());
		calc.printResult();
	}

}
