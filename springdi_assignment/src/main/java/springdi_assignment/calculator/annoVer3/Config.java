package springdi_assignment.calculator.annoVer3;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@ComponentScan(basePackages = {"springdi_assignment.calculator.annoVer3"})
@Configuration
public class Config {
//	
//	@Bean
//    public MyCalculator myCalculator(@Qualifier("sub") Calculator calculator) {
//        return new MyCalculator(10, 5, calculator);
//    }
//	@Bean
//	public AddCalculator addCalculator() {
//		return new AddCalculator();
//	}
//	@Bean
//	public SubCalculator subCalculator() {
//		return new SubCalculator();
//	}
//	@Bean
//	public MulCalculator mulCalculator() {
//		return new MulCalculator();
//	}
//	@Bean
//	public DivCalculator divCalculator() {
//		return new DivCalculator();
//	}
//	
	
}
