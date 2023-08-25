package springdi_assignment.calculator.annoVer2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		ApplicationContext ac= new GenericXmlApplicationContext("calc3.xml");
		// 자동 빈 주입을 하면 첫글자만 소문자 나머지는 그대로
		MyCalculator calc = ac.getBean("myCalculator", MyCalculator.class);
		
		calc.setFirstNum(10);
		calc.setSecondNum(5);
		System.out.println(calc.toString());
		calc.printResult();
	}
}
