package springdi_assignment.calculator.annoVer3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class MyCalculator {
	private int firstNum;
	private int secondNum;
	private Calculator calculator;
	
	public MyCalculator(int firstNum, int secondNum, Calculator calculator) {
		this.firstNum = firstNum;
		this.secondNum = secondNum;
		this.calculator = calculator;
	}
	public void printResult() {
		System.out.println("결과는 " + calculator.calculate(firstNum, secondNum));
	}
	@Autowired
	public void setCalculator(@Qualifier("sub") Calculator calculator) {
		this.calculator = calculator;
	}
	public int getFirstNum() {
		return firstNum;
	}

	public int getSecondNum() {
		return secondNum;
	}
	
	public Calculator getCalculator() {
		return calculator;
	}
	public void setFirstNum(int firstNum) {
		this.firstNum = firstNum;
	}
	public void setSecondNum(int secondNum) {
		this.secondNum = secondNum;
	}


	public MyCalculator() {
	}

	@Override
	public String toString() {
		return "MyCalculator [firstNum=" + firstNum + ", secondNum=" + secondNum + ", calculator=" + calculator + "]";
	}
	
}
