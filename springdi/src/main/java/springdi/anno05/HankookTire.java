package springdi.anno05;

import org.springframework.stereotype.Component;

@Component("h1")
public class HankookTire implements Tire{
	@Override
	public String getTireBrand() {
		return "한국타이어";
	}

}
