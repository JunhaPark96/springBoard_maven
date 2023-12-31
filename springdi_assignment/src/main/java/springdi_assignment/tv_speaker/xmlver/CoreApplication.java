package springdi_assignment.tv_speaker.xmlver;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class CoreApplication {

	public static void main(String[] args) {
		ApplicationContext ac= new GenericXmlApplicationContext("tv_speaker3.xml");
		
//		SamsungTV stv = (SamsungTV) ac.getBean("tv");
//		System.out.println(stv.toString());
//		stv.turnon();
//		stv.printSpeakerBrand();
//		stv.volumeup();
//		stv.volumedown();
//		stv.turnoff();
		
		LGTV ltv =  ac.getBean("tv", LGTV.class);
		System.out.println(ltv.toString());
		ltv.turnon();
		ltv.printSpeakerBrand();
		ltv.volumeup();
		ltv.volumedown();
		ltv.turnoff();
		
		
	}

}
