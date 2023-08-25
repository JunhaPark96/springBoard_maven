package springdi.assignment1.speaker;

public interface SpeakerService {
	public void volumeUp(SpeakerLoc speakerLoc);
	public void volumeDown(SpeakerLoc speakerLoc );
	public String getBrand(SpeakerBrand speakerBrand);
}
