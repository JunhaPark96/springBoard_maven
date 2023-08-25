package springdi.assignment1.speaker;

public class Speaker {
	private int volume;
	private SpeakerLoc speakerLoc;
	private SpeakerBrand speakerBrand;
	
	public String findByBrand(SpeakerBrand speakerBrand) {
		return speakerBrand.name();
	}
//	getter setter 생략
	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}

	public SpeakerLoc getSpeakerLoc() {
		return speakerLoc;
	}

	public void setSpeakerLoc(SpeakerLoc speakerLoc) {
		this.speakerLoc = speakerLoc;
	}

	public SpeakerBrand getSpeakerBrand() {
		return speakerBrand;
	}

	public void setSpeakerBrand(SpeakerBrand speakerBrand) {
		this.speakerBrand = speakerBrand;
	}
	public Speaker() {
	}
	public Speaker(int volume, SpeakerLoc speakerLoc, SpeakerBrand speakerBrand) {
		this.volume = volume;
		this.speakerLoc = speakerLoc;
		this.speakerBrand = speakerBrand;
	}
	
	
}
