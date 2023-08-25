package springdi.anno04;

import org.springframework.stereotype.Component;

@Component("h1")
public class HankookTire implements Tire{
	public String getTireBrand() {
		return "한국타이어";
	}

}
