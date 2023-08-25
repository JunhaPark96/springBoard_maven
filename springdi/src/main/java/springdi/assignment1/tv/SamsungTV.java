package springdi.assignment1.tv;

public class SamsungTV implements TVService{

	@Override
	public boolean turnon() {
		return true;
	}

	@Override
	public boolean turnoff() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public TV volumeUp(int volume) {
		return null;
	}

	@Override
	public TV volumeDown(int volume) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String printSpeakerBrand() {
		// TODO Auto-generated method stub
		return null;
	}



}
