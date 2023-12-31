package springdi_assignment.tv_speaker.annover2;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class LGTV implements TVService{
	@Qualifier("abc")
	@Autowired
	private SpeakerService leftSpeaker;
	private SpeakerService rightSpeaker;
	
	public LGTV() {
		super();
	}

	@Autowired
	public LGTV(SpeakerService leftSpeaker, SpeakerService rightSpeaker) {
		this.leftSpeaker = leftSpeaker;
		this.rightSpeaker = rightSpeaker;
	}

	public SpeakerService getLeftSpeaker() {
		return leftSpeaker;
	}

	@Resource
	public void setLeftSpeaker(SpeakerService leftSpeaker) {
		this.leftSpeaker = leftSpeaker;
	}

	public SpeakerService getRightSpeaker() {
		return rightSpeaker;
	}

	@Resource
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
