package springdi.xml02;

public class Car {
	private Tire tire;
	private Tire spareTire;
	private String carName;
	private int year;
	
	public Car() {
		System.out.println("Car 생성자");
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
		System.out.println("스페어타이어는 " + spareTire.getTireBrand());
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
	
	public Tire getSpareTire() {
		return spareTire;
	}

	public void setSpareTire(Tire spareTire) {
		this.spareTire = spareTire;
	}

	@Override
	public String toString() {
		return "Car [tire=" + tire + ", spareTire=" + spareTire + ", carName=" + carName + ", year=" + year + "]";
	}

	
}
