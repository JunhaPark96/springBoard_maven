package springdi.assignment1.tv;

public interface TVService {
	public boolean turnon();
	public boolean turnoff();
	public TV volumeUp(int volume);
	public TV volumeDown(int volume);
	public String printSpeakerBrand();
}
