package springdi_assignment.tv_speaker.xmlver;

public class LGTV implements TVService{
	private SpeakerService leftSpeaker;
	private SpeakerService rightSpeaker;
	
	public LGTV() {
		super();
	}

	public LGTV(SpeakerService leftSpeaker, SpeakerService rightSpeaker) {
		super();
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

	public void turnon() {
		System.out.println("TV 전원 켜짐");
	}

	public void turnoff() {
		System.out.println("TV 전원 꺼짐");
		
	}

	public void volumeup() {
		System.out.println("TV 볼륨 키우기");
		System.out.print("왼쪽 스피커");
		leftSpeaker.volumeup();
		System.out.print("오른쪽 스피커");
		rightSpeaker.volumeup();
	}

	public void volumedown() {
		System.out.println("TV 볼륨 낮추기");
		System.out.print("왼쪽 스피커");
		leftSpeaker.volumedown();
		System.out.print("오른쪽 스피커");
		rightSpeaker.volumedown();
	}

	public void printSpeakerBrand() {
		System.out.println("왼쪽스피커는 " + leftSpeaker.getBrand());
		System.out.println("오른쪽 스피커는 " + rightSpeaker.getBrand());
	}

	@Override
	public String toString() {
		return "LGTV [leftSpeaker=" + leftSpeaker + ", rightSpeaker=" + rightSpeaker + "]";
	}
	
}
