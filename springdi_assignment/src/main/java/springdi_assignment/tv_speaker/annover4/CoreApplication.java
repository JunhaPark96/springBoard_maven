package springdi_assignment.tv_speaker.annover4;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class CoreApplication {
	public static void main(String[] args) {
		ApplicationContext ac= new AnnotationConfigApplicationContext(springdi_assignment.tv_speaker.annover4.Config.class);
		
		SamsungTV ltv =  ac.getBean("SamsungTV", SamsungTV.class);
		System.out.println(ltv.toString());
		ltv.turnon();
		ltv.printSpeakerBrand();
		ltv.volumeup();
		ltv.volumedown();
		ltv.turnoff();
		
	}

}
