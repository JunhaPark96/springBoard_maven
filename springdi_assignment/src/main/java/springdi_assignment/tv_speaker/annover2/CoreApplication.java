package springdi_assignment.tv_speaker.annover2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class CoreApplication {

	public static void main(String[] args) {
		ApplicationContext ac= new GenericXmlApplicationContext("tv_speaker3.xml");
		
		SamsungTV ltv =  ac.getBean("samsung", SamsungTV.class);
		System.out.println(ltv.toString());
		ltv.turnon();
		ltv.printSpeakerBrand();
		ltv.volumeup();
		ltv.volumedown();
		ltv.turnoff();
	}

}
