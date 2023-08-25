package springdi_assignment.calculator.xmlver;

public class MyCalculator {
	private int firstNum;
	private int secondNum;
	private Calculator calculator;
	
	public void printResult() {
		System.out.println("결과는 " + calculator.calculate(secondNum, firstNum));
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

	public void setCalculator(Calculator calculator) {
		this.calculator = calculator;
	}

	public MyCalculator(int firstNum, int secondNum, Calculator calculator) {
		this.firstNum = firstNum;
		this.secondNum = secondNum;
		this.calculator = calculator;
	}

	public MyCalculator() {
	}

	@Override
	public String toString() {
		return "MyCalculator [firstNum=" + firstNum + ", secondNum=" + secondNum + ", calculator=" + calculator + "]";
	}
	
}
