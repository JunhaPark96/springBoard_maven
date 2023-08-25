package springdi.anno05;

import javax.annotation.Resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Car {
	private Tire tire;
	
	public Car() {
	}
	
	@Autowired
	public Car(@Qualifier("kumhoTire") Tire t) {
		this.tire = t;
		System.out.println("Car 생성자");
	}
	public Tire getTire() {
		return tire;
	}
	public void setTire(Tire tire) {
		this.tire = tire;
	}
	public void printTireBrand() {
		System.out.println("타이어브랜드는 " + tire.getTireBrand());
	}
}
