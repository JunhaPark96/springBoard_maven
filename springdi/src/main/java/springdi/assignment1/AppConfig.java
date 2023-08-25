//package springdi.assignment1;
//
//import springdi.assignment1.speaker.Speaker;
//import springdi.assignment1.speaker.SpeakerLoc;
//import springdi.assignment1.speaker.SpeakerRepository;
//import springdi.assignment1.speaker.SpeakerService;
//import springdi.assignment1.speaker.SpeakerServiceImpl;
//
//public class AppConfig {
//	public SpeakerService speakerService() {
//		System.out.println("call appConfig.speakerService");
//		return new SpeakerServiceImpl(speakerRepository());
//	}
//	public SpeakerRepository speakerRepository() {
//		System.out.println("Call appConfig.speakerRepository");
//		return new Speaker();
//			
//	}
//}
