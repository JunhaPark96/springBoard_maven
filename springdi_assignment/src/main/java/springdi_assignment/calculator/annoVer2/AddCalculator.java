package springdi_assignment.calculator.annoVer2;

import org.springframework.stereotype.Component;

@Component
public class AddCalculator implements Calculator{
	@Override
	public int calculate(int n1, int n2) {
		return n1 + n2;
	}
}
