package springdi.di;

public class DriverMain {

	public static void main(String[] args) {
		Car car = new Car();
		HankookTire ht = new HankookTire();
		KumhoTire kt = new KumhoTire();
		
		car.setTire(ht); // setter를 통한 DI
		car.printTireBrand();
		
		Car car2 = new Car(kt);
		car2.printTireBrand();
	}

}
