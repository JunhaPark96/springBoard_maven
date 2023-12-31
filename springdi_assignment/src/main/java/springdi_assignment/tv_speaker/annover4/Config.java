package springdi_assignment.tv_speaker.annover4;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@ComponentScan(basePackages = {"springdi_assignment.tv_speaker.annover4"})
@Configuration
public class Config {
//	@Qualifier("samsung")
//	@Bean
//	public SamsungTV samsungTV() {
//		return new SamsungTV();
//	}
//	
//	@Qualifier("LG")
//	@Bean
//	public LGTV LGTV() {
//		return new LGTV();
//	}
	@Qualifier("abc")
	@Bean
	public ABCspeaker abcSpeaker() {
		return new ABCspeaker();
	}
	@Qualifier("xyz")
	@Bean
	public XYZspeaker xyzSpeaker() {
		return new XYZspeaker();
	}
}
