package springdi_assignment.tv_speaker.xmlver;

public class TV {
	private SpeakerService leftSpeaker;
	private SpeakerService rightSpeaker;
	private String brandName;
	
	public TV(SpeakerService leftSpeaker, SpeakerService rightSpeaker, String brandName) {
		super();
		this.leftSpeaker = leftSpeaker;
		this.rightSpeaker = rightSpeaker;
		this.brandName = brandName;
	}
	public TV() {
		super();
	}
	public TV(SpeakerService leftSpeaker, SpeakerService rightSpeaker) {
		this.leftSpeaker = leftSpeaker;
		this.rightSpeaker = rightSpeaker;
	}
	public SpeakerService getLeftSpeaker() {
		return leftSpeaker;
	}
	public void setLeftSpeaker(SpeakerService leftSpeaker) {
		this.leftSpeaker = leftSpeaker;
	}
	public SpeakerService getRightSpeaker() {
		return rightSpeaker;
	}
	public void setRightSpeaker(SpeakerService rightSpeaker) {
		this.rightSpeaker = rightSpeaker;
	}
	public String getBrandName() {
		return brandName;
	}
	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

}
