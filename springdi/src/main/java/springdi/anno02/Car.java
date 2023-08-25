package springdi.anno02;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;

public class Car {
	@Autowired
	@Resource
	private Tire tire;
	
	@Autowired
	public Car() {
		System.out.println("Car 생성자");
	}
	public Tire getTire() {
		return tire;
	}
	@Resource
	public void setTire(Tire tire) {
		this.tire = tire;
	}
	public void printTireBrand() {
		System.out.println("타이어브랜드는 " + tire.getTireBrand());
	}
}
