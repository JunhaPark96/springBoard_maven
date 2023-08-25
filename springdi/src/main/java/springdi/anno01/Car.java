package springdi.anno01;

import org.springframework.beans.factory.annotation.Autowired;

public class Car {
	@Autowired
	private Tire tire;
	
	@Autowired
	public Car() {
		System.out.println("Car 생성자");
	}
	public Tire getTire() {
		return tire;
	}
	@Autowired
	public void setTire(Tire tire) {
		this.tire = tire;
	}
	public void printTireBrand() {
		System.out.println("타이어브랜드는 " + tire.getTireBrand());
	}
}
