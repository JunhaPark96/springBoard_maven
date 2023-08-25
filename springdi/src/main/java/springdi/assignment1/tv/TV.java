package springdi.assignment1.tv;

import springdi.assignment1.speaker.Speaker;

public class TV {
	private Speaker speaker;
	private boolean power;
	private int volume;
	private TVBrand brandName;
	
	
	public Speaker getSpeaker() {
		return speaker;
	}
	public void setSpeaker(Speaker speaker) {
		this.speaker = speaker;
	}
	public boolean isPower() {
		return power;
	}
	public void setPower(boolean power) {
		this.power = power;
	}
	public int getVolume() {
		return volume;
	}
	public void setVolume(int volume) {
		this.volume = volume;
	}
	public TVBrand getBrandName() {
		return brandName;
	}
	public void setBrandName(TVBrand brandName) {
		this.brandName = brandName;
	}
	
	
}
