package springdi.xml01;

import java.util.List;
import java.util.Map;

public class Car {
	private Tire tire;
	private String carName;
	private int year;
	private List<String> drivers;
	private Map<Integer, String> person; 
	
	public Map<Integer, String> getPerson() {
		return person;
	}
	public void setPerson(Map<Integer, String> person) {
		this.person = person;
	}
	public Car() {
		System.out.println("Car 생성자");
	}
	public Car(Tire tire) {
		this.tire = tire;
		System.out.println("Tire T 생성자");
	}

	public Car(Tire tire, String carName) {
		this.tire = tire;
		this.carName = carName;
		System.out.println("Tire, carName 생성자");
	}
	

	public Car(Tire tire, String carName, int year) {
		this.tire = tire;
		this.carName = carName;
		this.year = year;
		System.out.println("Tire, carName, year 생성자");
	}
	
	
	public Car(Map<Integer, String> person) {
		super();
		this.person = person;
	}
	public Car(List<String> drivers) {
		this.drivers = drivers;
	}
	public List<String> getDrivers() {
		return drivers;
	}
	public void setDrivers(List<String> drivers) {
		this.drivers = drivers;
	}
	public Tire getTire() {
		return tire;
	}
	public void setTire(Tire tire) {
		System.out.println("set 타이어");
		this.tire = tire;
	}
	public void printTireBrand() {
		System.out.println("타이어브랜드는 " + tire.getTireBrand());
	}

	public String getCarName() {
		return carName;
	}

	public void setCarName(String carName) {
		this.carName = carName;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}
	@Override
	public String toString() {
		return "Car [tire=" + tire + ", carName=" + carName + ", year=" + year + ", drivers=" + drivers + ", person="
				+ person + "]";
	}
	
}
